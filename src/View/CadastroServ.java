package View;

public class CadastroServ extends javax.swing.JFrame {
   

    public CadastroServ() {
        initComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadastrar = new javax.swing.JButton();
        titulocadstrocliente = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        servico = new javax.swing.JLabel();
        campoServico = new javax.swing.JTextField();
        valor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoCadastrar.setBackground(new java.awt.Color(0, 255, 0));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.setBorder(null);
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 290, 50));

        titulocadstrocliente.setBackground(new java.awt.Color(255, 255, 255));
        titulocadstrocliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulocadstrocliente.setForeground(new java.awt.Color(255, 255, 255));
        titulocadstrocliente.setText("Cadastro de Serviço");
        getContentPane().add(titulocadstrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 230, 40));

        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 10));

        servico.setForeground(new java.awt.Color(255, 255, 255));
        servico.setText("Serviço:");
        getContentPane().add(servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 10));
        getContentPane().add(campoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 30));

        valor.setForeground(new java.awt.Color(255, 255, 255));
        valor.setText("Valor:");
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, 30));

        descricao.setForeground(new java.awt.Color(255, 255, 255));
        descricao.setText("Descrição:");
        getContentPane().add(descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        campoDescricao.setViewportView(jTextArea1);

        getContentPane().add(campoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 370, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/background cadastros.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CadastroServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JScrollPane campoDescricao;
    private javax.swing.JTextField campoServico;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel servico;
    private javax.swing.JLabel titulocadstrocliente;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}
