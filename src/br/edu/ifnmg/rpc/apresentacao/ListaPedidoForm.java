/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.apresentacao;

import br.edu.ifnmg.rpc.dao.PedidoDAO;
import br.edu.ifnmg.rpc.domainModel.Pedido;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ALUNO 2015-1
 */
public class ListaPedidoForm extends javax.swing.JInternalFrame {

     JDesktopPane JDP1 = TelaPrincipal.getPainel(null);
    /**
     * Creates new form CadPedidoForm
     */
    public ListaPedidoForm() {
        initComponents();
        this.ConfigurarTblPedido();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnNovoPedido = new javax.swing.JButton();
        btnFinalizarPedido = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Lista de Pedidos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos em aberto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblPedidos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnNovoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/rpc/icones/add-icon3232.png"))); // NOI18N
        btnNovoPedido.setText("Novo Pedido");
        btnNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPedidoActionPerformed(evt);
            }
        });

        btnFinalizarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/rpc/icones/register-icon.png"))); // NOI18N
        btnFinalizarPedido.setText("Finalizar Pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 651, Short.MAX_VALUE)
                        .addComponent(btnFinalizarPedido)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoPedido)
                    .addComponent(btnFinalizarPedido))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPedidoActionPerformed
        this.dispose();
        NovoPedidoForm novopedido = new NovoPedidoForm();
        novopedido.setVisible(true);
        centralizaForm(novopedido);
        novopedido.toFront();
        JDP1.add(novopedido);
    }//GEN-LAST:event_btnNovoPedidoActionPerformed
   private void ConfigurarTblPedido() {
        TablePedidoModel model = new TablePedidoModel(new PedidoDAO().Buscar());
        tblPedidos.setModel(model);
    }

    private class TablePedidoModel extends AbstractTableModel {

        private List<Pedido> lista;

        public TablePedidoModel(List<Pedido> lista) {
            this.lista = lista;
        }

        
        @Override
        public int getRowCount() {
            return lista.size();
        }

        
        @Override
        public int getColumnCount() {
            return 2;
        }

       
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Pedido pedido = lista.get(rowIndex);
            if (columnIndex == 0) {
                return pedido.getNumerocartao();
            } else if (columnIndex == 1) {
                return pedido.getCliente().getNome();
            }
            return null;
        }

       
        @Override
        public String getColumnName(int column) {
            if(column == 0){
                return "Codigo";
            }else if(column == 1){
                return "Nome";
            }
            return null;
        }

    }
    private void centralizaForm(JInternalFrame frame) {

        Dimension desktopSize = JDP1.getSize();
        Dimension jInternalFrameSize = frame.getSize();

        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2, (desktopSize.height - jInternalFrameSize.height) / 2);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.JButton btnNovoPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
