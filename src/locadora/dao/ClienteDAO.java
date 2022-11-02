/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import locadora.model.Cliente;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

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
            throw new ExceptionDAO ("Erro ao cadastrar cliente: " + erro);
                            
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
    
    public ArrayList<Cliente> listarClientes(String nome)throws ExceptionDAO {
        String sql = "SELECT * FROM cliente WHERE nome LIKE '%" + nome + "%' ORDER BY nome";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Cliente> clientes = null;
        
        try {
           connection = new ConnectionMVC().getConnection(); 
           pStatement = connection.prepareStatement(sql);
           ResultSet rs = pStatement.executeQuery(sql);
           
           if (rs!= null){
                clientes = new ArrayList<Cliente>();
                while(rs.next()){
                    Cliente cliente = new Cliente();
                    cliente.setCodCliente(rs.getInt("codCliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setDtNascimento(rs.getDate("dtNascimento"));
                    clientes.add(cliente);

                }
            }
           
           
        } catch (SQLException erro){
            throw new ExceptionDAO ("Erro ao consultar clientes: " + erro);
            
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
        
        return clientes;
      
    }
    
    
    public void alterarCliente (Cliente cliente) throws ExceptionDAO {
    
        String sql = "UPDATE cliente SET nome = ?, CPF = ?, email = ?, endereco = ?, dtnascimento = ? WHERE codCliente = ?";
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
            pStatement.setInt(6, cliente.getCodCliente());
            pStatement.execute();
            
        } catch(SQLException erro){
            throw new ExceptionDAO ("Erro ao alterar cliente: " + erro);
                            
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
    
    public void apagarCliente (Cliente cliente) throws ExceptionDAO {
    
        String sql = "DELETE FROM cliente WHERE codCliente = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
         try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, cliente.getCodCliente());
            pStatement.execute();
            
        } catch(SQLException erro){
            throw new ExceptionDAO ("Erro ao apagar Cliente: " + erro);
                            
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
