package escola.minibanco;

import escola.pessoas.Pessoa;

public class Teste {
    public static void main(String[] args) {

//        LocalDate a = LocalDate.parse("2004-01-19");
//        new Aluno("Keth", "15566565555" , LocalDate.parse("2004-01-19"), "Rua do Amanhã", "1234");

        for (Pessoa pessoa : new GerenciarDados().getPessoas()){
            System.out.println(pessoa);
        }
        GerenciarDados t = new GerenciarDados();
        System.out.println(t.getPessoas());
    }
}
