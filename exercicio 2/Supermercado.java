import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Programa principal: mostra o menu e testa as classes.
public class Supermercado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // catalogo de produtos do supermercado
        List<Produto> catalogo = new ArrayList<>();
        catalogo.add(new Produto(Descricao.ARROZ, 25.90, 100));
        catalogo.add(new Produto(Descricao.FEIJAO, 8.50, 80));
        catalogo.add(new Produto(Descricao.FARINHA, 5.00, 60));
        catalogo.add(new Produto(Descricao.LEITE, 4.20, 200));

        Pedido pedidoAtual = null;

        int opcao;
        do {
            System.out.println("\n===== SUPERMERCADO =====");
            System.out.println("1) Novo pedido");
            System.out.println("2) Realizar pagamento");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    pedidoAtual = novoPedido(sc, catalogo);
                    break;
                case 2:
                    realizarPagamento(sc, pedidoAtual);
                    break;
                case 0:
                    System.out.println("Encerrando a aplicacao...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        sc.close();
    }

    // opcao 1: novo pedido
    private static Pedido novoPedido(Scanner sc, List<Produto> catalogo) {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        Pedido pedido = new Pedido(cliente);

        System.out.println("\nProdutos disponiveis:");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println((i + 1) + ") " + catalogo.get(i));
        }

        // TODO: laco para escolher produto + quantidade e adicionar os itens no pedido

        return pedido;
    }

    // opcao 2: realizar pagamento
    private static void realizarPagamento(Scanner sc, Pedido pedido) {
        if (pedido == null) {
            System.out.println("Nenhum pedido foi criado ainda.");
            return;
        }

        System.out.println("\n" + pedido);
        System.out.printf("Total a pagar: R$ %.2f%n", pedido.getTotal());

        // TODO: escolher a forma de pagamento e chamar pedido.setPagamento(...)
    }
}
