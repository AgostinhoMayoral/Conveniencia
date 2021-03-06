/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frames;

import org.hibernate.Session;
import br.com.hibernate.mapping.NewHibernateUtil;
import br.com.hibernate.mapping.CadastroProduto;
import java.util.List;
import javax.swing.ImageIcon;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import br.com.classes.ConversorImagemBytes;
import javax.swing.JOptionPane;

/**
 *
 * @author tinho
 */
public class F6ConsultaAtualizaRemoveProdutoCadastroEstoque extends javax.swing.JFrame {

    /**
     * Creates new form F5CadastroDeProduto
     */
    public F6ConsultaAtualizaRemoveProdutoCadastroEstoque() {

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
        jPanel2 = new javax.swing.JPanel();
        imagemProdutoLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        codigoBarrasProdutoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tipoProdutoComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeProdutoTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        descricaoProdutoTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        marcaProdutoTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        valorCompraProdutoTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        valorVendaProdutoTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pesoProdutoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        atualizaProdutoButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        consultaCodigoBarrasTextField = new javax.swing.JTextField();
        consultaButton = new javax.swing.JButton();
        exluirCadastroProdutoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        imagemProdutoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/error.png"))); // NOI18N
        imagemProdutoLabel.setText("jLabel11");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
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

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        codigoBarrasProdutoTextField.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Código de Barras do Produto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(codigoBarrasProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoBarrasProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Cadastro"));

        tipoProdutoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Tipo");

        jLabel5.setText("Nome do Produto");

        jLabel6.setText("Descrição do Produto");

        jLabel7.setText("Marca");

        jLabel8.setText("Valor de Compra");

        jLabel9.setText("Valor de Venda");

        jLabel12.setText("Peso Kg");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(descricaoProdutoTextField))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoProdutoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pesoProdutoTextField)
                            .addComponent(valorVendaProdutoTextField)
                            .addComponent(valorCompraProdutoTextField)
                            .addComponent(marcaProdutoTextField)
                            .addComponent(nomeProdutoTextField))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoProdutoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(descricaoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(marcaProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pesoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(valorCompraProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(valorVendaProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Consulta - Atualiza - Remove");

        atualizaProdutoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atualizaProdutoButton.setText("Atualizar");
        atualizaProdutoButton.setEnabled(false);
        atualizaProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaProdutoButtonActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta Pelo Código de Barras do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        consultaButton.setText("Consultar");
        consultaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultaCodigoBarrasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consultaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaCodigoBarrasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exluirCadastroProdutoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exluirCadastroProdutoButton.setText("Excluir");
        exluirCadastroProdutoButton.setEnabled(false);
        exluirCadastroProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exluirCadastroProdutoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(atualizaProdutoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exluirCadastroProdutoButton)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atualizaProdutoButton)
                            .addComponent(exluirCadastroProdutoButton))
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void atualizaProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaProdutoButtonActionPerformed
        boolean semImagem = false;
        boolean camposNaoPreenchidos = false;

        if (imagemProdutoLabel.getIcon() == null) {
            semImagem = true;
            JOptionPane.showMessageDialog(this, "Adicione uma imagem");
        }
        if (nomeProdutoTextField.getText().equals("") || descricaoProdutoTextField.getText().equals("")
                || marcaProdutoTextField.getText().equals("") || pesoProdutoTextField.getText().equals("")
                || valorCompraProdutoTextField.getText().equals("") || valorVendaProdutoTextField.getText().equals("")
                || codigoBarrasProdutoTextField.getText().equals("")) {
            camposNaoPreenchidos = true;
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        if (semImagem == false && camposNaoPreenchidos == false) {

            Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
            Transaction t = bancoConveniencia.beginTransaction();

            SQLQuery consultaProduto = bancoConveniencia.createSQLQuery("select * from cadastro_produto");
            consultaProduto.addEntity(CadastroProduto.class);
            List<CadastroProduto> listaCadastroProduto = (List<CadastroProduto>) consultaProduto.list();

            for (CadastroProduto u : listaCadastroProduto) {
                if (idEscolhido == u.getIdcadastroProduto()) {
                    u.setTipoProduto(tipoProdutoComboBox.getSelectedItem().toString());
                    u.setNomeProduto(nomeProdutoTextField.getText());
                    u.setDescricaoProduto(descricaoProdutoTextField.getText());
                    u.setMarcaProduto(marcaProdutoTextField.getText());
                    u.setPesoKgProduto(pesoProdutoTextField.getText());
                    u.setValorCompraProduto(valorCompraProdutoTextField.getText());
                    u.setValorVendaProduto(valorVendaProdutoTextField.getText());

                    ConversorImagemBytes x = new ConversorImagemBytes();

                    u.setImagemProduto(x.imagemByte(imagemProdutoLabel.getIcon()));

                    bancoConveniencia.update(u);

                    atualizaProdutoButton.setEnabled(false);
                    exluirCadastroProdutoButton.setEnabled(false);

                    tipoProdutoComboBox.setSelectedItem(0);
                    nomeProdutoTextField.setText("");
                    descricaoProdutoTextField.setText("");
                    marcaProdutoTextField.setText("");
                    pesoProdutoTextField.setText("");
                    valorCompraProdutoTextField.setText("");
                    valorVendaProdutoTextField.setText("");
                    codigoBarrasProdutoTextField.setText("");
                    imagemProdutoLabel.setIcon(null);

                    JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso");
                    t.commit();
                    bancoConveniencia.close();
                }
            }
        }

    }//GEN-LAST:event_atualizaProdutoButtonActionPerformed
    public int idEscolhido = -1;


    private void consultaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaButtonActionPerformed
        atualizaProdutoButton.setEnabled(false);
        exluirCadastroProdutoButton.setEnabled(false);

        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaProduto = bancoConveniencia.createSQLQuery("select * from cadastro_produto");
        consultaProduto.addEntity(CadastroProduto.class);
        List<CadastroProduto> listaCadastroUsuario = (List<CadastroProduto>) consultaProduto.list();

        t.commit();
        bancoConveniencia.close();
        boolean cadastroExistente = false;
        for (CadastroProduto u : listaCadastroUsuario) {

            if (u.getCodigoBarrasProduto().equals(consultaCodigoBarrasTextField.getText())) {

                tipoProdutoComboBox.setSelectedItem(u.getTipoProduto());
                nomeProdutoTextField.setText(u.getNomeProduto());
                descricaoProdutoTextField.setText(u.getDescricaoProduto());
                marcaProdutoTextField.setText(u.getMarcaProduto());
                pesoProdutoTextField.setText(u.getPesoKgProduto());
                valorCompraProdutoTextField.setText(u.getValorCompraProduto());
                valorVendaProdutoTextField.setText(u.getValorVendaProduto());
                codigoBarrasProdutoTextField.setText(u.getCodigoBarrasProduto());

                byte[] b = u.getImagemProduto();
                ImageIcon x = new ImageIcon(b);

                imagemProdutoLabel.setIcon(x);

                idEscolhido = u.getIdcadastroProduto();

            }
        }
        if (cadastroExistente == false) {
            JOptionPane.showMessageDialog(null, "Cadastro de Produto não Encontrado");
        }

    }//GEN-LAST:event_consultaButtonActionPerformed

    private void exluirCadastroProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exluirCadastroProdutoButtonActionPerformed

        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaProduto = bancoConveniencia.createSQLQuery("select * from cadastro_produto");
        consultaProduto.addEntity(CadastroProduto.class);
        List<CadastroProduto> listaCadastroUsuario = (List<CadastroProduto>) consultaProduto.list();

        for (CadastroProduto u : listaCadastroUsuario) {
            if (u.getIdcadastroProduto() == idEscolhido) {
                bancoConveniencia.delete(u);

                atualizaProdutoButton.setEnabled(false);
                exluirCadastroProdutoButton.setEnabled(false);

                tipoProdutoComboBox.setSelectedItem(0);
                nomeProdutoTextField.setText("");
                descricaoProdutoTextField.setText("");
                marcaProdutoTextField.setText("");
                pesoProdutoTextField.setText("");
                valorCompraProdutoTextField.setText("");
                valorVendaProdutoTextField.setText("");
                codigoBarrasProdutoTextField.setText("");
                imagemProdutoLabel.setIcon(null);
                JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso");

            }
        }


    }//GEN-LAST:event_exluirCadastroProdutoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(F6ConsultaAtualizaRemoveProdutoCadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F6ConsultaAtualizaRemoveProdutoCadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F6ConsultaAtualizaRemoveProdutoCadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F6ConsultaAtualizaRemoveProdutoCadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F6ConsultaAtualizaRemoveProdutoCadastroEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizaProdutoButton;
    private javax.swing.JTextField codigoBarrasProdutoTextField;
    private javax.swing.JButton consultaButton;
    private javax.swing.JTextField consultaCodigoBarrasTextField;
    private javax.swing.JTextField descricaoProdutoTextField;
    private javax.swing.JButton exluirCadastroProdutoButton;
    private javax.swing.JLabel imagemProdutoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField marcaProdutoTextField;
    private javax.swing.JTextField nomeProdutoTextField;
    private javax.swing.JTextField pesoProdutoTextField;
    private javax.swing.JComboBox<String> tipoProdutoComboBox;
    private javax.swing.JTextField valorCompraProdutoTextField;
    private javax.swing.JTextField valorVendaProdutoTextField;
    // End of variables declaration//GEN-END:variables
}
