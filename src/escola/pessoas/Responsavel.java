package escola.pessoas;

import java.time.LocalDate;
import java.util.ArrayList;
import escola.pessoas.Aluno;

public class Responsavel extends Pessoa {
    private ArrayList<Aluno> alunos;

    public Responsavel(String nome, String CPF, LocalDate dataNascimento, String endereco) {
        super(nome, CPF, dataNascimento, endereco);
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void visualizarBoletim() {
        for (Aluno a : alunos) {
            a.visualizarBoletim();
        }
    }

    public void calcularMedia() {
        for (Aluno a : alunos) {
            a.calcularMedia();
        }
    }
}
