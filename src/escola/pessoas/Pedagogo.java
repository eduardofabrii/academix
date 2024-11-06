package escola.pessoas;

import escola.administracao.Turma;

public class Pedagogo extends Funcionario {
    public void consultarDesempenhoAluno(Aluno aluno) {
        double media = aluno.calcularMedia();
        System.out.println("Desempenho do aluno " + aluno.getNome() + ": Média = " + media);
    }
}
