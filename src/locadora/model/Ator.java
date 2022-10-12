/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class Ator {
    private Integer codAtor;
    private String nome;
    private String nacionalidade;
    private ArrayList<Filme> filmes = new ArrayList<Filme>();
    
    // Construtor padrão vazio
    public Ator(){
        
    }
    
    // Construtor com parametros
    public Ator (String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    
    // Getters
    
    public Integer getCodAtor() {
        return codAtor;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    
    // Setters
    
    public void setCodAtor(Integer codAtor) {
        this.codAtor = codAtor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    
    // Método para cadastrar o ator - vai salvar o ator no banco de dados
    public void cadastrarAtor(Ator ator) {
        
    }
}
