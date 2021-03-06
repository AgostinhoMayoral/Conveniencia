/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frames;

import java.awt.event.KeyEvent;

/**
 *
 * @author tinho
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cadastrarUsuarioButton = new javax.swing.JButton();
        cadastrarRetiradaProdutotButton = new javax.swing.JButton();
        cadastrarAdministradorButton = new javax.swing.JButton();
        cadastrarNovoProdutoButton = new javax.swing.JButton();
        consultarEditarRemoverProdutoButton = new javax.swing.JButton();
        listaCompletaProdutosButton = new javax.swing.JButton();
        cadastrarEntradaProdutosButton = new javax.swing.JButton();
        historicoVendasButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/error.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/diminish mecher4.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel3)
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));

        cadastrarUsuarioButton.setText("F11: Cadastrar Usuário");
        cadastrarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioButtonActionPerformed(evt);
            }
        });
        cadastrarUsuarioButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarUsuarioButtonKeyPressed(evt);
            }
        });

        cadastrarRetiradaProdutotButton.setText("F10: Cadastrar Retirada de Produto");
        cadastrarRetiradaProdutotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarRetiradaProdutotButtonActionPerformed(evt);
            }
        });
        cadastrarRetiradaProdutotButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarRetiradaProdutotButtonKeyPressed(evt);
            }
        });

        cadastrarAdministradorButton.setText("F12: Cadastrar Administrador");
        cadastrarAdministradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAdministradorButtonActionPerformed(evt);
            }
        });
        cadastrarAdministradorButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarAdministradorButtonKeyPressed(evt);
            }
        });

        cadastrarNovoProdutoButton.setText("F5: Cadastrar Novo Produto");
        cadastrarNovoProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNovoProdutoButtonActionPerformed(evt);
            }
        });
        cadastrarNovoProdutoButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarNovoProdutoButtonKeyPressed(evt);
            }
        });

        consultarEditarRemoverProdutoButton.setText("F6: Consulta, Edita e Remove Produto do Cadastro");
        consultarEditarRemoverProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEditarRemoverProdutoButtonActionPerformed(evt);
            }
        });
        consultarEditarRemoverProdutoButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultarEditarRemoverProdutoButtonKeyPressed(evt);
            }
        });

        listaCompletaProdutosButton.setText("F7: Lista Completa de Produtos");
        listaCompletaProdutosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCompletaProdutosButtonActionPerformed(evt);
            }
        });
        listaCompletaProdutosButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaCompletaProdutosButtonKeyPressed(evt);
            }
        });

        cadastrarEntradaProdutosButton.setText("F9: Cadastrar Entrada de Produto");
        cadastrarEntradaProdutosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarEntradaProdutosButtonActionPerformed(evt);
            }
        });
        cadastrarEntradaProdutosButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarEntradaProdutosButtonKeyPressed(evt);
            }
        });

        historicoVendasButton.setText("F8: Histórico de Vendas");
        historicoVendasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoVendasButtonActionPerformed(evt);
            }
        });
        historicoVendasButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                historicoVendasButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultarEditarRemoverProdutoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarNovoProdutoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaCompletaProdutosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historicoVendasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarEntradaProdutosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarRetiradaProdutotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarAdministradorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(142, 142, 142))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrarNovoProdutoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarEditarRemoverProdutoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaCompletaProdutosButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historicoVendasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarEntradaProdutosButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarRetiradaProdutotButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarUsuarioButton)
                .addGap(4, 4, 4)
                .addComponent(cadastrarAdministradorButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 298, -1));

        jButton1.setText("consultaatualizaexluiAdm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 320, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Menu().setExtendedState(Menu.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void cadastrarNovoProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNovoProdutoButtonActionPerformed
        new F5CadastroProduto().setVisible(true);
    }//GEN-LAST:event_cadastrarNovoProdutoButtonActionPerformed

    private void cadastrarNovoProdutoButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarNovoProdutoButtonKeyPressed
        int codigo = evt.getKeyCode();
        int tecla = KeyEvent.VK_F5;
        if (codigo == tecla) {
            //pegando valor digitado
            new F5CadastroProduto().setVisible(true);

        }
    }//GEN-LAST:event_cadastrarNovoProdutoButtonKeyPressed

    private void consultarEditarRemoverProdutoButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultarEditarRemoverProdutoButtonKeyPressed
        int codigo = evt.getKeyCode();
        int tecla = KeyEvent.VK_F6;
        if (codigo == tecla) {
            //pegando valor digitado
            new F6ConsultaAtualizaRemoveProdutoCadastroEstoque().setVisible(true);

        }
    }//GEN-LAST:event_consultarEditarRemoverProdutoButtonKeyPressed

    private void consultarEditarRemoverProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEditarRemoverProdutoButtonActionPerformed
        new F6ConsultaAtualizaRemoveProdutoCadastroEstoque().setVisible(true);
    }//GEN-LAST:event_consultarEditarRemoverProdutoButtonActionPerformed

    private void listaCompletaProdutosButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaCompletaProdutosButtonKeyPressed
        int codigo = evt.getKeyCode();
        int tecla = KeyEvent.VK_F7;
        if (codigo == tecla) {
            //pegando valor digitado
            new F7ListaCompletaProdutos().setVisible(true);

        }
    }//GEN-LAST:event_listaCompletaProdutosButtonKeyPressed

    private void historicoVendasButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_historicoVendasButtonKeyPressed
        int codigo = evt.getKeyCode();
        int tecla = KeyEvent.VK_F8;
        if (codigo == tecla) {
            //pegando valor digitado
            new F8HistoricoVendas().setVisible(true);

        }
    }//GEN-LAST:event_historicoVendasButtonKeyPressed

    private void cadastrarEntradaProdutosButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarEntradaProdutosButtonKeyPressed
        int codigo = evt.getKeyCode();
        int tecla = KeyEvent.VK_F9;
        if (codigo == tecla) {
            //pegando valor digitado
            new F9CadastroEntradaProduto().setVisible(true);

        }
    }//GEN-LAST:event_cadastrarEntradaProdutosButtonKeyPressed

    private void cadastrarRetiradaProdutotButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarRetiradaProdutotButtonKeyPressed
        int codigo = evt.getKeyCode();
        int tecla = KeyEvent.VK_F10;
        if (codigo == tecla) {
            //pegando valor digitado
            new F10CadastroRetiradaProduto().setVisible(true);

        }
    }//GEN-LAST:event_cadastrarRetiradaProdutotButtonKeyPressed

    private void cadastrarUsuarioButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarUsuarioButtonKeyPressed
        int codigo = evt.getKeyCode();
        int tecla = KeyEvent.VK_F11;
        if (codigo == tecla) {
            //pegando valor digitado
            new F11CadastroUsuario().setVisible(true);

        }
    }//GEN-LAST:event_cadastrarUsuarioButtonKeyPressed

    private void cadastrarAdministradorButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarAdministradorButtonKeyPressed
        int codigo = evt.getKeyCode();
        int tecla = KeyEvent.VK_F12;
        if (codigo == tecla) {
            //pegando valor digitado
            new F12CadastroAdministrador().setVisible(true);

        }
    }//GEN-LAST:event_cadastrarAdministradorButtonKeyPressed

    private void listaCompletaProdutosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCompletaProdutosButtonActionPerformed
        new F7ListaCompletaProdutos().setVisible(true);
    }//GEN-LAST:event_listaCompletaProdutosButtonActionPerformed

    private void historicoVendasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoVendasButtonActionPerformed
        new F8HistoricoVendas().setVisible(true);
    }//GEN-LAST:event_historicoVendasButtonActionPerformed

    private void cadastrarEntradaProdutosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarEntradaProdutosButtonActionPerformed
        new F9CadastroEntradaProduto().setVisible(true);
    }//GEN-LAST:event_cadastrarEntradaProdutosButtonActionPerformed

    private void cadastrarRetiradaProdutotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarRetiradaProdutotButtonActionPerformed
        new F10CadastroRetiradaProduto().setVisible(true);
    }//GEN-LAST:event_cadastrarRetiradaProdutotButtonActionPerformed

    private void cadastrarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioButtonActionPerformed
        new F11CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_cadastrarUsuarioButtonActionPerformed

    private void cadastrarAdministradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAdministradorButtonActionPerformed
        new F12CadastroAdministrador().setVisible(true);
    }//GEN-LAST:event_cadastrarAdministradorButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ConsultaAtualizaExcluiCadastroAdministrador().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    int xx;
    int yy;

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarAdministradorButton;
    private javax.swing.JButton cadastrarEntradaProdutosButton;
    private javax.swing.JButton cadastrarNovoProdutoButton;
    private javax.swing.JButton cadastrarRetiradaProdutotButton;
    private javax.swing.JButton cadastrarUsuarioButton;
    private javax.swing.JButton consultarEditarRemoverProdutoButton;
    private javax.swing.JButton historicoVendasButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton listaCompletaProdutosButton;
    // End of variables declaration//GEN-END:variables
}
