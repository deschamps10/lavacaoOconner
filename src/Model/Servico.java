package Model;

public class Servico {
  
    private int id;
    private String descrição;
    private double valor;

    public Servico(int id, String descrição, double valor) {
        
        this.id = id;
        this.descrição = descrição;
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
        
}
