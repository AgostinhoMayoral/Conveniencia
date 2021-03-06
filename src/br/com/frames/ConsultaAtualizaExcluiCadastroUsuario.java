/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frames;

import br.com.hibernate.mapping.NewHibernateUtil;
import br.com.hibernate.mapping.CadastroUsuario;
import java.util.List;
import javax.swing.ImageIcon;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.classes.ConversorImagemBytes;
import br.com.classes.Validacoes;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author tinho
 */
public class ConsultaAtualizaExcluiCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaAtualizaExcluiCadastroUsuario
     */
    public ConsultaAtualizaExcluiCadastroUsuario() {
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
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailUsuarioTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confirmarSenhaUsuarioTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nomeUsuarioTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        senhaUsuarioTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacaoUsuarioTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        enderecoUsuarioTextArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        rgUsuarioTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cpfUsuarioTextField = new javax.swing.JTextField();
        telefoneUsuarioTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        celularUsuarioTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        dataNascimentoUsuarioTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sexoUsuarioComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        atualizaCadastroUsuarioButton = new javax.swing.JButton();
        adicionarImagemButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cpfUsuarioConsultaTextField1 = new javax.swing.JTextField();
        consultaUsuarioCadastroButton = new javax.swing.JButton();
        exluiCadastroUsuarioButton1 = new javax.swing.JButton();
        removerImagemButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        imagemUsuarioLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Cadastro"));

        jLabel5.setText("Endereço");

        jLabel6.setText("Observação");

        jLabel7.setText("Email");

        jLabel8.setText("Confirmar Senha");

        jLabel10.setText("Nome Completo");

        jLabel12.setText("Senha");

        observacaoUsuarioTextArea.setColumns(20);
        observacaoUsuarioTextArea.setRows(5);
        jScrollPane1.setViewportView(observacaoUsuarioTextArea);

        enderecoUsuarioTextArea.setColumns(20);
        enderecoUsuarioTextArea.setRows(5);
        jScrollPane2.setViewportView(enderecoUsuarioTextArea);

        jLabel11.setText("RG");

        rgUsuarioTextField.setEnabled(false);

        jLabel13.setText("CPF");

        cpfUsuarioTextField.setEnabled(false);

        jLabel14.setText("Telefone");

        jLabel15.setText("Celular");

        jLabel16.setText("Data de Nascimento");

        sexoUsuarioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Sexo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeUsuarioTextField))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaUsuarioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                            .addComponent(emailUsuarioTextField)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmarSenhaUsuarioTextField))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(rgUsuarioTextField)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(cpfUsuarioTextField))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(telefoneUsuarioTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(celularUsuarioTextField))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(dataNascimentoUsuarioTextField))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(sexoUsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nomeUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rgUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cpfUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(telefoneUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(celularUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(dataNascimentoUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoUsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(64, 64, 64)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(senhaUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(confirmarSenhaUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        atualizaCadastroUsuarioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atualizaCadastroUsuarioButton.setText("Atualizar Cadastro");
        atualizaCadastroUsuarioButton.setEnabled(false);
        atualizaCadastroUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaCadastroUsuarioButtonActionPerformed(evt);
            }
        });

        adicionarImagemButton.setText("Adicionar");
        adicionarImagemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarImagemButtonActionPerformed(evt);
            }
        });

        jLabel18.setText("CPF");

        consultaUsuarioCadastroButton.setText("Consultar Cadastro");
        consultaUsuarioCadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaUsuarioCadastroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cpfUsuarioConsultaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(consultaUsuarioCadastroButton)
                        .addGap(0, 176, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cpfUsuarioConsultaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultaUsuarioCadastroButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exluiCadastroUsuarioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exluiCadastroUsuarioButton1.setText("Excluir Cadastro");
        exluiCadastroUsuarioButton1.setEnabled(false);
        exluiCadastroUsuarioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exluiCadastroUsuarioButton1ActionPerformed(evt);
            }
        });

        removerImagemButton.setText("Remover");
        removerImagemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerImagemButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Consulta - Atualiza - Edita Usuário");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        imagemUsuarioLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/error.png"))); // NOI18N
        imagemUsuarioLabel.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemUsuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemUsuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Imagem do Produto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(adicionarImagemButton)
                            .addGap(37, 37, 37)
                            .addComponent(removerImagemButton)
                            .addGap(41, 41, 41))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(atualizaCadastroUsuarioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exluiCadastroUsuarioButton1)
                        .addGap(127, 127, 127))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removerImagemButton)
                        .addComponent(adicionarImagemButton))
                    .addComponent(exluiCadastroUsuarioButton1)
                    .addComponent(atualizaCadastroUsuarioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int idEscolhido = -1;
    private void atualizaCadastroUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaCadastroUsuarioButtonActionPerformed

        Validacoes valida = new Validacoes();
        boolean validadorDeEmail = valida.validEmail(emailUsuarioTextField.getText());
        boolean semImagem = false;
        boolean camposNaoPreenchidos = false;
        boolean senhaNaoConfirmada = false;

        if (imagemUsuarioLabel.getIcon() == null) {
            semImagem = true;
            JOptionPane.showMessageDialog(this, "Adicione uma imagem");
        }
        if (nomeUsuarioTextField.getText().equals("") || rgUsuarioTextField.getText().equals("")
                || cpfUsuarioTextField.getText().equals("") || telefoneUsuarioTextField.getText().equals("")
                || celularUsuarioTextField.getText().equals("") || emailUsuarioTextField.getText().equals("")
                || dataNascimentoUsuarioTextField.getText().equals("") || enderecoUsuarioTextArea.getText().equals("")
                || observacaoUsuarioTextArea.getText().equals("") || senhaUsuarioTextField.getText().equals("")
                || confirmarSenhaUsuarioTextField.getText().equals("")) {
            camposNaoPreenchidos = true;
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        if (!senhaUsuarioTextField.getText().equals(confirmarSenhaUsuarioTextField.getText())) {
            senhaNaoConfirmada = true;
            JOptionPane.showMessageDialog(null, "A senha não foi confirmada");
        }

        if (validadorDeEmail == false) {
            JOptionPane.showMessageDialog(null, "O E-mail " + emailUsuarioTextField.getText() + " é inválido");
        }
        if (validadorDeEmail == true && semImagem == false && camposNaoPreenchidos == false
                && senhaNaoConfirmada == false) {

            Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
            Transaction t = bancoConveniencia.beginTransaction();

            SQLQuery consultaCadastroAdm = bancoConveniencia.createSQLQuery("select * from cadastro_usuario");
            consultaCadastroAdm.addEntity(CadastroUsuario.class);
            List<CadastroUsuario> listaCadastroUsuario = (List<CadastroUsuario>) consultaCadastroAdm.list();

            for (CadastroUsuario u : listaCadastroUsuario) {
                if (idEscolhido == u.getIdcadastroUsuario()) {

                    u.setNomeUsuario(nomeUsuarioTextField.getText());
                    u.setRgUsuario(rgUsuarioTextField.getText());
                    u.setCpfUsuario(cpfUsuarioTextField.getText());
                    u.setTelefoneUsuario(telefoneUsuarioTextField.getText());
                    u.setCelularUsuario(celularUsuarioTextField.getText());
                    u.setDataNascimentoUsuario(dataNascimentoUsuarioTextField.getText());
                    u.setSexoUsuario(sexoUsuarioComboBox.getSelectedItem().toString());
                    u.setEnderecoUsuario(enderecoUsuarioTextArea.getText());
                    u.setObservacaoUsuario(observacaoUsuarioTextArea.getText());
                    u.setEmailUsuario(emailUsuarioTextField.getText());
                    u.setSenhaUsuario(senhaUsuarioTextField.getText());
                    ConversorImagemBytes x = new ConversorImagemBytes();
                    u.setImagemUsuario(x.imagemByte(imagemUsuarioLabel.getIcon()));

                    bancoConveniencia.update(u);

                    atualizaCadastroUsuarioButton.setEnabled(false);
                    exluiCadastroUsuarioButton1.setEnabled(false);

                    nomeUsuarioTextField.setText("");
                    rgUsuarioTextField.setText("");
                    cpfUsuarioTextField.setText("");
                    telefoneUsuarioTextField.setText("");
                    celularUsuarioTextField.setText("");
                    dataNascimentoUsuarioTextField.setText("");
                    sexoUsuarioComboBox.setSelectedIndex(0);
                    enderecoUsuarioTextArea.setText("");
                    observacaoUsuarioTextArea.setText("");
                    emailUsuarioTextField.setText("");
                    senhaUsuarioTextField.setText("");
                    confirmarSenhaUsuarioTextField.setText("");
                    imagemUsuarioLabel.setIcon(null);

                    JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso");
                    t.commit();
                    bancoConveniencia.close();

                }
            }
        }
    }//GEN-LAST:event_atualizaCadastroUsuarioButtonActionPerformed
    List<ImageIcon> imagens = new ArrayList<>();
    String escolhas;
    JFileChooser escolha = new JFileChooser();
    private void adicionarImagemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarImagemButtonActionPerformed
        escolha.setDialogTitle("Procurar Foto");
        escolha.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Fotos", "jpg", "png", "gif");
        escolha.setFileFilter(filtro);

        int resposta = escolha.showOpenDialog(this);

        if (resposta == JFileChooser.APPROVE_OPTION) {

            File arquivoFotos = escolha.getSelectedFile();
            ImageIcon icone = new ImageIcon(arquivoFotos.getPath());
            imagemUsuarioLabel.setIcon(icone);
            imagens.add((ImageIcon) imagemUsuarioLabel.getIcon());
        }
    }//GEN-LAST:event_adicionarImagemButtonActionPerformed

    private void consultaUsuarioCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaUsuarioCadastroButtonActionPerformed

        atualizaCadastroUsuarioButton.setEnabled(false);
        exluiCadastroUsuarioButton1.setEnabled(false);

        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroAdm = bancoConveniencia.createSQLQuery("select * from cadastro_administrador");
        consultaCadastroAdm.addEntity(CadastroUsuario.class);
        List<CadastroUsuario> listaCadastroUsuario = (List<CadastroUsuario>) consultaCadastroAdm.list();

        t.commit();
        bancoConveniencia.close();
        boolean cadastroExistente = false;
        for (CadastroUsuario u : listaCadastroUsuario) {
            if (u.getCpfUsuario().equals(cpfUsuarioConsultaTextField1.getText())) {

                nomeUsuarioTextField.setText(u.getNomeUsuario());
                rgUsuarioTextField.setText(u.getRgUsuario());
                cpfUsuarioTextField.setText(u.getCpfUsuario());
                telefoneUsuarioTextField.setText(u.getTelefoneUsuario());
                celularUsuarioTextField.setText(u.getCelularUsuario());
                dataNascimentoUsuarioTextField.setText(u.getDataNascimentoUsuario());
                sexoUsuarioComboBox.setSelectedItem(u.getSexoUsuario());
                enderecoUsuarioTextArea.setText(u.getEnderecoUsuario());
                observacaoUsuarioTextArea.setText(u.getObservacaoUsuario());
                emailUsuarioTextField.setText(u.getEmailUsuario());
                senhaUsuarioTextField.setText(u.getSenhaUsuario());
                confirmarSenhaUsuarioTextField.setText(u.getSenhaUsuario());

                byte[] b = u.getImagemUsuario();
                ImageIcon x = new ImageIcon(b);
                imagemUsuarioLabel.setIcon(x);

                idEscolhido = u.getIdcadastroUsuario();
                atualizaCadastroUsuarioButton.setEnabled(true);
                exluiCadastroUsuarioButton1.setEnabled(true);
            }

        }
        if (cadastroExistente == false) {
            JOptionPane.showMessageDialog(null, "Cadastro de Usuário não encontrado");
        }

    }//GEN-LAST:event_consultaUsuarioCadastroButtonActionPerformed

    private void exluiCadastroUsuarioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exluiCadastroUsuarioButton1ActionPerformed
        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroAdm = bancoConveniencia.createSQLQuery("select * from cadastro_administrador");
        consultaCadastroAdm.addEntity(CadastroUsuario.class);
        List<CadastroUsuario> listaCadastroUsuario = (List<CadastroUsuario>) consultaCadastroAdm.list();

        for (CadastroUsuario u : listaCadastroUsuario) {
            if (idEscolhido == u.getIdcadastroUsuario()) {

                bancoConveniencia.delete(u);

                atualizaCadastroUsuarioButton.setEnabled(false);
                exluiCadastroUsuarioButton1.setEnabled(false);

                nomeUsuarioTextField.setText("");
                rgUsuarioTextField.setText("");
                cpfUsuarioTextField.setText("");
                telefoneUsuarioTextField.setText("");
                celularUsuarioTextField.setText("");
                dataNascimentoUsuarioTextField.setText("");
                sexoUsuarioComboBox.setSelectedIndex(0);
                enderecoUsuarioTextArea.setText("");
                observacaoUsuarioTextArea.setText("");
                emailUsuarioTextField.setText("");
                senhaUsuarioTextField.setText("");
                confirmarSenhaUsuarioTextField.setText("");
                imagemUsuarioLabel.setIcon(null);
                JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso");
            }

        }
        t.commit();
        bancoConveniencia.close();
    }//GEN-LAST:event_exluiCadastroUsuarioButton1ActionPerformed

    private void removerImagemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerImagemButtonActionPerformed
        imagemUsuarioLabel.setIcon(null);
    }//GEN-LAST:event_removerImagemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaAtualizaExcluiCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaAtualizaExcluiCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaAtualizaExcluiCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaAtualizaExcluiCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAtualizaExcluiCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarImagemButton;
    private javax.swing.JButton atualizaCadastroUsuarioButton;
    private javax.swing.JTextField celularUsuarioTextField;
    private javax.swing.JTextField confirmarSenhaUsuarioTextField;
    private javax.swing.JButton consultaUsuarioCadastroButton;
    private javax.swing.JTextField cpfUsuarioConsultaTextField1;
    private javax.swing.JTextField cpfUsuarioTextField;
    private javax.swing.JTextField dataNascimentoUsuarioTextField;
    private javax.swing.JTextField emailUsuarioTextField;
    private javax.swing.JTextArea enderecoUsuarioTextArea;
    private javax.swing.JButton exluiCadastroUsuarioButton1;
    private javax.swing.JLabel imagemUsuarioLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeUsuarioTextField;
    private javax.swing.JTextArea observacaoUsuarioTextArea;
    private javax.swing.JButton removerImagemButton;
    private javax.swing.JTextField rgUsuarioTextField;
    private javax.swing.JTextField senhaUsuarioTextField;
    private javax.swing.JComboBox<String> sexoUsuarioComboBox;
    private javax.swing.JTextField telefoneUsuarioTextField;
    // End of variables declaration//GEN-END:variables
}
