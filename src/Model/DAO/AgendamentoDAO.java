package Model.DAO;

import Model.Agendamento;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AgendamentoDAO {
    
    Connection conexao;
    ArrayList<Agendamento> lista = new ArrayList<>();
    
    public int adicionarAgendamento(Agendamento objAgendamento) {
        
        conexao = new Conexao().conectaBD();
        
        try {
                            // conferir informações na tabela. tabela nao criada. 
            String sql = "INSERT INTO Agendamentos (nomeClient, servico, valor, data, hora, obs) VALUES\n(?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = conexao.prepareStatement(sql);

          
            pstm.setString(1, objAgendamento.getNome_cliente()); 
            pstm.setString(2, objAgendamento.getNome_servico());
            pstm.setString(3, objAgendamento.getValor());
            pstm.setString(4, objAgendamento.getData());
            pstm.setString(5, objAgendamento.getHora());
            pstm.setString(6, objAgendamento.getObservacao());
            
            return pstm.executeUpdate();

            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }
        
        
    }
    
    public ArrayList<Agendamento> pesquisarAgendamento(Agendamento objAgendamento){
        
        String sql = "Select * from agendamentos";
        
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sql);
            ResultSet rs;
            rs = pstm.executeQuery();
            
            while(rs.next()){
                objAgendamento.setId(rs.getInt("id"));
                objAgendamento.setNome_cliente(rs.getString("nome_cliente"));
                objAgendamento.setNome_servico(rs.getString("nome_servico"));
                objAgendamento.setValor(rs.getString("valor"));
                objAgendamento.setData(rs.getString("data"));
                objAgendamento.setHora(rs.getString("hora"));
                objAgendamento.setObservacao(rs.getString("observacao"));
                
                lista.add(objAgendamento);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return lista;
    }
    
    
    
}
