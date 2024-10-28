package escola.test;

import escola.administracao.Disciplina;
import escola.administracao.Escola;
import escola.pessoas.Aluno;
import escola.pessoas.Professor;
import escola.sala.Sala;

import java.time.LocalDate;

public class EscolaTest01 {
    public static void main(String[] args) {
        Escola escola = new Escola();
    Aluno alunoEduardo = new Aluno("Eduardo Henrique Fabri", "1358829123", (LocalDate.of(2006, 8, 23)), "Rua Roberto Vichinhenski");

        Professor profMarina = new Professor("Marina de Lara", "123456789", (LocalDate.of(1998, 4, 14)), "Rua das Flores", 300000);

//        SalaAula sala123 = new SalaAula(1, "Stephen", 35);

        Disciplina disciplinaPoo = new Disciplina("POO", 120, profMarina);
        escola.adicionarAluno(alunoEduardo);
        escola.adicionarDisciplina(disciplinaPoo);
        escola.adicionarFuncionario(profMarina);
        escola.listarAlunos();
        escola.listarDisciplinas();
        escola.listarFuncionarios();
    }
}
