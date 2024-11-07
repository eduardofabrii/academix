package escola.minibanco.pessoas;

import escola.biblioteca.Livro;
import escola.pessoas.Pessoa;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class PessoaTxt{
    public static void salvarPessoa(Pessoa p) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/escola/minibanco/pessoas/pessoa.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        os.writeObject(p);
        os.close();
        fos.close();
    }

    public static Pessoa carregarPessoa() throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("src/escola/minibanco/pessoas/pessoa.txt");
        ObjectInputStream is = new ObjectInputStream(fis);

        Pessoa p = (Pessoa) is.readObject();
        is.close();
        fis.close();

        return p;
    }
}
