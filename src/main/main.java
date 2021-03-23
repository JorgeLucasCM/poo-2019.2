/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DAO.AlunoDAO;
import DAO.BibliotecarioDAO;
import DAO.EmprestimoDAO;
import DAO.LivroDAO;
import view.telaLogin1;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import model.Aluno;
import model.Bibliotecario;
import model.Livro;
import model.Pessoa;
import view.CadastroLivro;
/**
 *
 * @author g_net
 */
public class main {

    public static String tipo = null;
    public static String identificacao = null;
    public static Livro livroEditar;
    public static Aluno alunoEditar;
    public static Aluno alunoLogado;
    public static void definirLayout(){
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }
    
    
    public static void main(String[] args) {
    
    definirLayout();
    new BibliotecarioDAO().adicionarBibliotecario(new Bibliotecario("admin","admin"));
    //new CadastroLivro().setVisible(true);
    new telaLogin1().setVisible(true);
        
    }
    
}
