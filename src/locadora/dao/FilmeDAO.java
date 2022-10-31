/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import locadora.model.Filme;
import java.sql.ResultSet;

/**
 *
 * @author vinic
 */
public class FilmeDAO {
    
    public void cadastrarFilme(Filme filme) throws ExceptionDAO {
        
        String sql = "INSERT INTO filme (titulo, genero, sinopse, duracao) VALUE (?, ?, ?, ? )";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, filme.getTitulo());
            pStatement.setString(2, filme.getGenero());
            pStatement.setString(3, filme.getSinopse());
            pStatement.setInt(4, filme.getDuracao());
            pStatement.execute();
            
        } catch (SQLException erro) {
            throw new ExceptionDAO("Erro ao cadastrar o filme: " + erro);
            
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
    
    public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDAO {
        
        String sql = "SELECT * FROM filme WHERE titulo LIKE '%" + nome + "%' ORDER BY titulo";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Filme> filmes = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if (rs!= null){
                filmes = new ArrayList<Filme>();
                while(rs.next()){
                    Filme filme = new Filme();
                    filme.setCodFilme(rs.getInt("codFilme"));
                    filme.setTitulo(rs.getString("titulo"));
                    filme.setGenero(rs.getString("genero"));
                    filme.setSinopse(rs.getString("sinopse"));
                    filme.setDuracao(rs.getInt("duracao"));
                    filmes.add(filme);
                }
            }
                    
        } catch (SQLException erro){
            throw new ExceptionDAO("Erro ao consultar o filme: " + erro);
     
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
        return filmes;  
    }
    
    public void alterarFilme(Filme filme) throws ExceptionDAO {
        String sql = "UPDATE filme set titulo = ?, genero = ?, sinopse = ?, duracao = ? WHERE codFilme = ?";
        Connection connection = null;
        PreparedStatement pStatement = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, filme.getTitulo());
            pStatement.setString(2, filme.getGenero());
            pStatement.setString(3, filme.getSinopse());
            pStatement.setInt(4, filme.getDuracao());
            pStatement.setInt(5, filme.getCodFilme());
            pStatement.execute();
            
        } catch (SQLException erro){
            throw new ExceptionDAO("Erro ao alterar o filme: " + erro);
     
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
    }
    
     public void apagarFilme(Filme filme) throws ExceptionDAO {
        
        String sql = "DELETE FROM filme WHERE codFilme = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, filme.getCodFilme());
            pStatement.execute();
            
        } catch (SQLException erro) {
            throw new ExceptionDAO("Erro ao apagar o filme: " + erro);
            
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
