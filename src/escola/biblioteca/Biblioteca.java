package escola.biblioteca;

import java.io.Serializable;
import java.util.ArrayList;
import escola.sala.SalaBiblioteca;

public class Biblioteca implements Serializable {
    private ArrayList<Livro> catalogo;
    private ArrayList<SalaBiblioteca> listaSalas;
    private ArrayList<Livro> livrosEmprestados;

    public Biblioteca() {
        catalogo = new ArrayList<>(); // Inicializa o catálogo de livros
        listaSalas = new ArrayList<>();
        livrosEmprestados = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        catalogo.add(livro);
    }

    public void removerLivro(Livro livro){
        catalogo.remove(livro);
    }

    public void listarLivro(){

    }

    public Livro buscarLivroPorTitulo(String titulo){
        for (Livro livro : catalogo){
            if (livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public ArrayList<Livro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Livro> catalogo) {
        this.catalogo = catalogo;
    }
}
