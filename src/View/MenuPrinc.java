package View;

import Controler.MenuController;

public class MenuPrinc extends javax.swing.JFrame {

    private final MenuController controller;
    
    public MenuPrinc() {
        initComponents();
        controller = new MenuController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teladefundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro = new javax.swing.JMenu();
        campoCadastroCliente = new javax.swing.JMenuItem();
        campoCadastroFuncionario = new javax.swing.JMenuItem();
        campoCadastroServico = new javax.swing.JMenuItem();
        operacao = new javax.swing.JMenu();
        campoAgServico = new javax.swing.JMenuItem();
        campoCanServiço = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teladefundo.setBackground(new java.awt.Color(0, 0, 0));
        teladefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewimagens/black-background.png"))); // NOI18N
        teladefundo.setMaximumSize(new java.awt.Dimension(3000, 1500));
        getContentPane().add(teladefundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 800));

        cadastro.setText("Cadastro");

        campoCadastroCliente.setText("Cadastro Cliente");
        campoCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastroClienteActionPerformed(evt);
            }
        });
        cadastro.add(campoCadastroCliente);

        campoCadastroFuncionario.setText("Cadastro Funcionario");
        campoCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastroFuncionarioActionPerformed(evt);
            }
        });
        cadastro.add(campoCadastroFuncionario);

        campoCadastroServico.setText("Cadastro Serviço");
        campoCadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastroServicoActionPerformed(evt);
            }
        });
        cadastro.add(campoCadastroServico);

        jMenuBar1.add(cadastro);

        operacao.setText("Operação");

        campoAgServico.setText("Agendamento de serviço");
        campoAgServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAgServicoActionPerformed(evt);
            }
        });
        operacao.add(campoAgServico);

        campoCanServiço.setText("Cancelamento de serviço");
        operacao.add(campoCanServiço);

        jMenuBar1.add(operacao);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastroClienteActionPerformed
                 controller.CadCliente();
    }//GEN-LAST:event_campoCadastroClienteActionPerformed

    private void campoCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastroFuncionarioActionPerformed
               controller.CadFunc();
    }//GEN-LAST:event_campoCadastroFuncionarioActionPerformed

    private void campoCadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastroServicoActionPerformed
                controller.CadServico();
    }//GEN-LAST:event_campoCadastroServicoActionPerformed

    private void campoAgServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAgServicoActionPerformed
                controller.agendamento();
    }//GEN-LAST:event_campoAgServicoActionPerformed

    public static void main(String args[]) {
      

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuItem campoAgServico;
    private javax.swing.JMenuItem campoCadastroCliente;
    private javax.swing.JMenuItem campoCadastroFuncionario;
    private javax.swing.JMenuItem campoCadastroServico;
    private javax.swing.JMenuItem campoCanServiço;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu operacao;
    private javax.swing.JLabel teladefundo;
    // End of variables declaration//GEN-END:variables
}
