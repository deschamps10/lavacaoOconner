package Controler;

import View.MenuPrinc;
import View.Login;

public class LoginController {

    private final Login view;
    
    public LoginController(Login view){
           this.view = view;
    }
    
    public void entranoSistema(){
        
        MenuPrinc menu = new MenuPrinc();
        menu.setVisible(true);
        this.view.dispose();
    }
}
