package escola.minibanco.pessoa;

import escola.minibanco.GerenciarDados;
import escola.pessoas.Pessoa;
import escola.pessoas.Professor;

public class TestePessoa {
    public static void main(String[] args) {

//        LocalDate a = LocalDate.parse("2004-01-19");
//        new Aluno("Keth", "15566565555" , LocalDate.parse("2004-01-19"), "Rua do Amanhã", "1234");

        for (Professor p : new GerenciarDadosPessoas().getProfessores()){
            System.out.println(p);
        }
//        GerenciarDados t = new GerenciarDados();
//        System.out.println(t.getPessoas());
    }
}
