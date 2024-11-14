package escola.minibanco.salas;

import escola.boletim.Boletim;
import escola.boletim.Nota;
import escola.sala.Sala;
import escola.sala.SalaAula;
import escola.sala.SalaBiblioteca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarDadosSalas {
    private static final String FILE_PATH = "src\\escola\\minibanco\\salas\\dadosSalas.ser";
    private HashMap<String, ArrayList<Sala>> dados = new HashMap<>();
    private ArrayList<SalaBiblioteca> salasBiblioteca = new ArrayList<>();
    private ArrayList<SalaAula> salasAula = new ArrayList<>();

    public GerenciarDadosSalas(){
        lerDados();
    }

    public void lerDados() {
        dados = EmpacotamentoSalas.lerArquivo(FILE_PATH);
        lerSalaAula();
        lerSalaBiblioteca();
    }

    public void gravarSalaBiblioteca(SalaBiblioteca sb) {
        ArrayList<Sala> listaSalaBiblioteca = dados.get("salaBiblioteca");
        if (listaSalaBiblioteca == null) {
            listaSalaBiblioteca = new ArrayList<>();
            dados.put("salaBiblioteca", listaSalaBiblioteca);
        }
        listaSalaBiblioteca.add(sb);
        dados.put("salaBiblioteca", listaSalaBiblioteca);
        EmpacotamentoSalas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerSalaBiblioteca() {
        ArrayList<Sala> listaSalaBiblioteca = dados.get("salaBiblioteca");
        if (listaSalaBiblioteca != null) {
            for (Sala sb : listaSalaBiblioteca) {
                SalaBiblioteca salaBiblioteca = (SalaBiblioteca) sb;
                salasBiblioteca.add(salaBiblioteca);
            }
        }
    }

    public void gravarSalaAula(SalaAula sa) {
        ArrayList<Sala> listaSalaAula = dados.get("salaAula");
        if (listaSalaAula == null) {
            listaSalaAula = new ArrayList<>();
            dados.put("salaAula", listaSalaAula);
        }
        listaSalaAula.add(sa);
        dados.put("salaAula", listaSalaAula);
        EmpacotamentoSalas.salvarArquivo(dados, FILE_PATH);
    }

    public void lerSalaAula() {
        ArrayList<Sala> listaSalaAula = dados.get("salaAula");
        if (listaSalaAula != null) {
            for (Sala sa : listaSalaAula) {
                SalaAula salaAula = (SalaAula) sa;
                salasAula.add(salaAula);
            }
        }
    }

    public ArrayList<SalaBiblioteca> getSalasBiblioteca() {
        return salasBiblioteca;
    }

    public ArrayList<SalaAula> getSalasAula() {
        return salasAula;
    }
}
