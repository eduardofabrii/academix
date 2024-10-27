package escola.pessoas;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario extends Pessoa {
    private static int contador = 0;
    private int codigo;
    private double salario;

    public Funcionario(int codigo, double salario) {
        this.codigo = codigo;
        this.salario = salario;
    }

    public Funcionario(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco);
        this.codigo = codigo;
        this.salario = salario;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Funcionario.contador = contador;
    }
}
