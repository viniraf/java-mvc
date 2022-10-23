/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import locadora.model.Cliente;

/**
 *
 * @author vinic
 */
public class ClienteDAO {
    
    public void cadastrarCliente (Cliente cliente) throws ExceptionDAO {
    
        String sql = "INSERT INTO cliente (nome, cpf, email, endereco, dtnascimento) VALUE (?, ?, ?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
         try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getNome());
            pStatement.setString(2, cliente.getCpf());
            pStatement.setString(3, cliente.getEmail());
            pStatement.setString(4, cliente.getEndereco());
            pStatement.setDate(5, new Date(cliente.getDtNascimento().getTime()));
            pStatement.execute();
            
        } catch(SQLException erro){
            throw new ExceptionDAO ("Erro ao cadastrar Ator: " + erro);
                            
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
