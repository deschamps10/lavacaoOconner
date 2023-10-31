package Conexao.DAO;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.Usuario;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA) VALUES (?,?,?)";

        try {
            PreparedStatement ps = null;
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
