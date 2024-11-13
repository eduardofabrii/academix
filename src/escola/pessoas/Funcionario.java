package escola.pessoas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.List;

public abstract class Funcionario extends Pessoa {
    private static int contador = 0;
    private int codigo;
    private double salario;
    private List<String> registrosPonto;

    public Funcionario() {
        this.codigo = ++contador;
    }

    public Funcionario(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario, String tipo) {
        super(nome, CPF, dataNascimento, endereco, tipo);
        this.codigo = ++contador;
        this.salario = salario;
    }

    public String exibirInformacoes() {
        return "Nome: " + getNome() +
                ", CPF: " + getCPF() +
                ", Nascimento: " + getDataNascimento() +
                ", Endereço: " + getEndereco() +
                ", Tipo: " + getTipo() +
                ", Salário: " + getSalario();
    }

    public String baterPontoEntrada(Pessoa pessoa) {
        String mascara = "dd 'de' MMMM 'de' yyyy ' | Horário:' HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);

        String registro = pessoa.getNome() + " registrou ponto de entrada em " + sdf.format(new java.util.Date());

        // cria uma lista com o único registro
        setRegistrosPonto(Collections.singletonList(registro));

        return registro;
    }

    public String baterPontoSaida(Pessoa pessoa) {
        String mascara = "dd 'de' MMMM 'de' yyyy ' | Horário:' HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);

        String registro = pessoa.getNome() + " registrou ponto de saída em " + sdf.format(new java.util.Date());

        setRegistrosPonto(Collections.singletonList(registro));

        return registro;
    }

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(getDataNascimento(), hoje).getYears();
    }

    public int getCodigo() {
        return codigo;
    }

    public List<String> getRegistrosPonto() {
        return registrosPonto;
    }

    public void setRegistrosPonto(List<String> registrosPonto) {
        this.registrosPonto = registrosPonto;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Funcionario.contador = contador;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
