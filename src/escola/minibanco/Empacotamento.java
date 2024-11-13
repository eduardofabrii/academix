package escola.minibanco;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Empacotamento {
    public static void salvarArquivo(HashMap<Integer, ArrayList<Serializable>> map, String FILE_PATH) {
        try{
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(map);
        } catch (IOException i){
            System.out.println("Diretório não encontrado");
        }
    }

    public static HashMap<Integer, ArrayList<Serializable>> lerArquivo(String FILE_PATH){
        HashMap<Integer, ArrayList<Serializable>> map = new HashMap<>();
        try {
            File arq = new File(FILE_PATH);
            if (arq.exists()){
                FileInputStream fis = new FileInputStream(FILE_PATH);
                ObjectInputStream os = new ObjectInputStream(fis);
                map = (HashMap <Integer, ArrayList<Serializable>>) os.readObject();
                os.close();
                fis.close();
            }
        } catch (IOException i){
            System.out.println("Diretório não encontrado");
        } catch (ClassNotFoundException c){
            System.out.println("Classe não encontrada");
        }
        return map;
    }
}
