package escola.minibanco.disciplina;

import escola.administracao.Disciplina;

import java.io.*;

public class DisciplinaTxt {
    public static void salvarDisciplina(Disciplina d) throws IOException {
        FileOutputStream fos = new FileOutputStream("escola/minibanco/disciplina/disciplina.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(d);

        os.close();
        fos.close();
    }

    public static Disciplina carregarDisciplina() throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("escola/minibanco/disciplina/disciplina.txt");
        ObjectInputStream is = new ObjectInputStream(fis);
        Disciplina disciplina = (Disciplina) is.readObject();

        is.close();
        fis.close();

        return disciplina;
    }
}
