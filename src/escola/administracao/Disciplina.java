package escola.administracao;

import escola.pessoas.Aluno;
import escola.pessoas.Professor;
import escola.sala.SalaAula;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private SalaAula sala;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public Disciplina(String nome, int cargaHoraria, SalaAula sala, Professor professor) {
        this(nome, cargaHoraria, professor);
        this.alunos = new ArrayList<>();
    }

    public String exibirInformacoes() {
        return "Disciplina: " + getNome() +
                ", Carga Horária: " + getCargaHoraria() +
                ", Sala: " + sala.getNome() +
                ", Professor: " + professor.getNome();
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno != null) {
            alunos.add(aluno);
            System.out.println("Aluno adicionado: " + aluno.getNome());
        } else {
            System.out.println("Aluno não pode ser nulo.");
        }
    }

    public void removerAluno(Aluno aluno) {
        if (aluno != null && alunos.contains(aluno)) {
            alunos.remove(aluno);
            System.out.println("Aluno removido: " + aluno.getNome());
        } else {
            System.out.println("Aluno não encontrado na lista de Alunos.");
        }
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Não há Alunos registrados.");
            return;
        }

        System.out.println("Alunos registrados:");
        for (Aluno a : alunos) {
            System.out.println(a.exibirInformacoes());
        }
    }

    public Aluno buscarAlunoPorNome(String nome) {
        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
