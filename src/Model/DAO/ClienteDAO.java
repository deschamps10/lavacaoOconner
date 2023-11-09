package Model.DAO;

import Model.Cliente;
import java.sql.*;
import javax.swing.JOptionPane;



public class ClienteDAO {
    
    Connection conexao; 

    public ResultSet adicionarCliente(Cliente cliente) {
        
        conexao = new Conexao().conectaBD();
        
        try {

            String sql = "INSERT INTO Clientes (nomeClient, sexoClient, dataNascClient, cpfClient, telefoneClient, emailClient, cepClient, enderecoClient, complementoClient) VALUES\n( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = conexao.prepareStatement(sql);

//              criar objCliente em CadastroClienteController
//          
//            pstm.setString(1, objCliente.getNome()); 
//            pstm.setString(2, objCliente.getSexo());
//            pstm.setString(3, objCliente.getDataNascimento());
//            pstm.setString(4, objCliente.getCpf());
//            pstm.setString(5, objCliente.getTelefone());
//            pstm.setString(6, objCliente.getEmail());
//            pstm.setString(7, objCliente.getCep());
//            pstm.setString(8, objCliente.getEndereco());
//            pstm.setString(9, objCliente.getComplemento());
//            ResultSet rs = pstm.executeQuery();
//            return rs;

// basicamente copiei do UsuarioDAO, ver se com esses comandos adiciona, caso nao, pesquisar qual comando adiciona.



            return null;    // so por enquanto 
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return null;
        }
        
        
    }

    
    
}
