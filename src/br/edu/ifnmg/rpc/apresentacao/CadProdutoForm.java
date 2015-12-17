package br.edu.ifnmg.rpc.apresentacao;

import br.edu.ifnmg.rpc.bo.ProdutoBO;
import br.edu.ifnmg.rpc.domainModel.Produto;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class CadProdutoForm extends javax.swing.JInternalFrame {

    public CadProdutoForm() {
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox();
        lblNome1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastrar Produtos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/rpc/icones/8441_32x32.png"))); // NOI18N

        lblNome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNome.setText("Nome Completo:");

        lblLogin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblLogin.setText("Valor:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/rpc/icones/8443_32x32.png"))); // NOI18N
        btnCancelar.setText("  Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/rpc/icones/8441_32x32.png"))); // NOI18N
        btnSalvar.setText("  Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um Opção", "Bebida", "Comida a KG", "PF" }));

        lblNome1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNome1.setText("Tipo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(28, 28, 28)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtValor)
                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68))
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(248, 248, 248)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            if ((txtNome.getText().equals("")
                    || txtValor.getText().equals("")
                    || cmbTipo.getSelectedItem().equals("Selecione um Opção"))) {

                JOptionPane.showMessageDialog(null,
                        "É obrigatorio preencher ou selecionar todos os campos!",
                        "Cadastrar Produto",
                        JOptionPane.ERROR_MESSAGE);

            } else {

                Produto prod = new Produto();
                prod.setNome(txtNome.getText().trim());
                BigDecimal valor = new BigDecimal(txtValor.getText());
                prod.setValor(valor);
                prod.setTipo(cmbTipo.getSelectedItem().toString());
                ProdutoBO prodBO = new ProdutoBO();
                prodBO.Salvar(prod);

                JOptionPane.showMessageDialog(null,
                        "Cadastro realizado com sucesso!",
                        "Cadastrar Produto",
                        JOptionPane.INFORMATION_MESSAGE);

                this.Limpar();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "É obrigatorio preencher o valor e Utilize ponto no lugar da virgula no valor do Produto!",
                    "Cadastrar Produto",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    public void Limpar() {
        txtNome.setText("");
        txtValor.setText("");
        cmbTipo.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
