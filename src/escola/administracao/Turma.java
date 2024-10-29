package escola.administracao;

import java.util.ArrayList;
import java.util.List;
import escola.pessoas.Aluno;
import escola.pessoas.Professor;
import escola.administracao.Disciplina; // Supondo que você tenha uma classe Disciplina

public class Turma {
    private String nome;
    private int ano;
    private ArrayList<Aluno> listaAlunos;
    private List<Disciplina> listaDisciplinas;

    public Turma(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
        this.listaAlunos = new ArrayList<>();
        this.listaDisciplinas = new ArrayList<>();
    }

    public void verAlunos() {
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno na turma " + nome);
        } else {
            System.out.println("Alunos na turma " + nome + ":");
            for (Aluno aluno : listaAlunos) {
                System.out.println(aluno.getNome());
            }
        }
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado à turma " + nome + ".");
    }

    public void removerAluno(Aluno aluno) {
        if (listaAlunos.remove(aluno)) {
            System.out.println("Aluno " + aluno.getNome() + " removido da turma " + nome + ".");
        } else {
            System.out.println("Aluno " + aluno.getNome() + " não encontrado na turma " + nome + ".");
        }
    }

    public void adicionarProfessor(Professor professor) {
        // Método para adicionar um professor à turma
        System.out.println("Professor " + professor.getNome() + " adicionado à turma " + nome + ".");
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        listaDisciplinas.add(disciplina);
        System.out.println("Disciplina " + disciplina.getNome() + " adicionada à turma " + nome + ".");
    }

    public void removerDisciplina(Disciplina disciplina) {
        if (listaDisciplinas.remove(disciplina)) {
            System.out.println("Disciplina " + disciplina.getNome() + " removida da turma " + nome + ".");
        } else {
            System.out.println("Disciplina " + disciplina.getNome() + " não encontrada na turma " + nome + ".");
        }
    }

    public void listarDisciplinas() {
        if (listaDisciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada para a turma " + nome + ".");
        } else {
            System.out.println("Disciplinas da turma " + nome + ":");
            for (Disciplina disciplina : listaDisciplinas) {
                System.out.println(disciplina.getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public int getAno() {
        return ano;
    }
}
