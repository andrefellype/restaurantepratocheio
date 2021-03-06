/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.apresentacao;

import br.edu.ifnmg.rpc.bo.UsuarioBO;
import br.edu.ifnmg.rpc.domainModel.Usuario;
import br.edu.ifnmg.rpc.excecoes.SenhasDiferentesException;
import br.edu.ifnmg.rpc.excecoes.VazioException;
import javax.swing.JOptionPane;


/**
 *
 * @author ALUNO 2015-1
 */
public class CadUsuarioForm extends javax.swing.JInternalFrame{

    /**
     * Creates new form CadUsuarioForm
     */
    public CadUsuarioForm() {
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

        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        cmbTipo = new javax.swing.JComboBox();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastrar Usuários");

        lblNome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNome.setText("Nome Completo:");

        lblLogin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSenha.setText("Senha:");

        lblConfirmarSenha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblConfirmarSenha.setText("Confirmar Senha:");

        lblTipo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblTipo.setText("Tipo:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Cozinheiro", "Garçom" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtLogin)
                    .addComponent(txtSenha)
                    .addComponent(txtConfirmarSenha)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogin)
                            .addComponent(lblSenha)
                            .addComponent(lblConfirmarSenha)
                            .addComponent(lblTipo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnCancelar)
                .addGap(41, 41, 41)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblConfirmarSenha)
                .addGap(11, 11, 11)
                .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       
        String nome = txtNome.getText().toString().trim();
        String login = txtLogin.getText().toString().trim();
        String senha = txtSenha.getText().toString().trim();
        String confirmaSenha = txtConfirmarSenha.getText().toString().trim();
        String tipo = cmbTipo.getSelectedItem().toString();
        
        UsuarioBO ubo = new UsuarioBO();
        Usuario usuario = new Usuario();
        try{
            //Enviar dados para validação
            ubo.validar(nome, login, senha, confirmaSenha);
            
            //Setar Valores no Objeto usuário
            usuario.setNome(nome);
            usuario.setLogin(login);
            usuario.setSenha(senha);
            usuario.setTipo(tipo);
            usuario.setStatus(true);
            
            //Salvar Dados
            ubo.Salvar(usuario);
            
           JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!","Cadastrar Usuário", JOptionPane.INFORMATION_MESSAGE);
           this.Limpar();
        }catch(VazioException v){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!","Cadastrar Usuário", JOptionPane.ERROR_MESSAGE);
        }catch(SenhasDiferentesException s){
            JOptionPane.showMessageDialog(null, "As senhas não conferem!","Cadastrar Usuário", JOptionPane.ERROR_MESSAGE);
            txtSenha.requestFocus();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao realizar cadastro!","Cadastrar Usuário", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    public void Limpar(){
        txtNome.setText("");
        txtLogin.setText("");
        txtSenha.setText("");
        txtConfirmarSenha.setText("");
        cmbTipo.setSelectedIndex(0);
        txtNome.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
