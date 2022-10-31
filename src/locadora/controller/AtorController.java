/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.model.Ator;

/**
 *
 * @author vinic
 */
public class AtorController {
    
    
    // Método para fazer cadastro e validar se deu tudo certo
    public boolean cadastrarAtor(String nome, String nacionalidade) throws ExceptionDAO{
        
        if (nome != null && nome.length() > 0 && nacionalidade != null && nacionalidade.length() > 0){
            Ator ator = new Ator(nome, nacionalidade);
            ator.cadastrarAtor(ator);
            return true;
        }
        return false;
    }
    
    public ArrayList<Ator> listarAtores (String nome) throws ExceptionDAO {
        return new Ator().listarAtores(nome);
    }
    
     public boolean alterarAtor(int codAtor, String nome, String nacionalidade) throws ExceptionDAO{
        
        if (nome != null && nome.length() > 0 && nacionalidade != null && nacionalidade.length() > 0){
            Ator ator = new Ator(nome, nacionalidade);
            ator.setCodAtor(codAtor);
            ator.alterarAtor(ator);
            return true;
        }
        return false;
    }
}
