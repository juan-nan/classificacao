public class Item {

    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // preco do produto x quantidade
    public double getSubtotal() {

        return 0.0;
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getDescricao() + " = R$ " + getSubtotal();
    }
}
