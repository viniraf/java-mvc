/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import locadora.model.Usuario;


/**
 *
 * @author vinic
 */
public class UsuarioDAO {

    public boolean existeNoBancoPorUsuarioESenha(Usuario usuario) throws ExceptionDAO {
        String sql = "SELECT * FROM usuario WHERE usuario = ? and senha = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, usuario.getUsuario());
            pStatement.setString(2, usuario.getSenha());

            pStatement.execute();
            
            ResultSet rs = pStatement.getResultSet();
            
            return rs.next();
            
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
    

