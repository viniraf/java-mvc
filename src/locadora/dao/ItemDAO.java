/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
}
