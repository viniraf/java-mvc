/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.model.Filme;

/**
 *
 * @author vinic
 */
public class FilmeController {
    
    // Método para fazer cadastro e validar se deu tudo certo
    public boolean cadastrarFilme(String titulo, String genero, String sinopse, Integer duracao) throws ExceptionDAO{
        if (titulo != null && titulo.length() > 0 && genero != null && genero.length() > 0 && sinopse != null && sinopse.length() > 0 && duracao != null && duracao > 0) {
            Filme filme = new Filme(titulo, genero, sinopse, duracao);
            filme.cadastrarFilme(filme);
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDAO {
        return new Filme().listarFilmes(nome);
    }
    
      public boolean alterarFilme(int codFilme, String titulo, String genero, String sinopse, Integer duracao) throws ExceptionDAO{
        if (titulo != null && titulo.length() > 0 && genero != null && genero.length() > 0 && sinopse != null && sinopse.length() > 0 && duracao != null && duracao > 0) {
            Filme filme = new Filme(titulo, genero, sinopse, duracao);
            filme.setCodFilme(codFilme);
            filme.alterarFilme(filme);
            return true;
        }
        
        return false;
    }
      
      public boolean apagarFilme(int codFilme) throws ExceptionDAO {
          if (codFilme == 0){
              return false;
          } else {
              Filme filme = new Filme();
              filme.setCodFilme(codFilme);
              filme.apagarFilme(filme);
              return true;
          }
      }
}
