package model;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private Date dataDeNascimento = new Date();
    
    public Pessoa(){
        
    }
    public Pessoa(String nome, String cpf, String telefone, Date dataDeNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataDeNascimento = this.dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    
}
