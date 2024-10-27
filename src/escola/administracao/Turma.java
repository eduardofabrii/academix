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

    public void verAlunos(){};
    public void adicionarProfessor(){};

    public Turma(ArrayList<Aluno> listaAlunos, String nome, int ano, List listaDisciplinas) {
        this.listaAlunos = listaAlunos;
        this.nome = nome;
        this.ano = ano;
        this.listaDisciplinas = listaDisciplinas;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
}
