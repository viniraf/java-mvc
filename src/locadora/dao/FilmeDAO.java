/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import locadora.model.Filme;

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
}
