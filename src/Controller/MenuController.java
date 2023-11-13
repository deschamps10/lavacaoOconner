package Controller;

import View.Agenda;
import View.CadastroServ;
import View.MenuPrinc;
import View.CadastroCli;
import View.CadastroFunc;
import View.Cancelamento;

public class MenuController {

    private final MenuPrinc view;
    
    public MenuController(MenuPrinc view) {
              this.view = view;
    }
    
    
    public void cadFuncionario() {
        CadastroFunc cadastro = new CadastroFunc();
        cadastro.setVisible(true);
        view.dispose();
    }

    public void cadCliente() {
        CadastroCli cadastro = new CadastroCli();
        cadastro.setVisible(true);
        view.dispose();
    }
    
    public void cadServico() {
        CadastroServ cadastro = new CadastroServ();
        cadastro.setVisible(true);
        view.dispose();
    }
    
    public void agendamento() {
        Agenda agendamento = new Agenda();
        agendamento.setVisible(true);
        view.dispose();
    }
    
    public void cancelamento() {
        Cancelamento cancelaAgendamento = new Cancelamento();
        cancelaAgendamento.setVisible(true);
        view.dispose();
    }
    
    
}

