package DAO;

import Model.Funcionario;
import java.sql.*; 
import javax.swing.JOptionPane;

public class UsuarioDAO {
    Connection conexao; 

    
    public ResultSet autenticaUsuario(Funcionario objUsuario) {
        conexao = new Conexao().conectaBD();

        try {
            String sql = "select * from Funcionarios where emailFunc = ? and passFunc = ?"; 
            PreparedStatement pstm = conexao.prepareStatement(sql); 

            // Define os parâmetros na consulta SQL.
            pstm.setString(1, objUsuario.getEmail()); 
            pstm.setString(2, objUsuario.getSenha()); 

            ResultSet rs = pstm.executeQuery();

            return rs; 

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);

            return null;
        }
    }
}
