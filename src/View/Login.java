package View;

import Controller.LoginController;
import ModelDAO.UsuarioDAO;
import Model.Funcionario;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    public Login() {
        initComponents();
        controller = new LoginController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        camposenha = new javax.swing.JTextField();
        botaologin = new javax.swing.JButton();
        campologin1 = new javax.swing.JTextField();
        planodefundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camposenha.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        camposenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposenhaActionPerformed(evt);
            }
        });
        getContentPane().add(camposenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 410, 40));

        botaologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Botão de entrar.png"))); // NOI18N
        botaologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaologinActionPerformed(evt);
            }
        });
        getContentPane().add(botaologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 390, 60));

        campologin1.setToolTipText("LabelLogin");
        campologin1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        campologin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campologin1ActionPerformed(evt);
            }
        });
        getContentPane().add(campologin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 410, 40));

        planodefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Brian estética automotiva.jpg"))); // NOI18N
        planodefundo.setText("pla");
        getContentPane().add(planodefundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camposenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camposenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camposenhaActionPerformed

    private void campologin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campologin1ActionPerformed
      
    }//GEN-LAST:event_campologin1ActionPerformed

    private void botaologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaologinActionPerformed
        try {
            String usuario_nome, senha_usuario;
            usuario_nome = campologin1.getText();
            senha_usuario = camposenha.getText();

            // Cria um objeto Usuario com as informações de usuário e senha.
            Funcionario pessoa = new Funcionario(usuario_nome, senha_usuario);
            pessoa.setEmail(usuario_nome);
            pessoa.setSenha(senha_usuario);

            // Cria um objeto UsuarioDAO para realizar operações no banco de dados.
            UsuarioDAO objUsuarioDao = new UsuarioDAO();
            ResultSet rsUsuarioDAO = objUsuarioDao.autenticaUsuario(pessoa);

            if (rsUsuarioDAO.next()) {
                // Se houver um resultado na consulta, redireciona para a próxima tela.
                MenuPrinc objFrmPrincpalView = new MenuPrinc();
                objFrmPrincpalView.setVisible(true);
                //objFrmPrincpalView.dispose(); // Fecha a tela de login.
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha Incorretos!"); // Exibe uma mensagem de erro.
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro); // Trata exceções do banco de dados e exibe mensagens de erro.
        }
    }//GEN-LAST:event_botaologinActionPerformed

    public JTextField getCampologin1() {
        return campologin1;
    }

    public void setCampologin1(JTextField campologin1) {
        this.campologin1 = campologin1;
    }

    public JTextField getCamposenha() {
        return camposenha;
    }

    public void setCamposenha(JTextField camposenha) {
        this.camposenha = camposenha;
    }

  
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaologin;
    private javax.swing.JTextField campologin1;
    private javax.swing.JTextField camposenha;
    private javax.swing.JLabel planodefundo;
    // End of variables declaration//GEN-END:variables
}
