package escola.boletim;

import escola.administracao.Disciplina;
import escola.pessoas.Aluno;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Boletim implements Serializable {
    private List<Disciplina> disciplinas;
    private double mediaFinal;
    private ArrayList<Nota> notas;
    private Aluno aluno;

    public Boletim(Aluno aluno) {
        this.aluno = aluno;
        this.disciplinas = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    public double calcularMedia() {
        if (notas == null || notas.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (Nota nota : notas) {
            soma += nota.getValor();
        }

        mediaFinal = soma / notas.size();
        return mediaFinal;
    }

    @Override
    public String toString() {
        return "Boletim{" +
                "disciplinas=" + disciplinas +
                ", mediaFinal=" + mediaFinal +
                ", notas=" + notas +
                ", aluno=" + aluno +
                '}';
    }

    public void registrarNota(Nota nota) {
        notas.add(nota);
        System.out.println("Nota registrada: " + nota.getValor());
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        System.out.println("Disciplina " + disciplina.getNome() + " adicionada ao boletim.");
    }

    public void removerDisciplina(Disciplina disciplina) {
        if (disciplinas.remove(disciplina)) {
            System.out.println("Disciplina " + disciplina.getNome() + " removida do boletim.");
        } else {
            System.out.println("Disciplina " + disciplina.getNome() + " não encontrada no boletim.");
        }
    }

    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota registrada.");
        } else {
            System.out.println("Notas registradas:");
            for (Nota nota : notas) {
                System.out.println(nota.getValor());
            }
        }
    }

    public boolean verificarAprovacao(double mediaDeAprovacao) {
        return calcularMedia() >= mediaDeAprovacao;
    }

    public void Relatorio() {
        System.out.println("Relatório do Aluno: " + aluno.getNome());
        listarNotas();
        System.out.println("Média Final: " + calcularMedia());
        if (verificarAprovacao(7.0)) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }

    //getters e setters para as listas e a média final podem ser adicionados conforme necessário
}
