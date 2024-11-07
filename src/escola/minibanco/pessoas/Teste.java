package escola.minibanco.pessoas;

import escola.pessoas.Pessoa;

import java.io.IOException;

public class Teste {
    public static void main(String[] args) {
        try{
            Pessoa pessoa = PessoaTxt.carregarPessoa();
            System.out.println(pessoa);
        } catch (IOException i){
            System.out.println("Arquivo não encontrado");
        } catch (ClassNotFoundException c){
            c.getStackTrace();
            System.out.println("Classe não encontrada");
        }

    }
}
