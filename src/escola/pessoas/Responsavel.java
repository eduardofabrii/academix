package escola.pessoas;

import java.time.LocalDate;
import java.util.ArrayList;
import escola.pessoas.Aluno;

public class Responsavel extends Pessoa {

    public Responsavel(String nome, String CPF, LocalDate dataNascimento, String endereco, ArrayList<Aluno> alunos) {
        super(nome, CPF, dataNascimento, endereco);
        this.alunos = alunos;
    }

    private ArrayList<Aluno> alunos;

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
