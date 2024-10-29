package escola.pessoas;

import escola.biblioteca.Livro;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private String CPF;
    private LocalDate dataNascimento;
    private String endereco;
    private ArrayList<Livro> livrosEmprestados;
    private String numero;

    public Pessoa() {
    }

    public Pessoa(String nome, String CPF, LocalDate dataNascimento, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.livrosEmprestados = new ArrayList<>();
        this.numero = numero;
    }

    public String exibirInformacoes() {
        return "Nome: " + getNome() +
                ", CPF: " + getCPF() +
                ", Nascimento: " + getDataNascimento() +
                ", endereço: " + getEndereco();
    }

    public void emprestarLivro(Livro livro) {
        if (livro != null) {
            livrosEmprestados.add(livro);
            System.out.println("Livro emprestado: " + livro.getTitulo());
        } else {
            System.out.println("Livro não pode ser nulo.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            System.out.println("Livro devolvido: " + livro.getTitulo());
        } else {
            System.out.println("Este livro não está emprestado.");
        }
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
