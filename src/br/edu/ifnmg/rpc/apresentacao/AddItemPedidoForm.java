/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.apresentacao;

import br.edu.ifnmg.rpc.bo.PedidoBO;
import br.edu.ifnmg.rpc.bo.ProdutoBO;
import br.edu.ifnmg.rpc.domainModel.ItensPedido;
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
        txtqtdBebida.setValue(0);
        txtqtdPF.setValue(0);
        PrecoQuilo.setText("");
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
        txtqtdBebida = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        panelPF = new javax.swing.JPanel();
        txtqtdPF = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        panelComidaKg = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PrecoQuilo = new javax.swing.JTextField();
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
                .addComponent(txtqtdBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtqtdBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(txtqtdPF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        panelPFLayout.setVerticalGroup(
            panelPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPFLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtqtdPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelComidaKg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comida a Quilo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        jLabel6.setText("Preço:");

        javax.swing.GroupLayout panelComidaKgLayout = new javax.swing.GroupLayout(panelComidaKg);
        panelComidaKg.setLayout(panelComidaKgLayout);
        panelComidaKgLayout.setHorizontalGroup(
            panelComidaKgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComidaKgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PrecoQuilo)
                .addContainerGap())
        );
        panelComidaKgLayout.setVerticalGroup(
            panelComidaKgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComidaKgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelComidaKgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PrecoQuilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelComidaKg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodPedido)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelComidaKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        String tipo = cmbTipo.getSelectedItem().toString();

        if (tipo == "Comida a Quilo") {
            this.panelBebida.setVisible(false);
            this.panelPF.setVisible(false);
            this.panelComidaKg.setVisible(true);
        } else if (tipo == "PF") {
            this.panelBebida.setVisible(false);
            this.panelPF.setVisible(true);
            this.panelComidaKg.setVisible(false);
        } else if (tipo == "Bebida") {
            this.panelBebida.setVisible(true);
            this.panelPF.setVisible(false);
            this.panelComidaKg.setVisible(false);
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

//        //Variáveis
//        
//        
//        //Validar Campos
//        PedidoBO pedidoBO = new PedidoBO();
//        
//        String tipo = cmbTipo.getSelectedItem().toString();
//        
//        if(tipo == "Comida a Quilo"){
//            
//        }else if(tipo == "PF"){
//           panelBebida.setVisible(false);
//           panelPF.setVisible(true);
//           panelComidaKg.setVisible(false);
//        }else if(tipo == "Bebida"){
//            this.panelBebida.setVisible(true);
//            this.panelPF.setVisible(false);
//            this.panelComidaKg.setVisible(false);
//        }
//        
        //Comandos para adicionar item ao pedido
        //Mensagem de Sucesso
        
        ItensPedido item = new ItensPedido();
       
        item.setProduto(null);
        item.setQuantidade(1);
        item.setValorUnitario(1.20);
        item.setValorTotal(1.50);
        
        JOptionPane.showMessageDialog(this, "Item Adicionado com sucesso!", "Adicionar item ao pedido", JOptionPane.INFORMATION_MESSAGE);

        //Fechar a Tela atual
        this.dispose();

        // Chamar Tela de listagem
        ListaPedidoForm listarPedido = new ListaPedidoForm();
        listarPedido.setVisible(true);
        centralizaForm(listarPedido);
        listarPedido.toFront();
        JDP1.add(listarPedido);

    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PrecoQuilo;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbBebida;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelBebida;
    private javax.swing.JPanel panelComidaKg;
    private javax.swing.JPanel panelPF;
    private javax.swing.JTextField txtCodPedido;
    private javax.swing.JSpinner txtqtdBebida;
    private javax.swing.JSpinner txtqtdPF;
    // End of variables declaration//GEN-END:variables
}
