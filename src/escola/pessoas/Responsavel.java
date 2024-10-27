package escola.pessoas;

import java.util.ArrayList;
import escola.pessoas.Aluno;

public class Responsavel extends Pessoa {
    private ArrayList<Aluno> alunos;

    public Aluno Responsavel(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void visualizarBoletim() {
        for (aluno a : alunos) {
            a.visualizarBoletim();
        }
    }

    public void calcularMedia() {
        for (aluno a : alunos) {
            a.calcularMedia();
        }
    }
}
