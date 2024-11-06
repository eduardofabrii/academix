package escola.excecoes;

public class DisciplinaInvalidaException extends Exception {
    public DisciplinaInvalidaException(String mensagem) {
        super(mensagem);
    }

    public DisciplinaInvalidaException() {
        super("A disciplina não é válida para este professor.");
    }
}
