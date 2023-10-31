

import Conexao.DAO.UsuarioDAO; // Corrected class name to UsuarioDAO
import Conexao.entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();
        u.setNome("Eduardo Deschamps");
        u.setLogin("deschamps");
        u.setSenha("1234");
        

        new UsuarioDAO().cadastrarUsuario(u);
    }
}
