package model;

import java.awt.Image;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private String descricaoDoLivro;
    private int quantidadeLivro;
    private Image imagemCapa;

    public Livro() {
    }

    public Livro(String titulo, String autor, int isbn, String descricaoDoLivro, int quantidadeLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.descricaoDoLivro = descricaoDoLivro;
        this.quantidadeLivro = quantidadeLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getDescricaoDoLivro() {
        return descricaoDoLivro;
    }

    public void setDescricaoDoLivro(String descricaoDoLivro) {
        this.descricaoDoLivro = descricaoDoLivro;
    }
    
     public Image getImagemCapa() {
        return imagemCapa;
    }

    public void setImagemCapa(Image imagemCapa) {
        this.imagemCapa = imagemCapa;
    }

    public int getQuantidadeLivro() {
        return quantidadeLivro;
    }

    public void setQuantidadeLivro(int quantidadeLivro) {
        this.quantidadeLivro = quantidadeLivro;
    }
    
}
