package escola.sala;

import java.io.Serializable;

public abstract class Sala implements Serializable {
    private int id;
    private String nome;
    private int capacidade;

    public Sala() {
    }

    public Sala(int id, String nome, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return getNome() + " - Capacidade: " + getCapacidade();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract boolean verificarDisponibilidade();

    public abstract void reservarSala();
}

