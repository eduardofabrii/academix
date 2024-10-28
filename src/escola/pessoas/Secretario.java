package escola.pessoas;

import java.time.LocalDate;

public class Secretario extends Funcionario {
    public Secretario(String nome, String CPF, LocalDate dataNascimento, String endereco, double salario) {
        super(nome, CPF, dataNascimento, endereco, salario);
    }

    // secretário
}
