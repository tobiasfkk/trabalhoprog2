/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vieww;

import DAO.CategoriaDAO;
import Models.Categoria;
import interfaces.CategoriaInterface;
import javax.swing.JOptionPane;

/**
 *
 * @author tobiaskiefer
 */
public class ViewAlterarCategoria extends javax.swing.JFrame {

    /**
     * Creates new form ViewAlterarCategoria
     */
    public ViewAlterarCategoria() {
        initComponents();
        
        CategoriaInterface repositorioCategoria = new CategoriaDAO();
        
        for (Categoria categoria : repositorioCategoria.buscarTodosCategorias()) {
            this.ComboCategoria.addItem(categoria);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CategoriaNome = new javax.swing.JTextField();
        CategoriaDescricao = new javax.swing.JTextField();
        BtnSalvarAlteracao = new javax.swing.JButton();
        BtnDeletar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CategoriaSituacao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Categoria");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALTERAR CATEGORIA");
        jLabel2.setToolTipText("");

        jLabel3.setText("Nome");

        jLabel4.setText("Descrição");
        jLabel4.setToolTipText("");

        CategoriaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaNomeActionPerformed(evt);
            }
        });

        CategoriaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaDescricaoActionPerformed(evt);
            }
        });

        BtnSalvarAlteracao.setText("Salvar Alterações");
        BtnSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarAlteracaoActionPerformed(evt);
            }
        });

        BtnDeletar.setText("Deletar Registro");
        BtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeletarActionPerformed(evt);
            }
        });

        jLabel5.setText("Situação");

        CategoriaSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        CategoriaSituacao.setToolTipText("");
        CategoriaSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaSituacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CategoriaNome)
                            .addComponent(ComboCategoria, 0, 309, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSalvarAlteracao)
                        .addGap(18, 18, 18)
                        .addComponent(BtnDeletar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CategoriaDescricao)
                            .addComponent(CategoriaSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CategoriaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CategoriaSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvarAlteracao)
                    .addComponent(BtnDeletar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoriaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaDescricaoActionPerformed

    private void CategoriaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaNomeActionPerformed

    private void BtnSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarAlteracaoActionPerformed
        Categoria SelectedItem = (Categoria) this.ComboCategoria.getSelectedItem();
        SelectedItem.setNomeCategoria(this.CategoriaNome.getText());
        SelectedItem.setDescricaoCategoria(this.CategoriaDescricao.getText());
    }//GEN-LAST:event_BtnSalvarAlteracaoActionPerformed

    private void ComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategoriaActionPerformed
        //CategoriaDAO repositorioCategoria = new CategoriaDAO();
        Categoria SelectedItem = (Categoria) this.ComboCategoria.getSelectedItem();
        this.CategoriaNome.setText(SelectedItem.getNomeCategoria());
        this.CategoriaDescricao.setText(SelectedItem.getDescricaoCategoria());
    }//GEN-LAST:event_ComboCategoriaActionPerformed

    private void CategoriaSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaSituacaoActionPerformed

    private void BtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeletarActionPerformed
        Categoria SelectedItem = (Categoria) this.ComboCategoria.getSelectedItem();
        CategoriaInterface repositorioCategoria = new CategoriaDAO();
        JOptionPane.showMessageDialog(null,"Categoria deletada com Sucesso!");
        repositorioCategoria.remover(SelectedItem);
        this.ComboCategoria.removeItem(SelectedItem);         
    }//GEN-LAST:event_BtnDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAlterarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAlterarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAlterarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAlterarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAlterarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDeletar;
    private javax.swing.JButton BtnSalvarAlteracao;
    private javax.swing.JTextField CategoriaDescricao;
    private javax.swing.JTextField CategoriaNome;
    private javax.swing.JComboBox<String> CategoriaSituacao;
    private javax.swing.JComboBox<Categoria> ComboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
