package escola.sala;

public class SalaBiblioteca extends Sala {
    int quantidadeLivros;
    public SalaBiblioteca(int id, String nome, int capacidade, int quantidadeLivros) {
        super(id, nome, capacidade);
        this.quantidadeLivros = quantidadeLivros;
    }


}
