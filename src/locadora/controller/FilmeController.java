/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import locadora.model.Filme;

/**
 *
 * @author vinic
 */
public class FilmeController {
    
    // Método para fazer cadastro e validar se deu tudo certo
    public boolean cadastrarFilme(String titulo, String genero, String sinopse, Integer duracao){
        if (titulo != null && titulo.length() > 0 && genero != null && genero.length() > 0 && sinopse != null && sinopse.length() > 0 && duracao != null && duracao > 0) {
            Filme filme = new Filme(titulo, genero, sinopse, duracao);
            filme.cadastrarFilme(filme);
            return true;
        }
        
        return false;
    }
}
