package escola.minibanco;

import escola.sala.SalaAula;

import java.util.ArrayList;

public class GerenciadorSalas {
    private static GerenciadorSalas instance; // única instância do GerenciadorSalas
    private ArrayList<SalaAula> listaSalas;   // lista que armazena as salas

    // Construtor privado para o padrão Singleton
    private GerenciadorSalas() {
        listaSalas = new ArrayList<>();
    }

    // Método que retorna a instância única do GerenciadorSalas
    public static GerenciadorSalas getInstance() {
        if (instance == null) {
            instance = new GerenciadorSalas();
        }
        return instance;
    }

    // Método para adicionar uma sala ao gerenciador
    public void adicionarSala(SalaAula sala) {
        if (sala != null && !listaSalas.contains(sala)) {
            listaSalas.add(sala);
            System.out.println("Sala adicionada: " + sala.getNome());
        } else {
            System.out.println("Sala já existe ou é nula.");
        }
    }

    // Método para remover uma sala do gerenciador
    public void removerSala(SalaAula sala) {
        if (sala != null && listaSalas.contains(sala)) {
            listaSalas.remove(sala);
            System.out.println("Sala removida: " + sala.getNome());
        } else {
            System.out.println("Sala não encontrada.");
        }
    }

    // Método para listar todas as salas
    public void listarSalas() {
        if (listaSalas.isEmpty()) {
            System.out.println("Não há salas cadastradas.");
        } else {
            System.out.println("Salas cadastradas:");
            for (SalaAula sala : listaSalas) {
                System.out.println(sala.getNome());
            }
        }
    }

    // Método para obter todas as salas cadastradas
    public ArrayList<SalaAula> getListaSalas() {
        return listaSalas;
    }
}

