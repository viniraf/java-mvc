/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.util.Date;
import locadora.dao.ExceptionDAO;
import locadora.dao.ItemDAO;

/**
 *
 * @author vinic
 */
public class Item {
    private Integer codItem;
    private double preco;
    private String tipo;
    private Date dataLocacao;
    private Date dataDevolucao;
    private Filme filme;
    private Cliente cliente;
    
    // Construtor vazio
    public Item() {
        
    }
    
    // Construtor com parametros
    public Item(Integer codFilme, String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
        Filme filme = new Filme();
        filme.setCodFilme(codFilme);
        this.filme = filme;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Filme getFilme() {
        return filme;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void cadastrarItem(Item item) throws ExceptionDAO {
        new ItemDAO().cadastrarItem(item);
    }
}
