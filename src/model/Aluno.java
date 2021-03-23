package model;

import java.util.Date;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private String senha;
    
    public Aluno(){
        
    }

    public Aluno(String nome, int matricula,String curso, String cpf, String telefone, Date dataDeNascimento, String senha) {
        super(nome, cpf, telefone, dataDeNascimento);
        this.matricula = matricula;
        this.curso = curso;
        this.senha = senha;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
