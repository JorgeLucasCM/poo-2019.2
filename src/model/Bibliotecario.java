package model;

import java.util.Date;

public class Bibliotecario extends Pessoa{
    private String login;
    private String senha;

    public Bibliotecario() {
    }

    public Bibliotecario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Bibliotecario(String login, String senha, String nome, String cpf, String telefone, Date dataDeNascimento) {
        super(nome, cpf, telefone, dataDeNascimento);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
