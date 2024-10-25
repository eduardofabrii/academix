package escola.cantina;

public class Refeicao {
    private String nomePrato;
    private String descricao;
    private float pesoEmGramas;
    private int volumeMiliLitros;

    public Refeicao(String nomePrato, String descricao){
        this.nomePrato = nomePrato;
        this.descricao = descricao;
    }

    public Refeicao(String nomePrato, String descricao, float pesoEmGramas) {
        this.nomePrato = nomePrato;
        this.descricao = descricao;
        this.pesoEmGramas = pesoEmGramas;
    }

    public Refeicao(String nomePrato, String descricao, int volumeMiliLitros) {
        this.nomePrato = nomePrato;
        this.descricao = descricao;
        this.volumeMiliLitros = volumeMiliLitros;
    }

    @Override
    public String toString() {
        return "Refeicão{" +
                "nome do prato ='" + nomePrato + '\'' +
                ", descricão ='" + descricao + '\'' +
                ", peso em gramas =" + pesoEmGramas +
                ", volume em mililitros=" + volumeMiliLitros +
                '}';
    }
}
