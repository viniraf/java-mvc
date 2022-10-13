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
public class Filme {
    
    private Integer codFilme;
    private String titulo;
    private String genero;
    private String sinopse;
    private Integer duracao;
    private ArrayList<Item> itens = new ArrayList<Item>();
    private ArrayList<Ator> atores = new ArrayList<Ator>();
    
     // Construtor padrão vazio
    public Filme(){
        
    }
    
    // Construtor com parametros
    public Filme (String titulo, String genero, String sinopse, Integer duracao  ) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    // Getters
    
    public Integer getCodFilme() {
        return codFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    
    //Setters 
    
    public void setCodFilme(Integer codFilme) {
        this.codFilme = codFilme;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void setAtores(ArrayList<Ator> atores) {
        this.atores = atores;
    }
    
    public void cadastrarFilme(Filme filme){
        
    }
    
    
}
