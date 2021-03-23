package model;

import DAO.EmprestimoDAO;
import java.util.Date;
import javax.swing.JOptionPane;

public class Emprestimo {
    private Livro livro;
    private Aluno aluno;
    private Date dataInicio = new Date();
    private Date dataTermino = new Date();
    private boolean jaRenovado = false;

    public Emprestimo() {
    }

    public Emprestimo(Livro livro, Aluno aluno, Date dataInicio) {
            this.livro = livro;
            this.aluno = aluno;
            this.dataInicio = dataInicio;
            this.setDataTermino(dataInicio, 15);
        
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataInicio, int dias) {
        long diasEmTime = 86400000;
        this.dataTermino.setTime(dataInicio.getTime() + (dias*diasEmTime));
    }

    public boolean isJaRenovado() {
        return jaRenovado;
    }

    public void setJaRenovado(boolean jaRenovado) {
        this.jaRenovado = jaRenovado;
    }
    
    
}
