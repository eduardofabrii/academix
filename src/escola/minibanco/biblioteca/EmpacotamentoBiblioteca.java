package escola.minibanco.biblioteca;

import escola.biblioteca.Biblioteca;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class EmpacotamentoBiblioteca {
    public static void salvarArquivo(HashMap<String, ArrayList<Biblioteca>> map, String diretorio) {
        try{
            FileOutputStream fos = new FileOutputStream(diretorio);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(map);
            os.close();
        } catch (IOException i){
            System.out.println("Diretório não encontrado - Salvar");
        }
    }

    @SuppressWarnings("unchecked")
    public static HashMap<String, ArrayList<Biblioteca>> lerArquivo(String diretorio){
        HashMap<String, ArrayList<Biblioteca>> map = new HashMap<>();
        try {
            File arq = new File(diretorio);
            if (arq.exists()){
                FileInputStream fis = new FileInputStream(diretorio);
                ObjectInputStream os = new ObjectInputStream(fis);
                map = (HashMap <String, ArrayList<Biblioteca>>) os.readObject();
                os.close();
            }
        } catch (IOException i){
            System.out.println("Diretório não encontrado - Ler");
        } catch (ClassNotFoundException c){
            System.out.println("Classe não encontrada");
        }
        return map;
    }

}
