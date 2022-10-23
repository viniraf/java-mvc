/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import locadora.model.Ator;

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
    
}
