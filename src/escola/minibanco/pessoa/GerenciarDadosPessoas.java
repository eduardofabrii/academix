package escola.minibanco.pessoa;

import escola.pessoas.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarDadosPessoas {
    private static final String FILE_PATH = "src\\escola\\minibanco\\pessoa\\dadosPessoa.ser";
    private HashMap<String, ArrayList<Pessoa>> dados = new HashMap<>();
    private ArrayList<Aluno> alunos = new ArrayList();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    private ArrayList<Diretor> diretores = new ArrayList<>();
    private ArrayList<Faxineiro> faxineiros = new ArrayList<>();
    private ArrayList<Merendeiro> merendeiros = new ArrayList<>();
    private ArrayList<Monitor> monitores = new ArrayList<>();
    private ArrayList<Pedagogo> pedagogos = new ArrayList<>();
    private ArrayList<Porteiro> porteiros = new ArrayList<>();
    private ArrayList<Responsavel> responsaveis = new ArrayList<>();
    private ArrayList<Secretario> secretarios = new ArrayList<>();

    public GerenciarDadosPessoas(){
        lerDados();
    }

    public void lerDados(){
        dados = EmpacotamentoPessoas.lerArquivo(FILE_PATH);
        lerAluno();
        lerProfessores();
        lerBibliotecario();
        lerDiretor();
        lerFaxineiro();
        lerMerendeiro();
        lerMonitor();
        lerPedagogo();
        lerPorteiro();
        lerResponsavel();
        lerSecretario();
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

    public void gravarBibliotecario(Bibliotecario b){
        ArrayList<Pessoa> listaBibliotecario = dados.get("bibliotecario");
        if (listaBibliotecario == null){
            listaBibliotecario = new ArrayList<>();
            dados.put("bibliotecario", listaBibliotecario);
        }
        listaBibliotecario.add(b);
        dados.put("bibliotecario", listaBibliotecario);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerBibliotecario(){
        ArrayList<Pessoa> listaBibliotecario = dados.get("bibliotecario");
        if (listaBibliotecario != null){
            for (Pessoa b: listaBibliotecario){
                Bibliotecario bibliotecario = (Bibliotecario) b;
                bibliotecarios.add(bibliotecario);
            }

        }
    }

    public void gravarDiretor(Diretor d){
        ArrayList<Pessoa> listaDiretor = dados.get("diretor");
        if (listaDiretor == null){
            listaDiretor = new ArrayList<>();
            dados.put("diretor", listaDiretor);
        }
        listaDiretor.add(d);
        dados.put("diretor", listaDiretor);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerDiretor(){
        ArrayList<Pessoa> listaDiretor = dados.get("diretor");
        if (listaDiretor != null){
            for (Pessoa d: listaDiretor){
                Diretor diretor = (Diretor) d;
                diretores.add(diretor);
            }

        }
    }

    public void gravarFaxineiro(Faxineiro f){
        ArrayList<Pessoa> listaFaxineiro = dados.get("faxineiro");
        if (listaFaxineiro == null){
            listaFaxineiro = new ArrayList<>();
            dados.put("faxineiro", listaFaxineiro);
        }
        listaFaxineiro.add(f);
        dados.put("faxineiro", listaFaxineiro);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerFaxineiro(){
        ArrayList<Pessoa> listaFaxineiro = dados.get("faxineiro");
        if (listaFaxineiro != null){
            for (Pessoa f: listaFaxineiro){
                Faxineiro faxineiro = (Faxineiro) f;
                faxineiros.add(faxineiro);
            }

        }
    }

    public void gravarMerendeiro(Merendeiro m){
        ArrayList<Pessoa> listaMerendeiro= dados.get("merendeiro");
        if (listaMerendeiro == null){
            listaMerendeiro = new ArrayList<>();
            dados.put("merendeiro", listaMerendeiro);
        }
        listaMerendeiro.add(m);
        dados.put("merendeiro", listaMerendeiro);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerMerendeiro(){
        ArrayList<Pessoa> listaMerendeiro = dados.get("merendeiro");
        if (listaMerendeiro != null){
            for (Pessoa m: listaMerendeiro){
                Merendeiro merendeiro = (Merendeiro) m;
                merendeiros.add(merendeiro);
            }

        }
    }

    public void gravarMonitor(Monitor m){
        ArrayList<Pessoa> listaMonitor = dados.get("monitor");
        if (listaMonitor == null){
            listaMonitor = new ArrayList<>();
            dados.put("monitor", listaMonitor);
        }
        listaMonitor.add(m);
        dados.put("monitor", listaMonitor);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerMonitor(){
        ArrayList<Pessoa> listaMonitor = dados.get("monitor");
        if (listaMonitor != null){
            for (Pessoa m: listaMonitor){
                Monitor monitor = (Monitor) m;
                monitores.add(monitor);
            }

        }
    }

    public void gravarPedagogo(Pedagogo p){
        ArrayList<Pessoa> listaPedagogo = dados.get("pedagogo");
        if (listaPedagogo == null){
            listaPedagogo = new ArrayList<>();
            dados.put("pedagogo", listaPedagogo);
        }
        listaPedagogo.add(p);
        dados.put("pedagogo", listaPedagogo);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerPedagogo(){
        ArrayList<Pessoa> listaPedagogo = dados.get("pedagogo");
        if (listaPedagogo != null){
            for (Pessoa p: listaPedagogo){
                Pedagogo pedagogo = (Pedagogo) p;
                pedagogos.add(pedagogo);
            }

        }
    }

    public void gravarPorteiro(Porteiro p){
        ArrayList<Pessoa> listaPorteiro = dados.get("porteiro");
        if (listaPorteiro == null){
            listaPorteiro = new ArrayList<>();
            dados.put("porteiro", listaPorteiro);
        }
        listaPorteiro.add(p);
        dados.put("porteiro", listaPorteiro);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerPorteiro(){
        ArrayList<Pessoa> listaPorteiro = dados.get("porteiro");
        if (listaPorteiro != null){
            for (Pessoa p: listaPorteiro){
                Porteiro porteiro = (Porteiro) p;
                porteiros.add(porteiro);
            }
        }
    }

    public void gravarResponsavel(Responsavel r){
        ArrayList<Pessoa> listaResponsavel = dados.get("responsavel");
        if (listaResponsavel == null){
            listaResponsavel = new ArrayList<>();
            dados.put("responsavel", listaResponsavel);
        }
        listaResponsavel.add(r);
        dados.put("responsavel", listaResponsavel);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerResponsavel(){
        ArrayList<Pessoa> listaResponsavel = dados.get("responsavel");
        if (listaResponsavel != null){
            for (Pessoa r: listaResponsavel){
                Responsavel responsavel = (Responsavel) r;
                responsaveis.add(responsavel);
            }
        }
    }

    public void gravarSecretario(Secretario s){
        ArrayList<Pessoa> listaSecretario = dados.get("secretario");
        if (listaSecretario == null){
            listaSecretario = new ArrayList<>();
            dados.put("secretario", listaSecretario);
        }
        listaSecretario.add(s);
        dados.put("secretario", listaSecretario);
        EmpacotamentoPessoas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerSecretario(){
        ArrayList<Pessoa> listaSecretario = dados.get("secretario");
        if (listaSecretario != null){
            for (Pessoa s: listaSecretario){
                Secretario secretario = (Secretario) s;
                secretarios.add(secretario);
            }
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public ArrayList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public ArrayList<Diretor> getDiretores(){
        return diretores;
    }

    public ArrayList<Faxineiro> getFaxineiros() {
        return faxineiros;
    }

    public ArrayList<Merendeiro> getMerendeiros() {
        return merendeiros;
    }

    public ArrayList<Monitor> getMonitores() {
        return monitores;
    }

    public ArrayList<Pedagogo> getPedagogos() {
        return pedagogos;
    }

    public ArrayList<Porteiro> getPorteiros() {
        return porteiros;
    }

    public ArrayList<Responsavel> getResponsaveis() {
        return responsaveis;
    }

    public ArrayList<Secretario> getSecretarios() {
        return secretarios;
    }
}
