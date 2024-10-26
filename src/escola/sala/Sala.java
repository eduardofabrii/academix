package escola.sala;

public abstract class Sala {
    private int id;
    private String nome;
    private int capacidade;

    public Sala(int id, String nome, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
    }
}

