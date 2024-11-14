package escola.minibanco.pessoa;

import escola.pessoas.Aluno;
import escola.pessoas.Pessoa;
import escola.pessoas.Professor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarDadosPessoas {
    private static final String FILE_PATH = "src\\escola\\minibanco\\pessoa\\dadosPessoa.ser";
    private HashMap<String, ArrayList<Pessoa>> dados = new HashMap<>();
    private ArrayList<Aluno> alunos = new ArrayList();
    private ArrayList<Professor> professores = new ArrayList<>();

    public GerenciarDadosPessoas(){
        lerDados();
    }

    public void lerDados(){
        dados = EmpacotamentoPessoas.lerArquivo(FILE_PATH);
        lerAluno();
        lerProfessores();
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
            for (Pessoa p : listaAluno){
                Aluno aluno = (Aluno) p;
                alunos.add(aluno);
            }
        }
    }

    public void gravarProfessor(Professor p){
        ArrayList<Pessoa> listaProfessor = dados.get("professor");
        if (listaProfessor == null){
            listaProfessor = new ArrayList<>();
            dados.put("professor", listaProfessor);
        }
        listaProfessor.add(p);
        dados.put("professor", listaProfessor);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerProfessores(){
        ArrayList<Pessoa> listaProfessor = dados.get("professor");
        if(listaProfessor != null){
            for (Pessoa p : listaProfessor){
                Professor professor = (Professor) p;
                professores.add(professor);
            }
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
}
