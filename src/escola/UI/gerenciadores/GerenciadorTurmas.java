
package escola.UI.gerenciadores;

import escola.administracao.Turma;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTurmas {
    private static GerenciadorTurmas instance;
    private List<Turma> listaTurmas;

    private GerenciadorTurmas() {
        listaTurmas = new ArrayList<>();
    }

    public static GerenciadorTurmas getInstance() {
        if (instance == null) {
            instance = new GerenciadorTurmas();
        }
        return instance;
    }

    public void adicionarTurma(Turma turma) {
        listaTurmas.add(turma);
    }

    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }
}
