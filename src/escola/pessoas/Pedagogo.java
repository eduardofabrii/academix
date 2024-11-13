package escola.pessoas;

import escola.administracao.Turma;
import escola.minibanco.GerenciarDados;

import java.time.LocalDate;

public class Pedagogo extends Funcionario {
    public Pedagogo() {
        new GerenciarDados().gravarPessoa(this);
    }

    public Pedagogo(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario, String tipo) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario, tipo);
        new GerenciarDados().gravarPessoa(this);
    }

    public void consultarDesempenhoAluno(Aluno aluno) {
        double media = aluno.calcularMedia();
        System.out.println("Desempenho do aluno " + aluno.getNome() + ": Média = " + media);
    }
}
