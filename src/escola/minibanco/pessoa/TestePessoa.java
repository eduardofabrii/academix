package escola.minibanco.pessoa;

import escola.minibanco.GerenciarDados;
import escola.pessoas.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {

//        LocalDate a = LocalDate.parse("2004-01-19");
//        new Aluno("Keth", "15566565555" , LocalDate.parse("2004-01-19"), "Rua do Amanhã", "1234");

        for (Pessoa aluno : new GerenciarDadosPessoas().getAlunos()){
            System.out.println(aluno);
        }
//        GerenciarDados t = new GerenciarDados();
//        System.out.println(t.getPessoas());
    }
}
