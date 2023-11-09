package ModelDAO;

import Model.Servico;
import java.sql.*;
import javax.swing.JOptionPane;

public class ServicoDAO {
    Connection conexao;
    
                                            // conferir esse parametro passado, comparar com objUsuario
    public ResultSet adicionarFuncionario(Servico servico) {
        
        conexao = new Conexao().conectaBD();
        
        try {
            
            String sql = "INSERT INTO Servico (nomeServ, valorServ, descServ) VALUES\n( ?, ?, ?)";
            PreparedStatement pstm = conexao.prepareStatement(sql);

//              criar objCliente em CadastroClienteController
//          
//            pstm.setString(1, objServico.getNome()); 
//            pstm.setString(2, objServico.getValor());
//            pstm.setString(3, objServico.getDescricao());
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
