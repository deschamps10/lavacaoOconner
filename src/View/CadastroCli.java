/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Usuario
 */
public class CadastroCli extends javax.swing.JFrame {

    /**
     * Creates new form telacadastrocliente
     */
    public CadastroCli() {
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

        Complemento = new javax.swing.JLabel();
        campoComplemento = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        Cep = new javax.swing.JLabel();
        campoCep = new javax.swing.JTextField();
        datadenascimento = new javax.swing.JLabel();
        campoDataNascimento = new javax.swing.JTextField();
        campoGenero = new javax.swing.JComboBox<>();
        genero = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        telefone = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        titulocadstrocliente = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Complemento.setForeground(new java.awt.Color(255, 255, 255));
        Complemento.setText("Complemento:");
        getContentPane().add(Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));
        getContentPane().add(campoComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 160, 30));

        endereco.setForeground(new java.awt.Color(255, 255, 255));
        endereco.setText("Endereço:");
        getContentPane().add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        getContentPane().add(campoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 30));

        Cep.setForeground(new java.awt.Color(255, 255, 255));
        Cep.setText("CEP:");
        getContentPane().add(Cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        getContentPane().add(campoCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 160, 30));

        datadenascimento.setForeground(new java.awt.Color(255, 255, 255));
        datadenascimento.setText("Data de Nascimento:");
        getContentPane().add(datadenascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));

        campoGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        campoGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 30));

        genero.setForeground(new java.awt.Color(255, 255, 255));
        genero.setText("Gênero:");
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 160, 30));

        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("E-mail:");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 160, 30));

        telefone.setForeground(new java.awt.Color(255, 255, 255));
        telefone.setText("Telefone:");
        getContentPane().add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        CPF.setForeground(new java.awt.Color(255, 255, 255));
        CPF.setText("CPF:");
        getContentPane().add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });
        getContentPane().add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 160, 30));
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, 30));

        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome Completo:");
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 280, -1));

        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 10));

        titulocadstrocliente.setBackground(new java.awt.Color(255, 255, 255));
        titulocadstrocliente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titulocadstrocliente.setForeground(new java.awt.Color(255, 255, 255));
        titulocadstrocliente.setText("Cadastro de Cliente:");
        getContentPane().add(titulocadstrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 220, 30));

        botaoCadastrar.setBackground(new java.awt.Color(0, 255, 0));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 290, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/background cadastros.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPFActionPerformed

    private void campoGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoGeneroActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cep;
    private javax.swing.JLabel Complemento;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JComboBox<String> campoGenero;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel datadenascimento;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nome;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel telefone;
    private javax.swing.JLabel titulocadstrocliente;
    // End of variables declaration//GEN-END:variables
}
