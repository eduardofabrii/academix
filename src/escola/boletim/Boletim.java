package escola.boletim;

import escola.administracao.Disciplina;
import escola.pessoas.Professor;
import java.util.List;

public class Boletim  {
    private List<Disciplina> disciplinas;
    private double mediaFinal;
    private List<Double> notas;


    public double calcularMedia() {
        if (notas == null || notas.isEmpty()) {
            return 0; // Retorna 0 se a lista de notas estiver vazia ou for nula
        }

        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }

        mediaFinal = soma / notas.size();
        return mediaFinal;
    }

    // Getters e setters para as listas e a média final podem ser adicionados conforme necessário
}
