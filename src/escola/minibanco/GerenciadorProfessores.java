package escola.minibanco;

import escola.pessoas.Professor;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProfessores {

    // Instância única do gerenciador (Singleton)
    private static GerenciadorProfessores instance;

    // Lista de professores cadastrados
    private List<Professor> listaProfessores;

    // Construtor privado para impedir instâncias fora da classe
    private GerenciadorProfessores() {
        listaProfessores = new ArrayList<>();
    }

    // Método estático para obter a instância do gerenciador
    public static GerenciadorProfessores getInstance() {
        if (instance == null) {
            instance = new GerenciadorProfessores();
        }
        return instance;
    }

    // Método para adicionar um novo professor à lista
    public void adicionarProfessor(Professor professor) {
        if (professor != null && !listaProfessores.contains(professor)) {
            listaProfessores.add(professor);
            System.out.println("Professor " + professor.getNome() + " adicionado com sucesso!");
        } else {
            System.out.println("Professor já existente ou inválido.");
        }
    }

    // Método para remover um professor da lista
    public void removerProfessor(Professor professor) {
        if (professor != null && listaProfessores.contains(professor)) {
            listaProfessores.remove(professor);
            System.out.println("Professor " + professor.getNome() + " removido com sucesso!");
        } else {
            System.out.println("Professor não encontrado na lista.");
        }
    }

    // Método para buscar um professor pelo nome
    public Professor buscarProfessorPorNome(String nome) {
        for (Professor professor : listaProfessores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                return professor;
            }
        }
        return null; // Retorna null caso não encontre
    }

    // Método para obter todos os professores cadastrados
    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    // Método para verificar se existe um professor na lista
    public boolean existeProfessor(Professor professor) {
        return listaProfessores.contains(professor);
    }
}
