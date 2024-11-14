package escola.administracao;

import escola.pessoas.*;

import java.io.Serializable;
import java.util.ArrayList;

public class Escola implements Serializable {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    private ArrayList<Diretor> diretores = new ArrayList<>();
    private ArrayList<Faxineiro> faxineiros = new ArrayList<>();
    private ArrayList<Merendeiro> merendeiros = new ArrayList<>();
    private ArrayList<Monitor> monitores = new ArrayList<>();
    private ArrayList<Pedagogo> pedagogos = new ArrayList<>();
    private ArrayList<Porteiro> porteiros = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Secretario> secretarios = new ArrayList<>();
    private ArrayList<Responsavel> responsaveis = new ArrayList<>();
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f) {
        if (f != null) {
            funcionarios.add(f);
            pessoas.add(f);
            System.out.println("Funcionario adicionado: " + f.getNome());
        } else {
            System.out.println("Funcionario não pode ser nulo.");
        }
    }

    public void removerFuncionario(Funcionario f) {
        if (f != null && funcionarios.contains(f)) {
            funcionarios.remove(f);
            pessoas.remove(f);
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
            pessoas.add(aluno);
            System.out.println("Aluno adicionado: " + aluno.getNome());
        } else {
            System.out.println("Aluno não pode ser nulo.");
        }
    }

    public void removerAluno(Aluno aluno) {
        if (aluno != null && alunos.contains(aluno)) {
            alunos.remove(aluno);
            pessoas.remove(aluno);
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

    public Pessoa buscarPessoaPorNome(String nome) {
        for (Pessoa p: pessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void adicionarBibliotecario(Bibliotecario bibliotecario) {
        if (bibliotecarios != null) {
            bibliotecarios.add(bibliotecario);
            pessoas.add(bibliotecario);
            System.out.println("Bibliotecario adicionado: " + bibliotecario.getNome());
        } else {
            System.out.println("Bibliotecario não pode ser nulo.");
        }
    }
    public void adicionarDiretor(Diretor diretor) {
        if (diretores != null) {
            diretores.add(diretor);
            pessoas.add(diretor);
            System.out.println("Diretor adicionado: " + diretor.getNome());
        } else {
            System.out.println("Diretor não pode ser nulo.");
        }
    }
    public void adicionarFaxineiro(Faxineiro faxineiro) {
        if (faxineiros != null) {
            faxineiros.add(faxineiro);
            pessoas.add(faxineiro);
            System.out.println("Faxineiro adicionado: " + faxineiro.getNome());
        } else {
            System.out.println("Faxineiro não pode ser nulo.");
        }
    }
    public void adicionarMerendeiro(Merendeiro merendeiro) {
        if (merendeiros != null) {
            merendeiros.add(merendeiro);
            pessoas.add(merendeiro);
            System.out.println("Merendeiro adicionado: " + merendeiro.getNome());
        } else {
            System.out.println("Merendeiro não pode ser nulo.");
        }
    }

    public void adicionarMonitor(Monitor monitor) {
        if (monitores != null) {
            monitores.add(monitor);
            pessoas.add(monitor);
            System.out.println("Monitor adicionado: " + monitor.getNome());
        } else {
            System.out.println("Monitor não pode ser nulo.");
        }
    }

    public void adicionarPedagogo(Pedagogo pedagogo) {
        if (pedagogos != null) {
            pedagogos.add(pedagogo);
            pessoas.add(pedagogo);
            System.out.println("Pedagogo adicionado: " + pedagogo.getNome());
        } else {
            System.out.println("Pedagogo não pode ser nulo.");
        }
    }

    public void adicionarPorteiro(Porteiro porteiro) {
        if (porteiros != null) {
            porteiros.add(porteiro);
            pessoas.add(porteiro);
            System.out.println("Porteiro adicionado: " + porteiro.getNome());
        } else {
            System.out.println("Porteiro não pode ser nulo.");
        }
    }

    public void adicionarProfessor(Professor professor) {
        if (professores != null) {
            professores.add(professor);
            pessoas.add(professor);
            System.out.println("Professor adicionado: " + professor.getNome());
        } else {
            System.out.println("Professor não pode ser nulo.");
        }
    }
    public void adicionarResponsavel(Responsavel responsavel) {
        if (responsaveis != null) {
            responsaveis.add(responsavel);
            pessoas.add(responsavel);
            System.out.println("Responsavel adicionado: " + responsavel.getNome());
        } else {
            System.out.println("Responsavel não pode ser nulo.");
        }
    }
    public void adicionarSecretario(Secretario secretario) {
        if (secretarios != null) {
            secretarios.add(secretario);
            pessoas.add(secretario);
            System.out.println("Secretario adicionado: " + secretario.getNome());
        } else {
            System.out.println("Secretario não pode ser nulo.");
        }
    }


    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
