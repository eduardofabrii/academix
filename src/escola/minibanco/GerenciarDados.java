package escola.minibanco;

import escola.pessoas.Pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarDados {
    private static final String FILE_PATH = "src\\escola\\minibanco\\dados.ser";
    private HashMap<Integer, ArrayList<Serializable>> dados = new HashMap<>();
    private ArrayList<Pessoa> pessoas = new ArrayList();

    public GerenciarDados(){
        lerDados();
    }

    public void lerDados(){
        dados = Empacotamento.lerArquivo(FILE_PATH);
        lerPessoa();
    }

    public void gravarPessoa(Pessoa p){
        ArrayList<Serializable> listaPessoa = dados.get(1);
        if(listaPessoa == null) {
            listaPessoa = new ArrayList<>();
            dados.put(1, listaPessoa);
        }
        listaPessoa.add(p);
        dados.put(1, listaPessoa);
        Empacotamento.salvarArquivo(dados, FILE_PATH);
    }

    public void lerPessoa(){
        ArrayList<Serializable> listaPessoa = dados.get(1);
        if (listaPessoa != null ){
            for (Serializable p : listaPessoa ){
                Pessoa pessoa = (Pessoa) p;
                pessoas.add(pessoa);
            }
        }
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
}
