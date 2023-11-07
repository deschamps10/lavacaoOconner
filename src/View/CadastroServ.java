package View;

public class CadastroServ extends javax.swing.JFrame {
   

    public CadastroServ() {
        initComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulocadstrocliente = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        Id = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        servico = new javax.swing.JLabel();
        campoServico = new javax.swing.JTextField();
        valor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulocadstrocliente.setBackground(new java.awt.Color(255, 255, 255));
        titulocadstrocliente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titulocadstrocliente.setForeground(new java.awt.Color(255, 255, 255));
        titulocadstrocliente.setText("Cadastro de Serviço:");
        getContentPane().add(titulocadstrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 280, 30));

        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 10));

        Id.setForeground(new java.awt.Color(255, 255, 255));
        Id.setText("ID:");
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        getContentPane().add(campoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        servico.setForeground(new java.awt.Color(255, 255, 255));
        servico.setText("Serviço:");
        getContentPane().add(servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 10));
        getContentPane().add(campoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 180, 30));

        valor.setForeground(new java.awt.Color(255, 255, 255));
        valor.setText("Valor:");
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, 30));

        descricao.setForeground(new java.awt.Color(255, 255, 255));
        descricao.setText("Descrição:");
        getContentPane().add(descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        campoDescricao.setViewportView(jTextArea1);

        getContentPane().add(campoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 370, 110));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Cadastrar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/black-background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel Id;
    private javax.swing.JScrollPane campoDescricao;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoServico;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel descricao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel servico;
    private javax.swing.JLabel titulocadstrocliente;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}
