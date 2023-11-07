package View;

public class Agenda extends javax.swing.JFrame {
    public Agenda() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        campoId = new javax.swing.JTextField();
        painel01 = new javax.swing.JLabel();
        teladefundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 1120, 350));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Agendar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(null));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 560, 40));

        Observação.setFont(new java.awt.Font("Dialog", 0, 20)); 
        Observação.setText("Observação:");
        getContentPane().add(Observação, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 120, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        campoObservacao.setViewportView(jTextArea1);

        getContentPane().add(campoObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 750, 190));

        Hora.setFont(new java.awt.Font("Dialog", 0, 20)); 
        Hora.setText("Hora:");
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 60, -1));

        campoHora.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        campoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraActionPerformed(evt);
            }
        });
        getContentPane().add(campoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 260, 30));

        Data.setFont(new java.awt.Font("Dialog", 0, 20)); 
        Data.setText("Data:");
        getContentPane().add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 60, -1));

        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });
        getContentPane().add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 260, 30));

        Valor.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Valor.setText("Valor:");
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, -1));

        campoValor.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 260, 30));

        Serviço.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Serviço.setText("Serviço:");
        getContentPane().add(Serviço, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 80, -1));

        campoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        campoServico.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        campoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoServicoActionPerformed(evt);
            }
        });
        getContentPane().add(campoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 260, 30));

        Nome.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Nome.setText("Nome:");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 60, -1));

        campoNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        campoNome.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 260, 30));

        id.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        id.setText("ID:");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 30, -1));

        campoId.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        getContentPane().add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 260, 30));

        painel01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/Design sem nome (2).png"))); // NOI18N
        getContentPane().add(painel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 1290, 680));

        teladefundo.setBackground(new java.awt.Color(0, 0, 0));
        teladefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/black-background.png"))); // NOI18N
        teladefundo.setMaximumSize(new java.awt.Dimension(3000, 1500));
        getContentPane().add(teladefundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 800));

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel painel01;
    private javax.swing.JLabel teladefundo;
    // End of variables declaration//GEN-END:variables
}
