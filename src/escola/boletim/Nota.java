package escola.boletim;

import escola.administracao.Disciplina;
import escola.pessoas.Aluno;

public class Nota {
    private Disciplina disciplina;
    private Aluno aluno;
    private double valor;

    public Nota(Disciplina disciplina, Aluno aluno, double valor) {
        this.disciplina = disciplina;
        this.aluno = aluno;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  "Disciplina: " + disciplina +
                ", Aluno: " + aluno +
                ", Nota:" + valor;
    }

    public double getValor() {
        return valor;
    }
}
