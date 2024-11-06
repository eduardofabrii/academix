package escola.excecoes;

public class TurmaSemAlunosException extends Exception {
    public TurmaSemAlunosException(String mensagem) {
        super(mensagem);
    }

    public TurmaSemAlunosException() {
        super("A turma não possui alunos registrados.");
    }
}
