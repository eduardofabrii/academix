package escola.administracao;

import escola.minibanco.administracao.GerenciarDadosAdministracao;
import escola.pessoas.Aluno;
import escola.pessoas.Professor;
import escola.sala.SalaAula;

import java.io.Serializable;
import java.util.ArrayList;

public class Disciplina implements Serializable {
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

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina(String nome, int cargaHoraria, SalaAula sala, Professor professor) {
        this(nome, cargaHoraria, professor);
        this.alunos = new ArrayList<>();
        this.sala = sala;
        new GerenciarDadosAdministracao().gravarDisciplina(this);
    }

    public String exibirInformacoes() {
        String salaNome = (sala != null) ? sala.getNome() : "Sala não definida"; // Verificação de null
        return "Disciplina: " + nome + "\n - Carga Horária: " + cargaHoraria + " horas\nSala: " + salaNome + "\nProfessor: " + professor.getNome();
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + "\n - Carga Horária: " + cargaHoraria + " horas\n" + "\n - Professor: " + professor.getNome();
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
