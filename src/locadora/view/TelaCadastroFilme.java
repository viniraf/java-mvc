/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import locadora.controller.FilmeController;

/**
 *
 * @author vinic
 */
public class TelaCadastroFilme extends javax.swing.JFrame {

     private TelaPrincipal telaPrincipal;
     private Integer codFilme = 0;
    
    /**
     * Creates new form TelaCadastroAtor
     */
    public TelaCadastroFilme() {
        initComponents();
    }

    public TelaCadastroFilme(TelaPrincipal telaPrincipal){
        this.telaPrincipal = telaPrincipal;
        initComponents();
                
    }
    
    public void limparTela(){
        this.codFilme = 0;
        jTextFieldTitulo.setText("");
        jComboBoxGenero.setSelectedIndex(0);
        jTextAreaSinopse.setText("");
        jSpinnerDuracao.setModel(new SpinnerNumberModel(20, 20, 300, 10));
    }
    
    public void buscarFilme (Integer codFilme, String titulo, String genero, String sinopse, Integer duracao) {
        this.codFilme = codFilme;
        this.jTextFieldTitulo.setText(titulo);
        for(int contador = 0; contador < jComboBoxGenero.getItemCount(); contador++){
            if(jComboBoxGenero.getItemAt(contador).equals(genero)) {
                jComboBoxGenero.setSelectedIndex(contador);
            }
        }
        this.jTextAreaSinopse.setText(sinopse);
        this.jSpinnerDuracao.setValue(duracao);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloCadastro = new javax.swing.JLabel();
        jPanelCadastroFilme = new javax.swing.JPanel();
        jLabelTituloFilme = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabelGenero = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabelSinopse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSinopse = new javax.swing.JTextArea();
        jSpinnerDuracao = new javax.swing.JSpinner();
        jLabelDuracao = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultaFilme = new javax.swing.JButton();
        jLabelTextoMinutosDuracao = new javax.swing.JLabel();
        jButtonApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Hora da Pipoca");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharTelaCadastroFilme(evt);
            }
        });

        jLabelTituloCadastro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTituloCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jLabelTituloCadastro.setText("Cadastro de Filme");

        jPanelCadastroFilme.setBackground(new java.awt.Color(102, 102, 102));

        jLabelTituloFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloFilme.setText("Título:");

        jTextFieldTitulo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldTitulo.setToolTipText("Informe o título do filme");

        jLabelGenero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGenero.setText("Gênero:");

        jComboBoxGenero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um gênero", "Ação", "Animação", "Aventura", "Cinema de arte", "Chanchada", "Comédia", "Comédia romântica", "Comédia dramática", "Comédia de ação", "Dança", "Documentário", "Docuficção", "Drama", "Espionagem", "Faroeste", "Fantasia científica", "Ficção científica", "Filmes de guerra", "Musical", "Filme policial", "Romance", "Seriado", "Suspense", "Terror" }));
        jComboBoxGenero.setToolTipText("Escolha um gênero");

        jLabelSinopse.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelSinopse.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSinopse.setText("Sinopse:");

        jTextAreaSinopse.setColumns(20);
        jTextAreaSinopse.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextAreaSinopse.setRows(5);
        jTextAreaSinopse.setToolTipText("Informe a sinopse do filme");
        jScrollPane1.setViewportView(jTextAreaSinopse);

        jSpinnerDuracao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jSpinnerDuracao.setModel(new javax.swing.SpinnerNumberModel(20, 20, 300, 10));
        jSpinnerDuracao.setToolTipText("");
        jSpinnerDuracao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelDuracao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDuracao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDuracao.setText("Duração:");

        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConsultaFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsultaFilme.setText("Consultar");
        jButtonConsultaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaConsultaFilme(evt);
            }
        });

        jLabelTextoMinutosDuracao.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelTextoMinutosDuracao.setText("minutos");

        jButtonApagar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroFilmeLayout = new javax.swing.GroupLayout(jPanelCadastroFilme);
        jPanelCadastroFilme.setLayout(jPanelCadastroFilmeLayout);
        jPanelCadastroFilmeLayout.setHorizontalGroup(
            jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSinopse)
                    .addComponent(jLabelGenero)
                    .addComponent(jLabelTituloFilme)
                    .addComponent(jLabelDuracao))
                .addGap(29, 29, 29)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultaFilme)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonApagar))
                    .addComponent(jTextFieldTitulo)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                        .addComponent(jSpinnerDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTextoMinutosDuracao))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelCadastroFilmeLayout.setVerticalGroup(
            jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloFilme)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenero)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSinopse)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDuracao)
                            .addComponent(jSpinnerDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroFilmeLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabelTextoMinutosDuracao)))
                .addGap(69, 69, 69)
                .addGroup(jPanelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConsultaFilme)
                    .addComponent(jButtonApagar))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabelTituloCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabelTituloCadastro)
                .addGap(18, 18, 18)
                .addComponent(jPanelCadastroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int duracao = Integer.parseInt(jSpinnerDuracao.getValue().toString());
        String genero = jComboBoxGenero.getSelectedItem().toString();
        boolean sucesso;
        
        try {
            FilmeController filmeController = new FilmeController();
            
            if(this.codFilme == 0) {
                sucesso = filmeController.cadastrarFilme(jTextFieldTitulo.getText(), genero, jTextAreaSinopse.getText(), duracao);
            } else {
                sucesso = filmeController.alterarFilme(this.codFilme, jTextFieldTitulo.getText(), genero, jTextAreaSinopse.getText(), duracao);
            }
            
            if (sucesso && this.codFilme == 0){
                JOptionPane.showMessageDialog(null, "O filme foi cadastrado com sucesso!");
                this.limparTela();
            } else if (sucesso && this.codFilme != 0){
                JOptionPane.showMessageDialog(null, "O filme foi atualizado com sucesso!");
                this.limparTela();
            } else {
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente");
            }    
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void abrir_telaConsultaFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaConsultaFilme
        TelaConsultaFilme telaConsultaFilme = new TelaConsultaFilme((JFrame) this);
        telaConsultaFilme.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_abrir_telaConsultaFilme

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        boolean sucesso;
        FilmeController filmeController = new FilmeController();
        
        try {
            sucesso = filmeController.apagarFilme(this.codFilme);
            if (sucesso){
                JOptionPane.showMessageDialog(null, "Filme apagado com sucesso");
                this.limparTela();
            } else {
                 JOptionPane.showMessageDialog(null, "Erro ao apagar filme, por favor, selecione um filme!");
            }
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void fecharTelaCadastroFilme(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharTelaCadastroFilme
        this.dispose();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_fecharTelaCadastroFilme

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        this.dispose();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultaFilme;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabelDuracao;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelSinopse;
    private javax.swing.JLabel jLabelTextoMinutosDuracao;
    private javax.swing.JLabel jLabelTituloCadastro;
    private javax.swing.JLabel jLabelTituloFilme;
    private javax.swing.JPanel jPanelCadastroFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerDuracao;
    private javax.swing.JTextArea jTextAreaSinopse;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
