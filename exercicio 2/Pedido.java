import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Item> itens;
    private TipoPagamento pagamento;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.pagamento = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {

    }

    // soma o subtotal de todos os itens
    public double getTotal() {
        double total = 0.0;

        return total;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido de ").append(cliente).append("\n");
        for (Item item : itens) {
            sb.append("   ").append(item).append("\n");
        }
        sb.append("Total: R$ ").append(getTotal());
        if (pagamento != null) {
            sb.append(" | Pagamento: ").append(pagamento);
        }
        return sb.toString();
    }
}
