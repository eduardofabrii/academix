package escola.pessoas;

import java.time.LocalDate;
import java.util.List;

public class Porteiro extends Funcionario {

    public Porteiro(String nome, String CPF, LocalDate dataNascimento, String endereco, double salario) {
        super(nome, CPF, dataNascimento, endereco, salario);
    }

    public void registrarEntrada(Pessoa pessoa) {

    }

    public void registrarSaida(Pessoa pessoa) {

    }

//    public List<registroEntrada> consultarRegistroEntrada() {
//        //implementar
//    }
//
//    public List<registroSaida> consultarRegistroSaida() {
//        //implementar
//    }

    public void reportarOcorrencia(String ocorrencia) {
    }

}
