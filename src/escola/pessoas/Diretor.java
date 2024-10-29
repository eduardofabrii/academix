package escola.pessoas;

import escola.administracao.Turma;

import java.time.LocalDate;
import java.util.List;

public class Diretor extends Funcionario {

    public Diretor(String nome, String CPF, LocalDate dataNascimento, String endereco, double salario) {
        super(nome, CPF, dataNascimento, endereco, salario);
    }

    // Método para gerenciar professores
    public void gerenciarProfessores(List<Professor> professores) {
        System.out.println("Gerenciando professores:");
        for (Professor professor : professores) {
            System.out.println("- " + professor.getNome());
        }
    }

    // Método para gerenciar alunos
    public void gerenciarAlunos(List<Aluno> alunos) {
        System.out.println("Gerenciando alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
        }
    }

    // Método para avaliar o desempenho de uma turma
    public void avaliarDesempenho(Turma turma) {
        System.out.println("Avaliação de desempenho da turma: " + turma.getNome());
        //Lógica de avaliacao
    }

    // Método para realizar uma reunião com os participantes
    public void realizarReuniao(List<Pessoa> participantes) {
        System.out.println("Reunião agendada com os seguintes participantes:");
        for (Pessoa participante : participantes) {
            System.out.println("- " + participante.getNome());
        }
    }

    // Método para gerar um relatório geral
    public void gerarRelatorioGeral() {
        System.out.println("Gerando relatório geral da escola...");

    }
}
