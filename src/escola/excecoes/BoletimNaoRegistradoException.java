package escola.excecoes;

public class BoletimNaoRegistradoException extends Exception {
    public BoletimNaoRegistradoException(String mensagem) {
        super(mensagem);
    }

    public BoletimNaoRegistradoException() {
        super("O aluno não possui boletim registrado.");
    }
}

