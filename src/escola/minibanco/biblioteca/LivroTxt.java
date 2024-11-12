package escola.minibanco.biblioteca;

import escola.biblioteca.Livro;

import java.io.*;

public class LivroTxt {
    public static void salvarLivro(Livro l) throws IOException {
        FileOutputStream fos = new FileOutputStream("escola/minibanco/biblioteca/livro.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(l);

        os.close();
        fos.close();
    }

    public static Livro carregarLivro() throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("escola/minibanco/biblioteca/livro.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        Livro livro = (Livro) is.readObject();

        is.close();
        fis.close();

        return livro;
    }
}
