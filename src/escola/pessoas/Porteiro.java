package escola.pessoas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Porteiro extends Funcionario {
    private List<Pessoa> registroEntrada;
    private List<Pessoa> registroSaida;

    public Porteiro(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario);
        registroEntrada = new ArrayList<>();
        registroSaida = new ArrayList<>();
    }

    public void registrarEntrada(Pessoa pessoa) {
        registroEntrada.add(pessoa);
        System.out.println("Entrada registrada para: " + pessoa.getNome());
    }

    public void registrarSaida(Pessoa pessoa) {
        registroSaida.add(pessoa);
        System.out.println("Saída registrada para: " + pessoa.getNome());
    }

    public List<Pessoa> consultarRegistroEntrada() {
        return registroEntrada;
    }

    public List<Pessoa> consultarRegistroSaida() {
        return registroSaida;
    }

    public void reportarOcorrencia(String ocorrencia) {
        System.out.println("Ocorrência registrada: " + ocorrencia);
    }
}
