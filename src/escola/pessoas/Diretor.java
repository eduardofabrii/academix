package escola.pessoas;

import escola.administracao.Turma;
import escola.minibanco.pessoa.GerenciarDadosPessoas;

import java.time.LocalDate;
import java.util.List;

public class Diretor extends Funcionario {
    public Diretor(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario, "Diretor(a)");
        new GerenciarDadosPessoas().gravarDiretor(this);
    }

    public void gerenciarProfessores(List<Professor> professores) {
        System.out.println("Gerenciando professores:");
        for (Professor professor : professores) {
            System.out.println("- " + professor.getNome());
        }
    }

    public void gerenciarAlunos(List<Aluno> alunos) {
        System.out.println("Gerenciando alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
        }
    }

    public void avaliarDesempenho(Turma turma) {
        System.out.println("Avaliação de desempenho da turma: " + turma.getNome());
    }

    public void realizarReuniao(List<Pessoa> participantes) {
        System.out.println("Reunião agendada com os seguintes participantes:");
        for (Pessoa participante : participantes) {
            System.out.println("- " + participante.getNome());
        }
    }

    public void gerarRelatorioGeral() {
        System.out.println("Gerando relatório geral da escola...");
    }

}
