package escola.minibanco.pessoa;

import escola.pessoas.Pessoa;
import escola.pessoas.Professor;

import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) {

        LocalDate a = LocalDate.parse("2004-01-19");
        new Professor("Keth", "15566565555" , LocalDate.parse("2004-01-19"), "Rua do Amanhã", 10000);

        for (Professor p : new GerenciarDadosPessoas().getProfessores()){
            System.out.println(p.getCPF());
        }
//        GerenciarDados t = new GerenciarDados();
//        System.out.println(t.getPessoas());
    }
}
