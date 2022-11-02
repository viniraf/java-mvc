/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import locadora.controller.ItemController;
import locadora.dao.ExceptionDAO;
import locadora.model.Item;

/**
 *
 * @author vinic
 */
public class TelaConsultaItem extends javax.swing.JFrame {

    
    private JFrame telaCadastro;
    /**
     * Creates new form TelaConsultaItem
     */
    public TelaConsultaItem() {
        initComponents();
    }
    
    public TelaConsultaItem(JFrame telaCadastroItem) {
        this.telaCadastro = telaCadastroItem;
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

        jPanelConsultaItem = new javax.swing.JPanel();
        jLabelTituloFilme = new javax.swing.JLabel();
        jTextFieldTituloFilme = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaItem = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video Locadora Hora da Pipoca");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar_consultaItem(evt);
            }
        });

        jPanelConsultaItem.setBackground(new java.awt.Color(102, 102, 102));

        jLabelTituloFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloFilme.setText("Informe o título do filme:");

        jTextFieldTituloFilme.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldTituloFilme.setToolTipText("Informe o título do filme a ser consultado");

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_item(evt);
            }
        });

        jTableConsultaItem.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableConsultaItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código Item", "Código Filme", "Título", "Tipo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaItem);

        javax.swing.GroupLayout jPanelConsultaItemLayout = new javax.swing.GroupLayout(jPanelConsultaItem);
        jPanelConsultaItem.setLayout(jPanelConsultaItemLayout);
        jPanelConsultaItemLayout.setHorizontalGroup(
            jPanelConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaItemLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanelConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelConsultaItemLayout.createSequentialGroup()
                        .addComponent(jLabelTituloFilme)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jButtonConsultar)))
                .addGap(49, 49, 49))
        );
        jPanelConsultaItemLayout.setVerticalGroup(
            jPanelConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaItemLayout.createSequentialGroup()
                .addGroup(jPanelConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaItemLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanelConsultaItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTituloFilme)
                            .addComponent(jTextFieldTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelConsultaItemLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jLabelTitulo.setText("Consulta de Item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultaItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConsultaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fechar_consultaItem(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar_consultaItem
        this.dispose();
        this.telaCadastro.setVisible(true);
    }//GEN-LAST:event_fechar_consultaItem

    private void consultar_item(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_item
        String titulo = jTextFieldTituloFilme.getText();
        
        DefaultTableModel tableModel = (DefaultTableModel) jTableConsultaItem.getModel();
        tableModel.setRowCount(0);
        ItemController itemController = new ItemController();
        
        try {
            ArrayList<Item> itens =  itemController.listarItens(titulo);
            itens.forEach((Item item) -> {
                tableModel.addRow(new Object[] {
                    item.getCodItem(),
                    item.getFilme().getCodFilme(),
                    item.getFilme().getTitulo(),
                    item.getTipo(),
                    item.getPreco()
                });                                       
            });
            
            jTableConsultaItem.setModel(tableModel);
                  
        } catch (ExceptionDAO erro){
          JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }//GEN-LAST:event_consultar_item

    private void jTableConsultaItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaItemMouseClicked
        if(evt.getClickCount() == 2) {
            Integer codItem = (Integer) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 0);
            Integer codFilme = (Integer) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 1);
            String titulo = (String) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 2);
            String tipo = (String) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 3);
            String preco = String.valueOf(jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 4));
            
            TelaCadastroItem telaCadastroItem = (TelaCadastroItem) this.telaCadastro;
            telaCadastroItem.buscarItem(codItem, codFilme, titulo, tipo, preco);
            telaCadastroItem.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jTableConsultaItemMouseClicked

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
            java.util.logging.Logger.getLogger(TelaConsultaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloFilme;
    private javax.swing.JPanel jPanelConsultaItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaItem;
    private javax.swing.JTextField jTextFieldTituloFilme;
    // End of variables declaration//GEN-END:variables
}