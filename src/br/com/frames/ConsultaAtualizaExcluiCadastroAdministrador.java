/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frames;

import br.com.hibernate.mapping.NewHibernateUtil;
import br.com.hibernate.mapping.CadastroAdministrador;
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
public class ConsultaAtualizaExcluiCadastroAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaAtualizaExcluiCadastroUsuario
     */
    public ConsultaAtualizaExcluiCadastroAdministrador() {
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
        emailAdmTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confirmarSenhaAdmTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nomeAdmTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        senhaAdmTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacaoAdmTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        enderecoAdmTextArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        rgAdmTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cpfAdmTextField = new javax.swing.JTextField();
        telefoneAdmTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        celularAdmTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        dataNascimentoAdmTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sexoAdmComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        removerImagemButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        imagemAdmLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        atualizaCadastroAdmButton = new javax.swing.JButton();
        adicionarImagemButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cpfAdmConsultaTextField1 = new javax.swing.JTextField();
        consultaCadastroButton = new javax.swing.JButton();
        exluiCadastroAdmButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Cadastro"));

        jLabel5.setText("Endereço");

        jLabel6.setText("Observação");

        jLabel7.setText("Email");

        jLabel8.setText("Confirmar Senha");

        jLabel10.setText("Nome Completo");

        jLabel12.setText("Senha");

        observacaoAdmTextArea.setColumns(20);
        observacaoAdmTextArea.setRows(5);
        jScrollPane1.setViewportView(observacaoAdmTextArea);

        enderecoAdmTextArea.setColumns(20);
        enderecoAdmTextArea.setRows(5);
        jScrollPane2.setViewportView(enderecoAdmTextArea);

        jLabel11.setText("RG");

        rgAdmTextField.setEnabled(false);

        jLabel13.setText("CPF");

        cpfAdmTextField.setEnabled(false);

        jLabel14.setText("Telefone");

        jLabel15.setText("Celular");

        jLabel16.setText("Data de Nascimento");

        sexoAdmComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Sexo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAdmTextField)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(senhaAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celularAdmTextField)
                            .addComponent(telefoneAdmTextField)
                            .addComponent(nomeAdmTextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(cpfAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(26, 26, 26)
                                .addComponent(rgAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(dataNascimentoAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexoAdmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmarSenhaAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nomeAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rgAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(telefoneAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(celularAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(dataNascimentoAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(sexoAdmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(senhaAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(confirmarSenhaAdmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        removerImagemButton.setText("Remover");
        removerImagemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerImagemButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Consulta - Atualiza - Edita ADM");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        imagemAdmLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/error.png"))); // NOI18N
        imagemAdmLabel.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemAdmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemAdmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Imagem do Produto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
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

        atualizaCadastroAdmButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atualizaCadastroAdmButton.setText("Atualizar Cadastro");
        atualizaCadastroAdmButton.setEnabled(false);
        atualizaCadastroAdmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaCadastroAdmButtonActionPerformed(evt);
            }
        });

        adicionarImagemButton.setText("Adicionar");
        adicionarImagemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarImagemButtonActionPerformed(evt);
            }
        });

        jLabel18.setText("CPF");

        consultaCadastroButton.setText("Consultar Cadastro");
        consultaCadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaCadastroButtonActionPerformed(evt);
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
                        .addComponent(cpfAdmConsultaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(consultaCadastroButton)
                        .addGap(0, 176, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cpfAdmConsultaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(consultaCadastroButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exluiCadastroAdmButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exluiCadastroAdmButton1.setText("Excluir Cadastro");
        exluiCadastroAdmButton1.setEnabled(false);
        exluiCadastroAdmButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exluiCadastroAdmButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(adicionarImagemButton)
                        .addGap(19, 19, 19)
                        .addComponent(removerImagemButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(atualizaCadastroAdmButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(exluiCadastroAdmButton1)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarImagemButton)
                            .addComponent(removerImagemButton)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exluiCadastroAdmButton1)
                    .addComponent(atualizaCadastroAdmButton))
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

    private void atualizaCadastroAdmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaCadastroAdmButtonActionPerformed

        Validacoes valida = new Validacoes();
        boolean validadorDeEmail = valida.validEmail(emailAdmTextField.getText());
        boolean semImagem = false;
        boolean camposNaoPreenchidos = false;
        boolean senhaNaoConfirmada = false;

        if (imagemAdmLabel.getIcon() == null) {
            semImagem = true;
            JOptionPane.showMessageDialog(this, "Adicione uma imagem");

        }
        if (nomeAdmTextField.getText().equals("") || rgAdmTextField.getText().equals("")
                || cpfAdmTextField.getText().equals("") || telefoneAdmTextField.getText().equals("")
                || celularAdmTextField.getText().equals("") || emailAdmTextField.getText().equals("")
                || dataNascimentoAdmTextField.getText().equals("") || enderecoAdmTextArea.getText().equals("")
                || observacaoAdmTextArea.getText().equals("") || senhaAdmTextField.getText().equals("")
                || confirmarSenhaAdmTextField.getText().equals("")) {
            camposNaoPreenchidos = true;
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        if (!senhaAdmTextField.getText().equals(confirmarSenhaAdmTextField.getText())) {
            JOptionPane.showMessageDialog(null, "A senha não foi confirmada");
            senhaNaoConfirmada = true;
        }

        if (validadorDeEmail == false) {
            JOptionPane.showMessageDialog(null, "O E-mail " + emailAdmTextField.getText() + " é inválido");
        }
        if (validadorDeEmail == true && semImagem == false && camposNaoPreenchidos == false
                && senhaNaoConfirmada == false) {
            Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
            Transaction t = bancoConveniencia.beginTransaction();

            SQLQuery consultaCadastroAdm = bancoConveniencia.createSQLQuery("select * from cadastro_administrador");
            consultaCadastroAdm.addEntity(CadastroAdministrador.class);
            List<CadastroAdministrador> listaCadastroAdm = (List<CadastroAdministrador>) consultaCadastroAdm.list();

            for (CadastroAdministrador u : listaCadastroAdm) {
                if (idEscolhido == u.getIdcadastroAdministrador()) {

                    u.setNomeAdministrador(nomeAdmTextField.getText());
                    u.setRgAdministrador(rgAdmTextField.getText());
                    u.setCpfAdministrador(cpfAdmTextField.getText());
                    u.setTelefoneAdministrador(telefoneAdmTextField.getText());
                    u.setCelularAdministrador(celularAdmTextField.getText());
                    u.setDataNascimentoAdministrador(dataNascimentoAdmTextField.getText());
                    u.setSexoAdministrador(sexoAdmComboBox.getSelectedItem().toString());
                    u.setEnderecoAdministrador(enderecoAdmTextArea.getText());
                    u.setObservacaoAdministrador(observacaoAdmTextArea.getText());
                    u.setEmailAdministrador(emailAdmTextField.getText());
                    u.setSenhaAdministrador(senhaAdmTextField.getText());
                    ConversorImagemBytes x = new ConversorImagemBytes();
                    u.setImagemAdministrador(x.imagemByte(imagemAdmLabel.getIcon()));

                    bancoConveniencia.update(u);
                    t.commit();
                    bancoConveniencia.close();

                    atualizaCadastroAdmButton.setEnabled(false);
                    exluiCadastroAdmButton1.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Dados atualizados com Sucesso");

                    nomeAdmTextField.setText("");
                    rgAdmTextField.setText("");
                    cpfAdmTextField.setText("");
                    telefoneAdmTextField.setText("");
                    celularAdmTextField.setText("");
                    dataNascimentoAdmTextField.setText("");
                    sexoAdmComboBox.setSelectedIndex(0);
                    enderecoAdmTextArea.setText("");
                    observacaoAdmTextArea.setText("");
                    emailAdmTextField.setText("");
                    senhaAdmTextField.setText("");
                    confirmarSenhaAdmTextField.setText("");
                    imagemAdmLabel.setIcon(null);

                }
            }
        }
    }//GEN-LAST:event_atualizaCadastroAdmButtonActionPerformed

    private void exluiCadastroAdmButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exluiCadastroAdmButton1ActionPerformed
        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroAdm = bancoConveniencia.createSQLQuery("select * from cadastro_administrador");
        consultaCadastroAdm.addEntity(CadastroAdministrador.class);
        List<CadastroAdministrador> listaCadastroAdm = (List<CadastroAdministrador>) consultaCadastroAdm.list();

        for (CadastroAdministrador u : listaCadastroAdm) {
            if (idEscolhido == u.getIdcadastroAdministrador()) {

                bancoConveniencia.delete(u);

                t.commit();
                bancoConveniencia.close();

                atualizaCadastroAdmButton.setEnabled(false);
                exluiCadastroAdmButton1.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Dados Exluidos com Sucesso");

                nomeAdmTextField.setText("");
                rgAdmTextField.setText("");
                cpfAdmTextField.setText("");
                telefoneAdmTextField.setText("");
                celularAdmTextField.setText("");
                dataNascimentoAdmTextField.setText("");
                sexoAdmComboBox.setSelectedIndex(0);
                enderecoAdmTextArea.setText("");
                observacaoAdmTextArea.setText("");
                emailAdmTextField.setText("");
                senhaAdmTextField.setText("");
                confirmarSenhaAdmTextField.setText("");
                imagemAdmLabel.setIcon(null);
            }

        }

    }//GEN-LAST:event_exluiCadastroAdmButton1ActionPerformed
    public int idEscolhido = -1;


    private void consultaCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaCadastroButtonActionPerformed

        atualizaCadastroAdmButton.setEnabled(false);
        exluiCadastroAdmButton1.setEnabled(false);

        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroAdm = bancoConveniencia.createSQLQuery("select * from cadastro_administrador");
        consultaCadastroAdm.addEntity(CadastroAdministrador.class);
        List<CadastroAdministrador> listaCadastroAdm = (List<CadastroAdministrador>) consultaCadastroAdm.list();

        t.commit();
        bancoConveniencia.close();

        boolean cadastroExistente = false;
        for (CadastroAdministrador u : listaCadastroAdm) {
            if (u.getCpfAdministrador().equals(cpfAdmConsultaTextField1.getText())) {

                nomeAdmTextField.setText(u.getNomeAdministrador());
                rgAdmTextField.setText(u.getRgAdministrador());
                cpfAdmTextField.setText(u.getCpfAdministrador());
                telefoneAdmTextField.setText(u.getTelefoneAdministrador());
                celularAdmTextField.setText(u.getCelularAdministrador());
                dataNascimentoAdmTextField.setText(u.getDataNascimentoAdministrador());
                sexoAdmComboBox.setSelectedItem(u.getSexoAdministrador());
                enderecoAdmTextArea.setText(u.getEnderecoAdministrador());
                observacaoAdmTextArea.setText(u.getObservacaoAdministrador());
                emailAdmTextField.setText(u.getEmailAdministrador());
                senhaAdmTextField.setText(u.getSenhaAdministrador());
                confirmarSenhaAdmTextField.setText(u.getSenhaAdministrador());

                byte[] b = u.getImagemAdministrador();
                ImageIcon x = new ImageIcon(b);
                imagemAdmLabel.setIcon(x);

                idEscolhido = u.getIdcadastroAdministrador();
                cadastroExistente = true;
                atualizaCadastroAdmButton.setEnabled(true);
                exluiCadastroAdmButton1.setEnabled(true);
            }
        }
        if (cadastroExistente == false) {
            JOptionPane.showMessageDialog(null, "Cadastro de Administrador não encontrado");
        }

    }//GEN-LAST:event_consultaCadastroButtonActionPerformed

    private void removerImagemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerImagemButtonActionPerformed
        imagemAdmLabel.setIcon(null);
    }//GEN-LAST:event_removerImagemButtonActionPerformed
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
            imagemAdmLabel.setIcon(icone);
            imagens.add((ImageIcon) imagemAdmLabel.getIcon());
        }
    }//GEN-LAST:event_adicionarImagemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaAtualizaExcluiCadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaAtualizaExcluiCadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaAtualizaExcluiCadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaAtualizaExcluiCadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAtualizaExcluiCadastroAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarImagemButton;
    private javax.swing.JButton atualizaCadastroAdmButton;
    private javax.swing.JTextField celularAdmTextField;
    private javax.swing.JTextField confirmarSenhaAdmTextField;
    private javax.swing.JButton consultaCadastroButton;
    private javax.swing.JTextField cpfAdmConsultaTextField1;
    private javax.swing.JTextField cpfAdmTextField;
    private javax.swing.JTextField dataNascimentoAdmTextField;
    private javax.swing.JTextField emailAdmTextField;
    private javax.swing.JTextArea enderecoAdmTextArea;
    private javax.swing.JButton exluiCadastroAdmButton1;
    private javax.swing.JLabel imagemAdmLabel;
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
    private javax.swing.JTextField nomeAdmTextField;
    private javax.swing.JTextArea observacaoAdmTextArea;
    private javax.swing.JButton removerImagemButton;
    private javax.swing.JTextField rgAdmTextField;
    private javax.swing.JTextField senhaAdmTextField;
    private javax.swing.JComboBox<String> sexoAdmComboBox;
    private javax.swing.JTextField telefoneAdmTextField;
    // End of variables declaration//GEN-END:variables
}