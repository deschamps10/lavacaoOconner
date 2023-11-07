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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        campoNome = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        titulocadstrocliente = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/black-background.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 130, 40));

        Complemento.setText("Complemento:");
        getContentPane().add(Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));
        getContentPane().add(campoComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 160, 30));

        endereco.setText("Endereço:");
        getContentPane().add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));
        getContentPane().add(campoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, 30));

        Cep.setText("CEP:");
        getContentPane().add(Cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));
        getContentPane().add(campoCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 160, 30));

        datadenascimento.setText("Data de Nascimento:");
        getContentPane().add(datadenascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, 30));

        campoGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 30));

        genero.setText("Gênero");
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 160, 30));

        email.setText("E-mail:");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 30));

        telefone.setText("Telefone:");
        getContentPane().add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, 30));

        nome.setText("Nome Completo:");
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        separador.setForeground(new java.awt.Color(0, 0, 0));
        separador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 10));

        titulocadstrocliente.setBackground(new java.awt.Color(255, 255, 255));
        titulocadstrocliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulocadstrocliente.setText("Cadastro de Cliente:");
        getContentPane().add(titulocadstrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 250, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

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
    private javax.swing.JLabel Cep;
    private javax.swing.JLabel Complemento;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nome;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel telefone;
    private javax.swing.JLabel titulocadstrocliente;
    // End of variables declaration//GEN-END:variables
}
