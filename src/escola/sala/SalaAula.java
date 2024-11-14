package escola.sala;

import escola.UI.gerenciadores.GerenciadorSalas;
import escola.minibanco.salas.GerenciarDadosSalas;

import java.util.ArrayList;
import java.util.List;

public class SalaAula extends Sala {
    public SalaAula() {
    }

    public SalaAula(int id, String nome, int capacidade) {
        super(id, nome, capacidade);
        new GerenciarDadosSalas().gravarSalaAula(this);
    }

    @Override
    public boolean verificarDisponibilidade() {
        return true; // Valor padrao
    }

    @Override
    public void reservarSala() {
        System.out.println("Sala" + getNome() + " - Capacidade" + getCapacidade() );
    }
}

