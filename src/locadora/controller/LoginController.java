/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import javax.swing.JOptionPane;
import locadora.dao.ExceptionDAO;
import locadora.dao.UsuarioDAO;
import locadora.model.Usuario;
import locadora.view.TelaLoginUsuario;
import locadora.view.TelaPrincipal;

/**
 *
 * @author vinic
 */
public class LoginController {
    
    private TelaLoginUsuario view;

    public LoginController(TelaLoginUsuario view) {
        this.view = view;
    }

    public void autenticar() throws ExceptionDAO {
        
        // Buscar um usuario da view
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario (usuario, senha);
        
        
        // Verificar se existe no banco de dados
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        boolean existe = usuarioDAO.existeNoBancoPorUsuarioESenha(usuarioAutenticar);
        
        // Se existir, direciona para tela principal
        
        if(existe) {
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
            view.dispose();
        } else {
            JOptionPane.showMessageDialog(view, "Usuario ou senha inválidos");
        }
        
       
    }
    
    
}
