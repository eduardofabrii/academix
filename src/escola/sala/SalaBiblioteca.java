package escola.sala;

public class SalaBiblioteca extends Sala {
    int quantidadeLivros;

    public SalaBiblioteca(int id, String nome, int capacidade, int quantidadeLivros) {
        super(id, nome, capacidade);
        this.quantidadeLivros = quantidadeLivros;
    }
  
    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    @Override
    public boolean verificarDisponibilidade() {
        return true;
    }

    @Override
    public void reservarSala() {
        System.out.println("Sala Biblioteca: " + getNome() + "Capacidade: " + getCapacidade() + "Qauntidade de livros: " +getQuantidadeLivros());
    }
}
