package escola.biblioteca;

import escola.minibanco.biblioteca.GerenciarDadosBiblioteca;

import java.io.Serializable;

public class Livro implements Serializable {
    private String titulo;
    private String autor;
    private int anoPublicado;

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicado=" + anoPublicado +
                '}';
    }

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        new GerenciarDadosBiblioteca().gravarLivro(this);
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

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
}
