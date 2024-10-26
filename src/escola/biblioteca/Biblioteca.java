package escola.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> catalogo;
    private ArrayList<SalaBiblioteca> listaSalas;
    private ArrayList<Livro> livrosEmprestados;

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
}
