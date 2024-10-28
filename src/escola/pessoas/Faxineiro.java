package escola.pessoas;

import java.time.LocalDate;

public class Faxineiro extends Funcionario {
    public Faxineiro(String nome, String CPF, LocalDate dataNascimento, String endereco, double salario) {
        super(nome, CPF, dataNascimento, endereco, salario);
    }

    //    public List<RegistroLimpeza> consultarRegistroLimpeza(){};

    public void reportarProblemasDeManutencao(String problema){};
}
