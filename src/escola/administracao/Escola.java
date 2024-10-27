package escola.administracao;

import escola.pessoas.Aluno;
import escola.pessoas.Funcionario;

import java.util.ArrayList;

public class Escola {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f) {
        if (f != null) {
            funcionarios.add(f);
            System.out.println("Funcionario adicionado: " + f.getNome());
        } else {
            System.out.println("Funcionario não pode ser nulo.");
        }
    }

    public void removerFuncionario(Funcionario f) {
        if (f != null && funcionarios.contains(f)) {
            funcionarios.remove(f);
            System.out.println("Funcionario removido: " + f.getNome());
        } else {
            System.out.println("Funcionario não encontrado na lista de Funcionarios.");
        }
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionarios registrados.");
            return;
        }

        System.out.println("Funcionarios registrados:");
        for (Funcionario f : funcionarios) {
            System.out.println(f.exibirInformacoes());
        }
    }

    public Funcionario buscarFuncionarioPorNome(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
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

    public void adicionarDisciplina(Disciplina disciplina) {
        if (disciplina != null) {
            disciplinas.add(disciplina);
            System.out.println("Disciplina adicionada: " + disciplina.getNome());
        } else {
            System.out.println("Disciplina não pode ser nulo.");
        }
    }

    public void removerDisciplina(Disciplina disciplina) {
        if (disciplina != null && disciplinas.contains(disciplina)) {
            disciplinas.remove(disciplina);
            System.out.println("Disciplina removida: " + disciplina.getNome());
        } else {
            System.out.println("Disciplina não encontrado na lista de Alunos.");
        }
    }

    public void listarDisciplinas() {
        if (disciplinas.isEmpty()) {
            System.out.println("Não há disciplinas registradas.");
            return;
        }

        System.out.println("Disciplinas registradas:");
        for (Disciplina d : disciplinas) {
            System.out.println(d.exibirInformacoes());
        }
    }

    public Disciplina buscarDisciplinaPorNome(String nome) {
        for (Disciplina d: disciplinas) {
            if (d.getNome().equalsIgnoreCase(nome)) {
                return d;
            }
        }
        return null;
    }
}
