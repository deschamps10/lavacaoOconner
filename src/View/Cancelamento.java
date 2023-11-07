package View;

public class Cancelamento extends javax.swing.JFrame {

    public Cancelamento() {
        initComponents();
    }

    @SuppressWarnings("dsd")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Observação = new javax.swing.JLabel();
        campoObservacao = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Hora = new javax.swing.JLabel();
        campoHora = new javax.swing.JTextField();
        Data = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        Valor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        Serviço = new javax.swing.JLabel();
        campoServico = new javax.swing.JComboBox<>();
        Nome = new javax.swing.JLabel();
        campoNome = new javax.swing.JComboBox<>();
        id = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        campoId = new javax.swing.JTextField();
        painel01 = new javax.swing.JLabel();
        teladefundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Cancelar serviço");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, 400, 40));

        Observação.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Observação.setText("Observação:");
        getContentPane().add(Observação, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 120, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        campoObservacao.setViewportView(jTextArea1);

        getContentPane().add(campoObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 750, 250));

        Hora.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Hora.setText("Hora:");
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 60, -1));

        campoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraActionPerformed(evt);
            }
        });
        getContentPane().add(campoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 260, 30));

        Data.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Data.setText("Data:");
        getContentPane().add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 60, -1));

        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });
        getContentPane().add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 260, 30));

        Valor.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Valor.setText("Valor:");
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 60, -1));

        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 260, 30));

        Serviço.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Serviço.setText("Serviço:");
        getContentPane().add(Serviço, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, -1));

        campoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        campoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoServicoActionPerformed(evt);
            }
        });
        getContentPane().add(campoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 260, 30));

        Nome.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Nome.setText("Nome:");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 60, -1));

        campoNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 260, 30));

        id.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        id.setText("ID:");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 30, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");

        jTextField1.setBackground(new java.awt.Color(242, 242, 242));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField1.setText("CANCELAMENTO DE SERVIÇO");
        jTextField1.setAlignmentX(1.0F);
        jTextField1.setAlignmentY(1.0F);
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 300, 50));
        getContentPane().add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 260, 30));

        painel01.setBackground(new java.awt.Color(0, 0, 0));
        painel01.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        painel01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/Design sem nome (2).png"))); // NOI18N
        getContentPane().add(painel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 740));

        teladefundo.setBackground(new java.awt.Color(0, 0, 0));
        teladefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/black-background.png"))); // NOI18N
        teladefundo.setMaximumSize(new java.awt.Dimension(3000, 1500));
        getContentPane().add(teladefundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1420, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoServicoActionPerformed

    private void campoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void campoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancelamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Observação;
    private javax.swing.JLabel Serviço;
    private javax.swing.JLabel Valor;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoId;
    private javax.swing.JComboBox<String> campoNome;
    private javax.swing.JScrollPane campoObservacao;
    private javax.swing.JComboBox<String> campoServico;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel painel01;
    private javax.swing.JLabel teladefundo;
    // End of variables declaration//GEN-END:variables
}