package View;

import Controller.LoginController;
import javax.swing.JTextField;

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camposenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        camposenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camposenhaActionPerformed(evt);
            }
        });
        getContentPane().add(camposenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 410, 30));

        botaologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/Botão de entrar.png"))); // NOI18N
        botaologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaologinActionPerformed(evt);
            }
        });
        getContentPane().add(botaologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 400, 60));

        campologin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campologin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campologin1ActionPerformed(evt);
            }
        });
        getContentPane().add(campologin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 410, 30));

        planodefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/Estética login sem botões.jpg"))); // NOI18N
        planodefundo.setText("pla");
        getContentPane().add(planodefundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 940, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camposenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camposenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camposenhaActionPerformed

    private void campologin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campologin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campologin1ActionPerformed

    private void botaologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaologinActionPerformed
        controller.entranoSistema();
    }//GEN-LAST:event_botaologinActionPerformed

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
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaologin;
    private javax.swing.JTextField campologin1;
    private javax.swing.JTextField camposenha;
    private javax.swing.JLabel planodefundo;
    // End of variables declaration//GEN-END:variables
}
