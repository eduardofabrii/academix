package escola.minibanco.administracao;

import escola.administracao.Disciplina;
import escola.administracao.Escola;
import escola.administracao.Turma;
import escola.boletim.Boletim;
import escola.boletim.Nota;
import escola.sala.Sala;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarDadosAdministracao {
    private static final String FILE_PATH = "src\\escola\\minibanco\\administracao\\dadosAdministracao.ser";
    private HashMap<String, ArrayList<Serializable>> dados = new HashMap<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private ArrayList<Escola> escolas = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();


    public GerenciarDadosAdministracao(){
        lerDados();
    }

    public void lerDados() {
        dados = EmpacotamentoAdministracao.lerArquivo(FILE_PATH);
        lerDisciplina();
        lerTurma();
        lerEscola();
    }

    public void gravarDisciplina(Disciplina d){
        ArrayList<Serializable> listaDisciplina = dados.get("disciplina");
        if(listaDisciplina == null) {
            listaDisciplina = new ArrayList<>();
            dados.put("disciplina", listaDisciplina);
        }
        listaDisciplina.add(d);
        dados.put("boletim", listaDisciplina);
        EmpacotamentoAdministracao.salvarArquivo(dados, FILE_PATH);
    }
    public void lerDisciplina(){
        ArrayList<Serializable> listaDisciplina = dados.get("disciplina");
        if (listaDisciplina != null ){
            for (Serializable d : listaDisciplina){
                Disciplina disciplina = (Disciplina) d;
                disciplinas.add(disciplina);
            }
        }
    }

    public void gravarEscola(Escola e) {
        ArrayList<Serializable> listaEscola = dados.get("escola");
        if (listaEscola == null) {
            listaEscola = new ArrayList<>();
            dados.put("escola", listaEscola);
        }
        listaEscola.add(e);
        dados.put("escola", listaEscola);
        EmpacotamentoAdministracao.salvarArquivo(dados, FILE_PATH);
    }

    public void lerEscola() {
        ArrayList<Serializable> listaEscola = dados.get("escola");
        if (listaEscola != null) {
            for (Serializable e : listaEscola) {
                Escola escola = (Escola) e;
                escolas.add(escola);
            }
        }
    }

    public void gravarTurma(Turma t) {
        ArrayList<Serializable> listaTurma = dados.get("turma");
        if (listaTurma == null) {
            listaTurma = new ArrayList<>();
            dados.put("turma", listaTurma);
        }
        listaTurma.add(t);
        dados.put("turma", listaTurma);
        EmpacotamentoAdministracao.salvarArquivo(dados, FILE_PATH);
    }

    public void lerTurma() {
        ArrayList<Serializable> listaTurma = dados.get("turma");
        if (listaTurma != null) {
            for (Serializable t : listaTurma) {
                Turma turma = (Turma) t;
                turmas.add(turma);
            }
        }
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public ArrayList<Escola> getEscolas() {
        return escolas;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
