package View;

import Controller.MenuController;

public class MenuPrinc extends javax.swing.JFrame {

    private final MenuController controller;
    
    public MenuPrinc() {
        initComponents();
        controller = new MenuController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadFuncionario = new javax.swing.JToggleButton();
        CadServiço = new javax.swing.JToggleButton();
        CadFuncionario1 = new javax.swing.JToggleButton();
        CadFuncionario2 = new javax.swing.JToggleButton();
        CadFuncionario3 = new javax.swing.JToggleButton();
        teladefundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CadFuncionario.setText("Agendamento");
        CadFuncionario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(CadFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 260, 60));

        CadServiço.setBackground(new java.awt.Color(204, 204, 204));
        CadServiço.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CadServiço.setText("Cadastro de Serviço");
        CadServiço.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CadServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadServiçoActionPerformed(evt);
            }
        });
        getContentPane().add(CadServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 60));

        CadFuncionario1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CadFuncionario1.setText("Cadastro de Funcionário");
        CadFuncionario1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CadFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncionario1ActionPerformed(evt);
            }
        });
        getContentPane().add(CadFuncionario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 260, 60));

        CadFuncionario2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CadFuncionario2.setText("Cancelamento de serviço");
        CadFuncionario2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CadFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncionario2ActionPerformed(evt);
            }
        });
        getContentPane().add(CadFuncionario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 260, 60));

        CadFuncionario3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CadFuncionario3.setText("Cadastro de Cliente");
        CadFuncionario3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CadFuncionario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncionario3ActionPerformed(evt);
            }
        });
        getContentPane().add(CadFuncionario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 260, 60));

        teladefundo.setBackground(new java.awt.Color(0, 0, 0));
        teladefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/MenuPrincipal background.jpg"))); // NOI18N
        teladefundo.setMaximumSize(new java.awt.Dimension(3000, 1500));
        getContentPane().add(teladefundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 800));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadFuncionarioActionPerformed

    private void CadServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadServiçoActionPerformed
        controller.CadServico();
    }//GEN-LAST:event_CadServiçoActionPerformed

    private void CadFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncionario1ActionPerformed
              controller.CadFunc();
    }//GEN-LAST:event_CadFuncionario1ActionPerformed

    private void CadFuncionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncionario2ActionPerformed
               controller.agendamento();
    }//GEN-LAST:event_CadFuncionario2ActionPerformed

    private void CadFuncionario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncionario3ActionPerformed
            controller.CadCliente();
    }//GEN-LAST:event_CadFuncionario3ActionPerformed

    public static void main(String args[]) {
      

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CadFuncionario;
    private javax.swing.JToggleButton CadFuncionario1;
    private javax.swing.JToggleButton CadFuncionario2;
    private javax.swing.JToggleButton CadFuncionario3;
    private javax.swing.JToggleButton CadServiço;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel teladefundo;
    // End of variables declaration//GEN-END:variables
}
