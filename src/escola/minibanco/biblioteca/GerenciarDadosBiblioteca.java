package escola.minibanco.biblioteca;

import escola.biblioteca.Biblioteca;
import escola.biblioteca.Livro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarDadosBiblioteca {
    private static final String FILE_PATH = "src\\escola\\minibanco\\biblioteca\\dadosLivro.ser";
    private HashMap<String, ArrayList<Serializable>> dados = new HashMap<>();
    private ArrayList<Biblioteca> bibliotecas = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();

    public GerenciarDadosBiblioteca(){
        lerDados();
    }

    public void lerDados() {
        dados = EmpacotamentoBiblioteca.lerArquivo(FILE_PATH);
        lerLivro();
    }

    public void gravarLivro(Livro l){
        ArrayList<Serializable> listaLivro = dados.get("livro");
        if(listaLivro == null) {
            listaLivro = new ArrayList<>();
            dados.put("livro", listaLivro);
        }
        listaLivro.add(l);
        dados.put("livro", listaLivro);
        EmpacotamentoBiblioteca.salvarArquivo(dados, FILE_PATH);
    }
    public void lerLivro(){
        ArrayList<Serializable> listaLivro = dados.get("livro");
        if (listaLivro != null ){
            for (Serializable l : listaLivro){
                Livro livro = (Livro) l;
                livros.add(livro);
            }
        }
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
}
