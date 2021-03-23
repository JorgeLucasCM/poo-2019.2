package DAO;

import java.util.ArrayList;
import java.util.List;
import model.Bibliotecario;

public class BibliotecarioDAO {
    private static List<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
    
    public BibliotecarioDAO(){
        
    }
    
    public void adicionarBibliotecario(Bibliotecario bibliotecario){
        bibliotecarios.add(bibliotecario);
    }
    
    public void removerBibliotecario(Bibliotecario bibliotecario){
        bibliotecarios.remove(bibliotecario);
    }
    
    public boolean podeLogar(String login, String senha){
        for(Bibliotecario b: bibliotecarios){
            if(b.getLogin().equals(login) && b.getSenha().equals(senha)){
                return true;
            }    
        }
        
        return false;
    }
}
