/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

/**
 *
 * @author vinic
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuLocacao = new javax.swing.JMenu();
        jMenuItemAlugar = new javax.swing.JMenuItem();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemAtor = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFilme = new javax.swing.JMenuItem();
        jMenuItem = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Locadora ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabelLogo)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabelLogo)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jMenuLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jMenuLocacao.setText("Locação");
        jMenuLocacao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemAlugar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemAlugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemAlugar.setText("Alugar");
        jMenuLocacao.add(jMenuItemAlugar);

        jMenuItemConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar");
        jMenuItemConsultar.setToolTipText("");
        jMenuLocacao.add(jMenuItemConsultar);

        jMenuBarTelaPrincipal.add(jMenuLocacao);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemAtor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemAtor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemAtor.setText("Ator");
        jMenuItemAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaCadastroAtor(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAtor);

        jMenuItemCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_TelaCadastroCliente(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemFilme.setText("Filme");
        jMenuItemFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_TelaCadastroFilme(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFilme);

        jMenuItem.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItem.setText("Item");
        jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaCadastroItem(evt);
            }
        });
        jMenuCadastro.add(jMenuItem);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharTelaPrincipal(evt);
            }
        });
        jMenuBarTelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrir_telaCadastroAtor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaCadastroAtor
        TelaCadastroAtor telaCadastroAtor = new TelaCadastroAtor(this);
        this.setVisible(false);
        telaCadastroAtor.setVisible(true);
        
        
    }//GEN-LAST:event_abrir_telaCadastroAtor

    private void abrir_TelaCadastroFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_TelaCadastroFilme
       TelaCadastroFilme telaCadastroFilme = new TelaCadastroFilme(this);
       this.setVisible(false);
       telaCadastroFilme.setVisible(true);
    }//GEN-LAST:event_abrir_TelaCadastroFilme

    private void abrir_TelaCadastroCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_TelaCadastroCliente
       TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente(this);
       this.setVisible(false);
       telaCadastroCliente.setVisible(true);
    }//GEN-LAST:event_abrir_TelaCadastroCliente

    private void abrir_telaCadastroItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaCadastroItem
       TelaCadastroItem telaCadastroItem = new TelaCadastroItem(this);
       this.setVisible(false);
       telaCadastroItem.setVisible(true);
    }//GEN-LAST:event_abrir_telaCadastroItem

    private void fecharTelaPrincipal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharTelaPrincipal
       System.exit(0);
    }//GEN-LAST:event_fecharTelaPrincipal

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem;
    private javax.swing.JMenuItem jMenuItemAlugar;
    private javax.swing.JMenuItem jMenuItemAtor;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemFilme;
    private javax.swing.JMenu jMenuLocacao;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
