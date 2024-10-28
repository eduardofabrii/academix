package escola.pessoas;

import java.time.LocalDate;
import java.util.List;
import escola.registro.RegistroLimpeza;

public class Faxineiro extends Funcionario {
    public void reportarProblemasDeManutencao(String problema){};

   public void consultarRegistroLimpeza(){
       System.out.println("Implementar dps"); //arrumar depois
   }

    public Faxineiro(String nome, String CPF, LocalDate dataNascimento, String endereco, double salario) {
        super(nome, CPF, dataNascimento, endereco, salario);
    }
}
