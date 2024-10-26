package escola.pessoas;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario extends Pessoa {
    private static int contador = 0;
    private int codigo;
    private double salario;



    public Funcionario() {
        this.codigo = ++contador;
    }

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(getDataNascimento(), hoje).getYears();
    }

    public int getCodigo() {
        return codigo;
    }
}
