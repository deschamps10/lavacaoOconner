package Model;

    public class Cliente extends Pessoa {
        
        private String cep;
        private String endereco;
        private String complemento;
        
    public Cliente(int id, String nome, char sexo, String dataNascimento, String cpf, String telefone, String email) {
        super(id, nome, sexo, dataNascimento, cpf, telefone, email);
        
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
        
    }

    public Cliente(String cep, String endereco, String complemento, int id, String nome) {
        super(id, nome);
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
        
    
}
