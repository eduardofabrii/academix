package escola.minibanco.boletim;

import escola.boletim.Boletim;
import escola.boletim.Nota;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarDadosBoletim {
    private static final String FILE_PATH = "src\\escola\\minibanco\\boletim\\dadosboletim.ser";
    private HashMap<String, ArrayList<Serializable>> dados = new HashMap<>();
    private ArrayList<Boletim> boletins = new ArrayList<>();
    private ArrayList<Nota> notas = new ArrayList<>();

    public GerenciarDadosBoletim(){
        lerDados();
    }

    public void lerDados() {
        dados = EmpacotamentoBoletim.lerArquivo(FILE_PATH);
        lerBoletim();
    }

    public void gravarBoletim(Boletim b){
        ArrayList<Serializable> listaBoletim = dados.get("boletim");
        if(listaBoletim == null) {
            listaBoletim = new ArrayList<>();
            dados.put("boletim", listaBoletim);
        }
        listaBoletim.add(b);
        dados.put("boletim", listaBoletim);
        EmpacotamentoBoletim.salvarArquivo(dados, FILE_PATH);
    }
    public void lerBoletim(){
        ArrayList<Serializable> listaLivro = dados.get("livro");
        if (listaLivro != null ){
            for (Serializable b : listaLivro){
                Boletim boletim = (Boletim) b;
                boletins.add(boletim);
            }
        }
    }

    public void gravarNota(Nota n){
        ArrayList<Serializable> listaNota = dados.get("nota");
        if(listaNota == null) {
            listaNota = new ArrayList<>();
            dados.put("nota", listaNota);
        }
        listaNota.add(n);
        dados.put("nota", listaNota);
        EmpacotamentoBoletim.salvarArquivo(dados, FILE_PATH);
    }
    public void lerNota(){
        ArrayList<Serializable> listaNota = dados.get("nota");
        if (listaNota != null ){
            for (Serializable n : listaNota){
                Nota nota = (Nota) n;
                notas.add(nota);
            }
        }
    }

    public ArrayList<Boletim> getBoletins() {
        return boletins;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }
}
