package Controller;

import View.Agenda;
import View.CadastroServ;
import View.MenuPrinc;
import View.CadastroCli;
import View.CadastroFunc;

public class MenuController {

    private final MenuPrinc view;
    
    public MenuController(MenuPrinc view) {
              this.view = view;
    }
    public void CadFunc() {

        CadastroFunc cadastro = new CadastroFunc();
        cadastro.setVisible(true);
    }

    public void CadCliente() {

        CadastroCli cadastro = new CadastroCli();
        cadastro.setVisible(true);

         }
    
    public void CadServico() {
        
        CadastroServ cadastro = new CadastroServ();
        cadastro.setVisible(true);
        
        }
    
    public void agendamento(){
        
        Agenda agendamento = new Agenda();
        agendamento.setVisible(true);
    }
}