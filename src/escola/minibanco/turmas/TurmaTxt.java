package escola.minibanco.turmas;

import escola.administracao.Turma;

import java.io.*;

public class TurmaTxt {
    public static void salvarTurma (Turma t) throws IOException{
        FileOutputStream fos = new FileOutputStream("escola/minibanco/turmas/turma.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(t);

        os.close();
        fos.close();
    }

    public static Turma carregarTurma () throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("escola/minibanco/turmas/turma.txt");
        ObjectInputStream is = new ObjectInputStream(fis);
        Turma t = (Turma) is.readObject();

        is.close();
        fis.close();
        return t;
    }
}
