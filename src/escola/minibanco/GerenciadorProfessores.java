package escola.minibanco;

import escola.pessoas.Professor;

import java.util.ArrayList;

public class GerenciadorProfessores {

    private static GerenciadorProfessores instance;
    private ArrayList<Professor> listaProfessores;

    private GerenciadorProfessores() {
        listaProfessores = new ArrayList<>();
    }

    // Retorna a instância única do Gerenciador
    public static GerenciadorProfessores getInstance() {
        if (instance == null) {
            instance = new GerenciadorProfessores();
        }
        return instance;
    }

    // Retorna a lista de professores
    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    // Adiciona um novo professor à lista
    public void adicionarProfessor(Professor professor) {
        listaProfessores.add(professor);
    }
}
