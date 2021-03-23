package DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Emprestimo;
import model.Livro;

public class EmprestimoDAO {
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    
    public EmprestimoDAO(){
        
    }
    
    public void adicionarEmprestimo(Livro livro, Aluno aluno, Date dataInicio){
        if(livro.getQuantidadeLivro() == 1){
            JOptionPane.showMessageDialog(null, "O único livro disponível é o CAD!",null, JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        if(this.podeFazerEmprestimo(aluno) && this.naoPegouEsseLivro(aluno, livro)){
            emprestimos.add(new Emprestimo(livro,aluno,dataInicio));
            livro.setQuantidadeLivro(livro.getQuantidadeLivro()-1);
        }
        
    }
    
    public void removerEmprestimo(Livro livro, Aluno aluno, Date dataInicio){
        for(Emprestimo emprestimoAtual: emprestimos){
            if(emprestimoAtual.getAluno().equals(aluno) && emprestimoAtual.getLivro().equals(livro) && emprestimoAtual.getDataInicio().equals(dataInicio))
                emprestimos.remove(emprestimoAtual);
                livro.setQuantidadeLivro(livro.getQuantidadeLivro()+1);
                return;
        }
        JOptionPane.showMessageDialog(null, "Emprestimo não encontrado", "ERROR EMPRESTIMO",JOptionPane.ERROR_MESSAGE);
    }
    
    public int numeroEmprestimosAluno(Aluno aluno){
        int numeroEmprestimos=0;
        for(Emprestimo emprestimoAtual : emprestimos){
            if(emprestimoAtual.getAluno().equals(aluno))
                numeroEmprestimos++;
        }
        return numeroEmprestimos;
    }
    
    public boolean alunoTemEmprestimo(Aluno aluno){
        for(Emprestimo emprestimoAtual : emprestimos){
            if(emprestimoAtual.getAluno().equals(aluno))
                return true; 
        }
        return false;
    }
    
    public void renovarEmprestimo(Aluno aluno, Livro livro, Date dataInicio){
        for(Emprestimo emprestimoAtual : emprestimos){
            if(emprestimoAtual.getAluno().equals(aluno) && emprestimoAtual.getLivro().equals(livro) && emprestimoAtual.getDataInicio().equals(dataInicio))
                if(emprestimoAtual.isJaRenovado()){
                    JOptionPane.showMessageDialog(null, "Este emprestimo já foi renovado", "ERROR RENOVAÇÃO", JOptionPane.ERROR_MESSAGE);
                }else{
                    emprestimoAtual.setDataTermino(emprestimoAtual.getDataTermino(), 7);
                    emprestimoAtual.setJaRenovado(true);
                }
        }
    }
    
    public boolean podeFazerEmprestimo(Aluno aluno){
        if(this.numeroEmprestimosAluno(aluno) < 4)
            return true;
        else{
            JOptionPane.showMessageDialog(null, "O aluno "+aluno.getNome()+" chegou o limite de emprestimos","LIMIT EXTEND",JOptionPane.ERROR_MESSAGE );
            return false;
        }
    }
    public boolean naoPegouEsseLivro(Aluno aluno, Livro livro){
        for(Emprestimo emprestimoAtual : emprestimos){
            if(emprestimoAtual.getAluno().equals(aluno) && emprestimoAtual.getLivro().equals(livro)){
                JOptionPane.showMessageDialog(null, "O aluno "+aluno.getNome()+ " já tem uma copia do livro "+livro.getTitulo()+" em seus emprestimos",
                        "ERROR NUM LIVROS",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    public Emprestimo getEmprestimo(Livro livro, Aluno aluno, Date dataInicio){
        for(Emprestimo emprestimoAtual : emprestimos){
            if(emprestimoAtual.getAluno().equals(aluno) && emprestimoAtual.getLivro().equals(livro) && emprestimoAtual.getDataInicio().equals(dataInicio))
                return emprestimoAtual;
        }
        return null;
    }
    
    public List<Emprestimo> emprestimoAluno(Aluno aluno){
        List<Emprestimo> lE = new ArrayList<Emprestimo>();
        for(Emprestimo e: emprestimos){
            if(e.getAluno().equals(aluno)){
                lE.add(e);
            }
        }
        return lE;
    }

}
