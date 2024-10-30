package escola.boletim;

import escola.administracao.Disciplina;
import escola.pessoas.Professor;

import java.util.ArrayList;
import java.util.List;
import escola.boletim.Nota;

public class Boletim  {
    private List<Disciplina> disciplinas;
    private double mediaFinal;
    private ArrayList<Nota> notas;

    public double calcularMedia() {
        if (notas == null || notas.isEmpty()) {
            return 0; // Retorna 0 se a lista de notas estiver vazia ou for nula
        }

        double soma = 0;
        for (Nota nota : notas) {
            soma += nota.getValor();
        }

        mediaFinal = soma / notas.size();
        return mediaFinal;
    }

    public void registrarNota(Nota nota){

    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    // Getters e setters para as listas e a média final podem ser adicionados conforme necessário
}
