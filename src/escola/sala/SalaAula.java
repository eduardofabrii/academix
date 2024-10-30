package escola.sala;

import java.util.ArrayList;
import java.util.List;

public class SalaAula extends Sala {
    public SalaAula(int id, String nome, int capacidade) {
        super(id, nome, capacidade);
    }

    @Override
    public boolean verificarDisponibilidade() {
        return true; // Valor padrao
    }

    @Override
    public void reservarSala() {
        System.out.println("Sala" + getNome() + "Capacidade" + getCapacidade() );
    }
}

