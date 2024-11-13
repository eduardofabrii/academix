package escola.minibanco.pessoas;

import escola.minibanco.GerenciarDados;
import escola.pessoas.Pessoa;

import java.io.IOException;

public class Teste {
    public static void main(String[] args) {
        for (Pessoa pessoa : new GerenciarDados().getPessoas()){
            System.out.println(pessoa);
        }

        System.out.println(new GerenciarDados().getPessoas());
    }
}
