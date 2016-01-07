/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.apresentacao;

import br.edu.ifnmg.rpc.bo.PedidoBO;
import br.edu.ifnmg.rpc.bo.ProdutoBO;
import br.edu.ifnmg.rpc.domainModel.Produto;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO 2015-1
 */
public class AddItemPedidoForm extends javax.swing.JInternalFrame {

    String codPedido;
    JDesktopPane JDP1 = TelaPrincipal.getPainel(null);

    /**
     * Creates new form CadPedidoForm
     */
    public AddItemPedidoForm(String cod) {
        this.codPedido = cod;
        initComponents();
        this.configuraTela();
        this.popularCB();
    }

    public void configuraTela() {
        panelComidaKg.setVisible(false);
        panelBebida.setVisible(false);
        panelPF.setVisible(false);
        qtdBebida.setValue(0);
        qtdPF.setValue(0);
        qtdKG.setText("");
        txtCodPedido.setText(codPedido);
    }

    public void popularCB() {
        List<Produto> Produtos;
        ProdutoBO prodBO = new ProdutoBO();

        Produto prodFiltro = new Produto();
        prodFiltro.setTipo("Bebida");

        Produtos = prodBO.Busca(prodFiltro);

        cmbBebida.removeAllItems();
        cmbBebida.addItem("Selecione");

        for (Produto item : Produtos) {
            cmbBebida.addItem(item.getNome());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTipo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        panelBebida = new javax.swing.JPanel();
        cmbBebida = new javax.swing.JComboBox();
        qtdBebida = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        panelPF = new javax.swing.JPanel();
        qtdPF = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        panelComidaKg = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        qtdKG = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCodPedido = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Pedido");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione uma opção", "Comida a Quilo", "PF", "Bebida" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });

        jLabel1.setText("Selecione o tipo de pedido:");

        panelBebida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bebida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        cmbBebida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a bebida desejada", "Suco", "Refrigerante", "Cerveja", " " }));

        jLabel2.setText("Quantidade:");

        javax.swing.GroupLayout panelBebidaLayout = new javax.swing.GroupLayout(panelBebida);
        panelBebida.setLayout(panelBebidaLayout);
        panelBebidaLayout.setHorizontalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmbBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBebidaLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtdBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBebidaLayout.setVerticalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(qtdBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prato Feito - PF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        jLabel3.setText("Quantidade:");

        javax.swing.GroupLayout panelPFLayout = new javax.swing.GroupLayout(panelPF);
        panelPF.setLayout(panelPFLayout);
        panelPFLayout.setHorizontalGroup(
            panelPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtdPF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPFLayout.setVerticalGroup(
            panelPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPFLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qtdPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelComidaKg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comida a Quilo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        jLabel4.setText("KG:");

        javax.swing.GroupLayout panelComidaKgLayout = new javax.swing.GroupLayout(panelComidaKg);
        panelComidaKg.setLayout(panelComidaKgLayout);
        panelComidaKgLayout.setHorizontalGroup(
            panelComidaKgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComidaKgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtdKG)
                .addContainerGap())
        );
        panelComidaKgLayout.setVerticalGroup(
            panelComidaKgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComidaKgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelComidaKgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(qtdKG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/rpc/icones/8443_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/rpc/icones/8441_32x32.png"))); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setText("Código do Pedido:");

        txtCodPedido.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(panelComidaKg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodPedido)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelComidaKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        int tipo = cmbTipo.getSelectedIndex();

        if (tipo == 1) {
            panelComidaKg.setVisible(true);
            panelBebida.setVisible(false);
            panelPF.setVisible(false);
        } else if (tipo == 2) {
            panelComidaKg.setVisible(false);
            panelBebida.setVisible(false);
            panelPF.setVisible(true);
        } else if (tipo == 3) {
            panelComidaKg.setVisible(false);
            panelBebida.setVisible(true);
            panelPF.setVisible(false);
        } else {
            panelComidaKg.setVisible(false);
            panelBebida.setVisible(false);
            panelPF.setVisible(false);
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        ListaPedidoForm listarPedido = new ListaPedidoForm();
        listarPedido.setVisible(true);
        centralizaForm(listarPedido);
        listarPedido.toFront();
        JDP1.add(listarPedido);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void centralizaForm(JInternalFrame frame) {

        Dimension desktopSize = JDP1.getSize();
        Dimension jInternalFrameSize = frame.getSize();

        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2, (desktopSize.height - jInternalFrameSize.height) / 2);
    }


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        //Variáveis
        double qtdK = Double.parseDouble(qtdKG.getText().toString().trim());
        int qtdPf;
        String qtdBebida;

        //Validar Campos
        PedidoBO pedidoBO = new PedidoBO();

        int tipo = cmbTipo.getSelectedIndex();

        if (tipo == 1) {
            //Comida a KG

        } else if (tipo == 2) {
            //Bebida
        } else if (tipo == 3) {
            //PF
        }

        //Comandos para adicionar item ao pedido
        JOptionPane.showMessageDialog(this, "Item Adicionado com sucesso!", "Adicionar item ao pedido", JOptionPane.INFORMATION_MESSAGE);

        int res = JOptionPane.showConfirmDialog(this, "Deseja adicionar outro item a este pedido?", "Adicionar item ao pedido", JOptionPane.YES_NO_OPTION);

        if (res == 0) {
            this.configuraTela();
        } else {
            //Chamar tela de Listar pedidos
            this.dispose();
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbBebida;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelBebida;
    private javax.swing.JPanel panelComidaKg;
    private javax.swing.JPanel panelPF;
    private javax.swing.JSpinner qtdBebida;
    private javax.swing.JTextField qtdKG;
    private javax.swing.JSpinner qtdPF;
    private javax.swing.JTextField txtCodPedido;
    // End of variables declaration//GEN-END:variables
}
