// Representa um produto vendido pelo supermercado.
public class Produto {

    private Descricao descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produto(Descricao descricao, double preco, int quantidadeEstoque) {
        this.descricao = descricao;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public Descricao getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preco invalido. Valor mantido: " + this.preco);
            return;
        }
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
        // falta validar quando vier negativo
    }

    public boolean baixarEstoque(int quantidade) {

        return false;
    }

    @Override
    public String toString() {
        return descricao + " - R$ " + preco + " (estoque: " + quantidadeEstoque + ")";
    }
}
