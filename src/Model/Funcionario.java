package Model;

    public class Funcionario extends Pessoa{
        
        private String endereco;
        private String complemento;
        private String cep;
        private String senha;
        private String nivelAcesso;
 
        
    public Funcionario(int id, String nome, char sexo, String dataNascimento, String cpf, String telefone, String email) {
        super(id, nome, sexo, dataNascimento, cpf, telefone, email);
        
        this.cep = cep;
        this.complemento = complemento;
        this.endereco = endereco;
        this.senha = senha;
        this.nivelAcesso= nivelAcesso;
        this.email = email;
        
    }

    public Funcionario(String senha, String email) {
        super(email);
        this.senha = senha;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
        
        
    
}
