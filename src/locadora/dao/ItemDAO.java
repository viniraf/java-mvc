/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import locadora.model.Filme;
import locadora.model.Item;


/**
 *
 * @author vinic
 */
public class ItemDAO {
    
    
    public void cadastrarItem (Item item) throws ExceptionDAO {
        
        String sql = "INSERT INTO item (codFilme, preco, tipo) VALUE (?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, item.getFilme().getCodFilme());
            pStatement.setDouble(2, item.getPreco());
            pStatement.setString(3, item.getTipo());
            pStatement.execute();
            
        } catch(SQLException erro){
            throw new ExceptionDAO ("Erro ao cadastrar Item: " + erro);
            
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                } 
            } catch (SQLException erro) {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + erro);
            }
            
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException erro) {
                throw new ExceptionDAO("Erro ao fechar a conexao: " + erro);
            }
        }
    }
    
    public ArrayList<Item> listarItens(String titulo) throws ExceptionDAO {
        
        String sql = "SELECT it.codItem, it.preco, it.tipo, fi.codFilme, fi.titulo "
                + "FROM item it, filme fi WHERE it.codFilme = fi.codFilme and "
                + "fi.titulo like '%" + titulo + "%' ORDER BY fi.titulo";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Item> itens = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if (rs!= null){
                itens = new ArrayList<>();
                while(rs.next()){
                    Item item = new Item();
                    item.setCodItem(rs.getInt("codItem"));
                    item.setPreco(rs.getDouble("preco"));
                    item.setTipo(rs.getString("tipo"));
                    Filme filme = new Filme();
                    filme.setCodFilme(rs.getInt("codFilme"));
                    filme.setTitulo(rs.getString("titulo"));
                    item.setFilme(filme);
                    itens.add(item);
                }
            }
                    
        } catch (SQLException erro){
            throw new ExceptionDAO("Erro ao consultar o item: " + erro);
     
        } finally {
            
            try {
                if(pStatement!=null) {pStatement.close();}
                
            } catch (SQLException erro) {
                throw new ExceptionDAO("Erro ao fechar o pStatement: " + erro);
            }
            
            try {
                if(connection != null) {connection.close();}
                
            } catch (SQLException erro) {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + erro);
            }
        }   
        return itens;  
    }
    
    public void alterarItem (Item item) throws ExceptionDAO {
        
        String sql = "UPDATE item SET codFilme = ?, preco = ?, tipo = ? WHERE codItem = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, item.getFilme().getCodFilme());
            pStatement.setDouble(2, item.getPreco());
            pStatement.setString(3, item.getTipo());
            pStatement.setInt(4,item.getCodItem());
            pStatement.execute();
            
        } catch(SQLException erro){
            throw new ExceptionDAO ("Erro ao alterar Item: " + erro);
            
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                } 
            } catch (SQLException erro) {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + erro);
            }
            
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException erro) {
                throw new ExceptionDAO("Erro ao fechar a conexao: " + erro);
            }
        }
    }
     
    public void apagarItem(Item item) throws ExceptionDAO {
        
        String sql = "DELETE FROM item WHERE codItem = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, item.getCodItem());
            pStatement.execute();
            
        } catch (SQLException erro) {
            throw new ExceptionDAO("Erro ao apagar o item: " + erro);
            
        } finally {
            
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException erro) {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + erro);
            } try {
                if (connection != null) {
                    connection.close();
                } 
            } catch (SQLException erro) {
                throw new ExceptionDAO("Erro ao fechar conexao: " + erro);
            }
        }
    }
     
     
     
    
}
