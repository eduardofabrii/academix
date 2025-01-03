package escola.pessoas;

import escola.minibanco.pessoa.GerenciarDadosPessoas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Porteiro extends Funcionario {
    private List<Pessoa> registroEntrada;
    private List<Pessoa> registroSaida;

    public Porteiro(String nome, String CPF, LocalDate dataNascimento, String endereco, double salario) {
        super(nome, CPF, dataNascimento, endereco, salario);
        registroEntrada = new ArrayList<>();
        registroSaida = new ArrayList<>();
        new GerenciarDadosPessoas().gravarPorteiro(this);

    }

    public Porteiro() {
        registroEntrada = new ArrayList<>();
        registroSaida = new ArrayList<>();
        new GerenciarDadosPessoas().gravarPorteiro(this);

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
