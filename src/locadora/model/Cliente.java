/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vinic
 */
public class Cliente {
    private Integer codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Date dtNascimento;
    private ArrayList<Item> itens = new ArrayList<Item>(); 
    
    // Construtor vazio padrão
    public Cliente (){
        
    }
    
    // Construtor com todos os parâmetros
    public Cliente (String nome, String cpf, String email, String endereco, Date dtNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.dtNascimento = dtNascimento;
    }
 
    // Getters
    
    public Integer getCodCliente() {
        return codCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    // Setters 
    
    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
    // Metodo para cadastrar o cliente
    public void cadastrarCliente(Cliente cliente){
        
    }
    
}
