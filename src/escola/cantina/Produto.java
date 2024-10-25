package escola.cantina;

public class Produto {
    private String nomeProduto;
    private String descricaoProduto;
    private int unidadesProduto;

    public Produto(String nomeProduto, String descricaoProduto, int unidadesProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.unidadesProduto = unidadesProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getUnidadesProduto() {
        return unidadesProduto;
    }

    public void setUnidadesProduto(int unidadesProduto) {
        this.unidadesProduto = unidadesProduto;
    }
}
