package escola.minibanco.pessoa;

import escola.pessoas.Aluno;
import escola.pessoas.Pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarDadosPessoas {
    private static final String FILE_PATH = "src\\escola\\minibanco\\pessoa\\dadosPessoa.ser";
    private HashMap<String, ArrayList<Pessoa>> dados = new HashMap<>();
    private ArrayList<Aluno> alunos = new ArrayList();

    public GerenciarDadosPessoas(){
        lerDados();
    }

    public void lerDados(){
        dados = EmpacotamentoPessoas.lerArquivo(FILE_PATH);
        lerAluno();
    }

    public void gravarAluno (Aluno p){
        ArrayList<Pessoa> listaAluno = dados.get("aluno");
        if(listaAluno == null) {
            listaAluno = new ArrayList<>();
            dados.put("aluno", listaAluno);
        }
        listaAluno.add(p);
        dados.put("aluno", listaAluno);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerAluno(){
        ArrayList<Pessoa> listaAluno = dados.get("aluno");
        if (listaAluno != null ){
            for (Serializable p : listaAluno){
                Aluno aluno = (Aluno) p;
                alunos.add(aluno);
            }
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
