package escola.administracao;

import java.util.ArrayList;
import java.util.List;
import escola.pessoas.Aluno;
import escola.pessoas.Professor;

public class Turma {
    private String nome;
    private int ano;
    private ArrayList<Aluno> listaAlunos ;
    private List<Disciplina> listaDisciplinas;

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", listaAlunos=" + listaAlunos +
                ", listaDisciplinas=" + listaDisciplinas +
                '}';
    }

    public Turma(String nome, int ano) {
        this.nome = nome;
        this.listaAlunos = new ArrayList<>();
        this.listaDisciplinas = new ArrayList<>();
    }

    public Turma(String nome) {
        this.nome = nome;
        this.listaAlunos = new ArrayList<>();
        this.listaDisciplinas = new ArrayList<>();
    }

    public Turma(String nome, int ano, ArrayList<Aluno> listaAlunos, List<Disciplina> listaDisciplinas) {
        this.nome = nome;
        this.ano = ano;
        this.listaAlunos = listaAlunos;
        this.listaDisciplinas = listaDisciplinas;
    }

    public void verAlunos(){};
    public void adicionarProfessor(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(List listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }
}
