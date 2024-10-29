package escola.pessoas;

import java.time.LocalDate;
import escola.boletim.Boletim;
import java.util.ArrayList;
import escola.administracao.Turma;
import escola.boletim.Nota;

public class Aluno extends Pessoa {
    private String matricula;
    private double frequencia;
    private Turma turma;
    private Boletim boletim;
    private boolean matriculado; // Adicionando o atributo booleano

    public Aluno(String nome, String CPF, LocalDate dataNascimento, String endereco) {
        super(nome, CPF, dataNascimento, endereco);
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() +
                ", Matricula: " + getMatricula() +
                ", Frequencia: " + getFrequencia() +
                ", Turma: " + getTurma();
    }

    public void visualizarBoletim() {
        if (boletim != null) {
            System.out.println(boletim);
        } else {
            System.out.println("Boletim não disponível para o aluno.");
        }
    }

    public void verTurma() {
        if (turma != null) {
            System.out.println("Turma do aluno: " + turma);
        } else {
            System.out.println("O aluno " + getNome() + " não está matriculado em uma turma.");
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (Nota nota : boletim.getNotas()) {
            soma = soma + nota.getValor();
        }
        return soma / boletim.getNotas().size();
    }

    // Método que verifica se o aluno está matriculado
    public boolean isMatriculado() {
        return matriculado;
    }

    // Método para definir o status de matrícula do aluno
    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Nota> getNotas() {
        return boletim.getNotas();
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Boletim getBoletim() {
        return boletim;
    }

    public void setBoletim(Boletim boletim) {
        this.boletim = boletim;
    }
}
