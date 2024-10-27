package escola.pessoas;
import java.time.LocalDate;
import java.util.List;
public class Porteiro extends Funcionario {
    public Porteiro(int codigo, double salario) {
        super(codigo, salario);
    }

    public Porteiro(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario);
    }

    public void registrarEntrada(Pessoa pessoa){};
    public void registrarSaida(Pessoa pessoa){};
    public List<registroEntrada> consultarRegistroEntrada(){};
    public List<registroSaida> consultarRegistroSaida(){};
    public void reportarOcorrencia(String ocorrencia){};
}
