package ModelDAO;

import Model.Agendamento;
import java.sql.*;
import javax.swing.JOptionPane;

public class AgendamentoDAO {
    Connection conexao;
    
    public ResultSet adicionarAgendamento(Agendamento agendamento) {
        
        conexao = new Conexao().conectaBD();
        
        try {
                            // conferir informações na tabela. tabela nao criada. 
            String sql = "INSERT INTO Agendamentos () VALUES\n()";
            PreparedStatement pstm = conexao.prepareStatement(sql);

//              criar objCliente em CadastroClienteController
//          
//            pstm.setString(1, objAgendamento.getNomeCliente()); 
//            pstm.setString(2, objAgendamento.getNomeServico());
//            pstm.setString(3, objAgendamento.getValorServico());
//            pstm.setString(4, objAgendamento.getData());
//            pstm.setString(5, objAgendamento.getHora());
//            pstm.setString(6, objAgendamento.getObservacao());
//            ResultSet rs = pstm.executeQuery();
//            return rs;

//                              conferir os get utilizados




            return null;    // so por enquanto 
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return null;
        }
        
        
    }
    
    
}
