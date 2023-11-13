package View;

import Controller.AgendaController;
import Model.DAO.AgendamentoDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Agenda extends javax.swing.JFrame {
    
    private final AgendaController controller;
    
    public Agenda() {
        initComponents();
        this.controller = new AgendaController(this);
    }
    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelBotaoVoltar = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        scrollTabelaAgenda = new javax.swing.JScrollPane();
        TabelaAgendamentos = new javax.swing.JTable();
        buttonFazerAgendamento = new javax.swing.JButton();
        Observação = new javax.swing.JLabel();
        scrollObservacao = new javax.swing.JScrollPane();
        campoObservacao = new javax.swing.JTextArea();
        Nome = new javax.swing.JLabel();
        campoNomeCliente = new javax.swing.JTextField();
        Serviço = new javax.swing.JLabel();
        campoNomeServico = new javax.swing.JTextField();
        Valor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        Data = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        Hora = new javax.swing.JLabel();
        campoHora = new javax.swing.JTextField();
        teladefundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/Botão voltar PRETO.png"))); // NOI18N
        getContentPane().add(labelBotaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 170, 80));

        buttonVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 90, 80));

        TabelaAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTabelaAgenda.setViewportView(TabelaAgendamentos);

        getContentPane().add(scrollTabelaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 1140, 350));

        buttonFazerAgendamento.setBackground(new java.awt.Color(0, 255, 0));
        buttonFazerAgendamento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonFazerAgendamento.setText("AGENDAR");
        buttonFazerAgendamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonFazerAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFazerAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonFazerAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 750, 40));

        Observação.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Observação.setText("Observação:");
        getContentPane().add(Observação, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 120, -1));

        campoObservacao.setColumns(20);
        campoObservacao.setRows(5);
        scrollObservacao.setViewportView(campoObservacao);

        getContentPane().add(scrollObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 750, 180));

        Nome.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Nome.setText("Nome:");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, -1));

        campoNomeCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(campoNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 260, 30));

        Serviço.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Serviço.setText("Serviço:");
        getContentPane().add(Serviço, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 80, -1));

        campoNomeServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoNomeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeServicoActionPerformed(evt);
            }
        });
        getContentPane().add(campoNomeServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 260, 30));

        Valor.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Valor.setText("Valor:");
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 60, -1));

        campoValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 260, 30));

        Data.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Data.setText("Data:");
        getContentPane().add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, -1));

        campoData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });
        getContentPane().add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 260, 30));

        Hora.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Hora.setText("Hora:");
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 60, -1));

        campoHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraActionPerformed(evt);
            }
        });
        getContentPane().add(campoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 260, 30));

        teladefundo.setBackground(new java.awt.Color(0, 0, 0));
        teladefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/Fundo 1920 Agenda.jpg"))); // NOI18N
        teladefundo.setMaximumSize(new java.awt.Dimension(3000, 1500));
        getContentPane().add(teladefundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1420, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void campoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraActionPerformed

    private void buttonFazerAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFazerAgendamentoActionPerformed
        controller.fazerAgendamento();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFazerAgendamentoActionPerformed

    private void campoNomeServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeServicoActionPerformed

    private void campoNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeClienteActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        controller.voltarMenuPrinc();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoltarActionPerformed

    
    
    
    
    
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
    private javax.swing.JTable TabelaAgendamentos;
    private javax.swing.JLabel Valor;
    private javax.swing.JButton buttonFazerAgendamento;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JTextField campoNomeServico;
    private javax.swing.JTextArea campoObservacao;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelBotaoVoltar;
    private javax.swing.JScrollPane scrollObservacao;
    private javax.swing.JScrollPane scrollTabelaAgenda;
    private javax.swing.JLabel teladefundo;
    // End of variables declaration//GEN-END:variables

    public JTextField getCampoData() {
        return campoData;
    }

    public void setCampoData(JTextField campoData) {
        this.campoData = campoData;
    }

    public JTextField getCampoHora() {
        return campoHora;
    }

    public void setCampoHora(JTextField campoHora) {
        this.campoHora = campoHora;
    }

    public JTextField getCampoNomeCliente() {
        return campoNomeCliente;
    }

    public void setCampoNomeCliente(JTextField campoNomeCliente) {
        this.campoNomeCliente = campoNomeCliente;
    }

    public JTextField getCampoNomeServico() {
        return campoNomeServico;
    }

    public void setCampoNomeServico(JTextField campoNomeServico) {
        this.campoNomeServico = campoNomeServico;
    }

    public JTextArea getCampoObservacao() {
        return campoObservacao;
    }

    public void setCampoObservacao(JTextArea campoObservacao) {
        this.campoObservacao = campoObservacao;
    }

    public JTextField getCampoValor() {
        return campoValor;
    }

    public void setCampoValor(JTextField campoValor) {
        this.campoValor = campoValor;
    }

    public JTable getTabelaAgendamentos() {
        return TabelaAgendamentos;
    }

    public void setTabelaAgendamentos(JTable TabelaAgendamentos) {
        this.TabelaAgendamentos = TabelaAgendamentos;
    }

    private void listarValores(){
        try {
            
            AgendamentoDAO objAgendamentoDAO = new AgendamentoDAO();
            
            //DefaultTableModel
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    
    
    
    
    
    


    
    
    
    
}
