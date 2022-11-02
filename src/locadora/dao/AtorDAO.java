/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import locadora.model.Ator;
import java.sql.ResultSet;
import java.util.Set;

/**
 *
 * @author vinic
 */
public class AtorDAO {
    
    public void cadastrarAtor (Ator ator) throws ExceptionDAO {
        
        String sql = "INSERT INTO ator (nome, nacionalidade) VALUE (?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, ator.getNome());
            pStatement.setString(2, ator.getNacionalidade());
            pStatement.execute();
            
        } catch(SQLException erro){
            throw new ExceptionDAO ("Eroo ao cadastrar Ator: " + erro);
            
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
    
    public ArrayList<Ator> listarAtores(String nome) throws ExceptionDAO {
        
        String sql = "SELECT * FROM ator WHERE nome LIKE '%" + nome + "%' ORDER BY nome";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Ator> atores = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if (rs!=null){
                atores = new ArrayList<Ator>();
                while(rs.next()){
                    Ator ator = new Ator();
                    ator.setCodAtor(rs.getInt("codAtor"));
                    ator.setNome(rs.getString("nome"));
                    ator.setNacionalidade(rs.getString("nacionalidade"));
                    atores.add(ator);
                }
            }
            
        } catch(SQLException erro){
            throw new ExceptionDAO ("Erro ao consultar atores: " + erro);
            
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
        
        
        return atores;
    }
    
    
    public void alterarAtor (Ator ator) throws ExceptionDAO {
        
        String sql = "UPDATE ator SET nome = ?, nacionalidade = ? WHERE codAtor = ? ";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, ator.getNome());
            pStatement.setString(2, ator.getNacionalidade());
            pStatement.setInt(3, ator.getCodAtor());
            pStatement.execute();
            
        } catch(SQLException erro){
            throw new ExceptionDAO ("Erro ao atualizar Ator: " + erro);
            
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
    
     public void apagarAtor (Ator ator) throws ExceptionDAO {
        
        String sql = "DELETE FROM ator WHERE codAtor = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, ator.getCodAtor());
            
            pStatement.execute();
            
        } catch(SQLException erro){
            throw new ExceptionDAO ("Erro ao apagar Ator: " + erro);
            
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
}
