/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vinic
 */
public class Cliente {
    private Integer codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Date dtNascimento;
    private ArrayList<Item> itens = new ArrayList<Item>(); 
}
