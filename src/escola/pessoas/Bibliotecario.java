package escola.pessoas;

import escola.biblioteca.Biblioteca;
import escola.biblioteca.Livro;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bibliotecario extends Funcionario {
    private Biblioteca biblioteca;

    public Bibliotecario(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario);
    }

    public void gerenciarBiblioteca() {

    }

    public void adicionarLivro(Livro livro) {
        biblioteca.adicionarLivro(livro);
    }

    public void removerLivro(Livro livro) {
        biblioteca.removerLivro(livro);
    }

    public void atualizarLivro(Livro livro, String titulo, String autor, int anoPublicado) {
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setAnoPublicado(anoPublicado);
    }

    public void atualizarLivro(Livro livro, String titulo, String autor) {
        livro.setTitulo(titulo);
        livro.setAutor(autor);
    }

    public void atualizarLivro(Livro livro, String titulo) {
        livro.setTitulo(titulo);
    }

    public Livro buscarLivroTitulo(String titulo) {
        return biblioteca.buscarLivroPorTitulo(titulo);

    }

    public void realizarEmprestimo(String titulo, Pessoa pessoa) {
        pessoa.getLivrosEmprestados().add(buscarLivroTitulo(titulo));
        biblioteca.getLivrosEmprestados().add(buscarLivroTitulo(titulo));

    }

    public void receberDevolucao(String titulo, Pessoa pessoa) {
        pessoa.getLivrosEmprestados().remove(buscarLivroTitulo(titulo));
        biblioteca.getLivrosEmprestados().remove(buscarLivroTitulo(titulo));

    }

    public ArrayList<Livro> consultarEmprestimos() {
        return biblioteca.getLivrosEmprestados();
    }

    public void gerarRelatorioLivros() {

    }
}
