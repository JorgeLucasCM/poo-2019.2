
package DAO;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

public class LivroDAO {
    private static List<Livro> livros = new ArrayList<Livro>();
    
    public LivroDAO(){
        //this.livros = livros;
    }
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);      
    }
    
    public void removerLivro(Livro livro){
        livros.remove(livro);
        
    }
    
    public boolean contemLivro(Livro livro){
        if(livros.contains(livro))
            return true;
        return false;
    }
    
    public void ListarLivros(){
        for(Livro livroAtual : livros){
            System.out.println(livroAtual.getTitulo());
        }
    }
    public List<Livro> getList(){
        return livros;
    }
    
    public Livro livroPorTitulo(String titulo){
        for(Livro l: livros){
            if(l.getTitulo().toLowerCase().equals(titulo.toLowerCase())){
                return l;
            }
        }
        return null;
    }
}
