package escola.boletim;


import escola.administracao.Disciplina;
import escola.pessoas.Aluno;

import java.io.Serializable;

public class Nota implements Serializable {
    private Disciplina disciplina;
    private Aluno aluno;
    private double valor;

    public Nota(Aluno aluno, Disciplina disciplina, double valor) {
        this.disciplina = disciplina;
        this.aluno = aluno;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  "Disciplina: " + disciplina +
                "- aluno: " + aluno +
                "- nota:" + valor;
    }

    public double getValor() {
        return valor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
