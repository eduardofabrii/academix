package escola.administracao;

import java.util.ArrayList;
import java.util.List;
import escola.pessoas.Aluno;
import escola.pessoas.Professor;

public class Turma {
    private String nome;
    private int ano;
    private ArrayList<Aluno> listaAlunos ;
    private List listaDisciplinas;

    public Turma(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public void verAlunos(){};

    public void adicionarProfessor(Professor professor){};

    public String getNome() {
        return nome;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
}
