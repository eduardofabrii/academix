package escola.pessoas;

import java.util.List;
import escola.registro.RegistroLimpeza;

public class Faxineiro extends Funcionario {
    public void reportarProblemasDeManutencao(String problema){};

   public List<RegistroLimpeza> consultarRegistroLimpeza(){
       return consultarRegistroLimpeza();
   };
}
