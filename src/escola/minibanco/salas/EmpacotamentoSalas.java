package escola.minibanco.salas;


import escola.administracao.Disciplina;
import escola.sala.Sala;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class EmpacotamentoSalas {
    public static void salvarArquivo(HashMap<String, ArrayList<Sala>> map, String diretorio) {
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
    public static HashMap<String, ArrayList<Sala>> lerArquivo(String diretorio) {
        HashMap<String, ArrayList<Sala>> map = new HashMap<>();
        try {
            File arq = new File(diretorio);
            if (arq.exists()){
                FileInputStream fis = new FileInputStream(diretorio);
                ObjectInputStream os = new ObjectInputStream(fis);
                map = (HashMap <String, ArrayList<Sala>>) os.readObject();
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
