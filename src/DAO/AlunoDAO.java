package DAO;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Livro;

public class AlunoDAO {
    private static List<Aluno> alunos = new ArrayList<Aluno>();
    
    public AlunoDAO(){
        
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    
    public boolean contemAluno(Aluno aluno){
        if(alunos.contains(aluno))
            return true;
        return false;
    }
    
    public void listarAlunos(){
        for(Aluno alunoAtual: alunos){
            System.out.println(alunoAtual.getNome());
        }
    }
    
    public List<Aluno> getList(){
        return alunos;
    }
    
    public Aluno alunoComMatricula(int matricula){
        for(Aluno a : alunos ){
            if(a.getMatricula() == matricula)
                return a;
        }
        return null;
    }
    
    public boolean podeLogar(String login, String senha){   
        for(Aluno a: alunos){
            String matricula = Integer.toString(a.getMatricula());
            if(matricula.equals(login) && a.getSenha().equals(senha)){
                return true;
            }    
        }
        
        return false;
    }
}
