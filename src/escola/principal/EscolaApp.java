package escola.principal;

import escola.administracao.Disciplina;
import escola.administracao.Escola;
import escola.administracao.Turma;
import escola.pessoas.Aluno;
import escola.pessoas.Funcionario;
import escola.pessoas.Professor;

import java.time.LocalDate;

public class EscolaApp {
    public static void main(String[] args) {
        Escola escola = new Escola();

        Funcionario marina = new Professor("Marina de Lara", "1234567890", LocalDate.of(1998, 4, 12), "Rua das Flores", 14900);

        Funcionario pedro = new Professor("Pedro Silva", "1234567890", LocalDate.of(1998, 4, 12), "Rua das Flores", 14900);

        Aluno eduardo = new Aluno("Eduardo Henrique Fabri", "13588182901", LocalDate.of(2006, 8, 23), "Roberto Vichinhenski");

        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", 120, (Professor) marina);

        Turma turmaA = new Turma("A", 3);

        escola.adicionarDisciplina(disciplina);
        escola.adicionarAluno(eduardo);
        escola.adicionarFuncionario(marina);
        turmaA.adicionarProfessor((Professor) marina);

        escola.listarFuncionarios();
        escola.listarDisciplinas();
        escola.listarAlunos();


        System.out.println(        marina.getCodigo());
        System.out.println(        pedro.getCodigo());
    }
}
