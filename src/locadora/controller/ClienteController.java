/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import locadora.dao.ExceptionDAO;
import locadora.model.Cliente;

/**
 *
 * @author vinic
 */
public class ClienteController {
    
    
    public boolean cadastrarCliente(String nome, String cpf, String email, String endereco, String dtNascimento) throws ParseException, ExceptionDAO{
        
        if (nome != null && nome.length() > 0 && validarCPF(cpf) && email != null && email.length() > 0 && endereco != null 
                && endereco.length() > 0 && validarData(dtNascimento)){
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dtNascimento);
            Cliente cliente = new Cliente(nome, cpf, email, endereco, data);
            cliente.cadastrarCliente(cliente);
            return true;
        }
        return false;
    }
    
    public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO {
        return new Cliente().listarClientes(nome);
    }
    
    public boolean alterarCliente(int codCliente, String nome, String cpf, String email, String endereco, String dtNascimento) throws ParseException, ExceptionDAO{
        
        if (nome != null && nome.length() > 0 && validarCPF(cpf) && email != null && email.length() > 0 && endereco != null 
                && endereco.length() > 0 && validarData(dtNascimento)){
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dtNascimento);
            Cliente cliente = new Cliente(nome, cpf, email, endereco, data);
            cliente.setCodCliente(codCliente);
            cliente.alterarCliente(cliente);
            return true;
        }
        return false;
    }

    // Metodo validação campo cpf
    public boolean validarCPF(String cpf){
        for(int i = 0; i< cpf.length(); i++){
            if(! Character.isDigit(cpf.charAt(i))){
                if(!( i==3 || i==7 || i==11))
                    return false;
            }   
        }
        return true;
    }  
    
    // Metodo validação campo data
    public boolean validarData(String data){
        for(int i = 0; i< data.length(); i++){
            if(! Character.isDigit(data.charAt(i))){
                if(!( i==2 || i==5))
                    return false;
            }   
        }
        return true;
    }  
    
    
}
