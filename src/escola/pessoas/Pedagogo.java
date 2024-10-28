package escola.pessoas;

import java.time.LocalDate;

public class Pedagogo extends Funcionario {
    public Pedagogo(String nome, String CPF, LocalDate dataNascimento, String endereco, double salario) {
        super(nome, CPF, dataNascimento, endereco, salario);
    }

    public void orientarAlunos(Aluno aluno) {
        System.out.println("Orientação realizada para o aluno " + aluno.getNome());
    }

    public void consultarDesempenhoAluno(Aluno aluno) {
//        double media = aluno.calcularMedia();
//        System.out.println("Desempenho do aluno " + aluno.getNome() + ": Média = " + media);
    }
}
