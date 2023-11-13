/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastroFuncController;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class CadastroFunc extends javax.swing.JFrame {
    
    private final CadastroFuncController controller;

    /**
     * Creates new form telaCadastroFuncionario
     */
    public CadastroFunc() {
        initComponents();
        this.controller = new CadastroFuncController(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBotaoVoltar = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        labelTituloCadFunc = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        Nome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        DataNascimento = new javax.swing.JLabel();
        campoDataNascimento = new javax.swing.JTextField();
        labelFormatoData = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        Genero = new javax.swing.JLabel();
        campoGenero = new javax.swing.JComboBox<>();
        Endereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        CEP = new javax.swing.JLabel();
        campoCEP = new javax.swing.JTextField();
        Complemento = new javax.swing.JLabel();
        campoComplemento = new javax.swing.JTextField();
        NivelAcesso = new javax.swing.JLabel();
        campoNivelAcesso = new javax.swing.JComboBox<>();
        Senha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        telafundofuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(636, 568));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/Botão voltar Branco menor.png"))); // NOI18N
        getContentPane().add(labelBotaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -60, -1, -1));

        buttonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        buttonVoltar.setForeground(new java.awt.Color(242, 242, 242));
        buttonVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 50, 50));

        labelTituloCadFunc.setBackground(new java.awt.Color(255, 255, 255));
        labelTituloCadFunc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTituloCadFunc.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloCadFunc.setText("Cadastro de Funcionario");
        getContentPane().add(labelTituloCadFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 290, 40));

        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 620, 10));

        Nome.setForeground(new java.awt.Color(255, 255, 255));
        Nome.setText("Nome Completo:");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 470, -1));
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 360, 30));

        CPF.setForeground(new java.awt.Color(255, 255, 255));
        CPF.setText("CPF:");
        getContentPane().add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));
        getContentPane().add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, 30));

        DataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        DataNascimento.setText("Data de Nascimento:");
        getContentPane().add(DataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));
        getContentPane().add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 160, 30));

        labelFormatoData.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        labelFormatoData.setForeground(new java.awt.Color(255, 255, 255));
        labelFormatoData.setText("(YYYY/MM/DD)");
        getContentPane().add(labelFormatoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        Telefone.setForeground(new java.awt.Color(255, 255, 255));
        Telefone.setText("Telefone:");
        getContentPane().add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 160, 30));

        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("E-mail:");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 160, 30));

        Genero.setForeground(new java.awt.Color(255, 255, 255));
        Genero.setText("Gênero:");
        getContentPane().add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 50, 20));

        campoGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Feminino" }));
        campoGenero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                campoGeneroItemStateChanged(evt);
            }
        });
        getContentPane().add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 160, 30));

        Endereco.setForeground(new java.awt.Color(255, 255, 255));
        Endereco.setText("Endereço:");
        getContentPane().add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        getContentPane().add(campoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, 30));

        CEP.setForeground(new java.awt.Color(255, 255, 255));
        CEP.setText("CEP:");
        getContentPane().add(CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));
        getContentPane().add(campoCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, 30));

        Complemento.setForeground(new java.awt.Color(255, 255, 255));
        Complemento.setText("Complemento:");
        getContentPane().add(Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        campoComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(campoComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 160, 30));

        NivelAcesso.setForeground(new java.awt.Color(255, 255, 255));
        NivelAcesso.setText("Acesso:");
        getContentPane().add(NivelAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        campoNivelAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(campoNivelAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 160, 30));

        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("Senha:");
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 160, 30));

        botaoCadastrar.setBackground(new java.awt.Color(0, 255, 0));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 290, 50));

        telafundofuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/background cadastros.jpg"))); // NOI18N
        getContentPane().add(telafundofuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        controller.cadastrarFuncionario();
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void campoGeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_campoGeneroItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_campoGeneroItemStateChanged

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        controller.voltarMenuPrinc();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void campoComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoComplementoActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Complemento;
    private javax.swing.JLabel DataNascimento;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Genero;
    private javax.swing.JLabel NivelAcesso;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JComboBox<String> campoGenero;
    private javax.swing.JComboBox<String> campoNivelAcesso;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel labelBotaoVoltar;
    private javax.swing.JLabel labelFormatoData;
    private javax.swing.JLabel labelTituloCadFunc;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel telafundofuncionario;
    // End of variables declaration//GEN-END:variables

    public JTextField getCampoCEP() {
        return campoCEP;
    }

    public void setCampoCEP(JTextField campoCEP) {
        this.campoCEP = campoCEP;
    }

    public JTextField getCampoCPF() {
        return campoCPF;
    }

    public void setCampoCPF(JTextField campoCPF) {
        this.campoCPF = campoCPF;
    }

    public JTextField getCampoComplemento() {
        return campoComplemento;
    }

    public void setCampoComplemento(JTextField campoComplemento) {
        this.campoComplemento = campoComplemento;
    }

    public JTextField getCampoDataNascimento() {
        return campoDataNascimento;
    }

    public void setCampoDataNascimento(JTextField campoDataNascimento) {
        this.campoDataNascimento = campoDataNascimento;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
    }

    public JTextField getCampoEndereco() {
        return campoEndereco;
    }

    public void setCampoEndereco(JTextField campoEndereco) {
        this.campoEndereco = campoEndereco;
    }

    public JComboBox<String> getCampoGenero() {
        return campoGenero;
    }

    public void setCampoGenero(JComboBox<String> campoGenero) {
        this.campoGenero = campoGenero;
    }

    public JComboBox<String> getCampoNivelAcesso() {
        return campoNivelAcesso;
    }

    public void setCampoNivelAcesso(JComboBox<String> campoNivelAcesso) {
        this.campoNivelAcesso = campoNivelAcesso;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public JTextField getCampoSenha() {
        return campoSenha;
    }

    public void setCampoSenha(JTextField campoSenha) {
        this.campoSenha = campoSenha;
    }

    public JTextField getCampoTelefone() {
        return campoTelefone;
    }

    public void setCampoTelefone(JTextField campoTelefone) {
        this.campoTelefone = campoTelefone;
    }



}
