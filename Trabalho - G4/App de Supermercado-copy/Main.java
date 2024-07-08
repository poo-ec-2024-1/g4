public class Main {
    public static void main(String[] args) {
        // Criando um usuário
        Usuario usuario = new Usuario("João", "joao@email.com", "senha123");

        // Criando alguns produtos
        Produto produto1 = new Produto("Arroz", 10.0);
        Produto produto2 = new Produto("Feijão", 8.0);

        // Adicionando produtos ao carrinho do usuário
        usuario.adicionarProdutoAoCarrinho(produto1);
        usuario.adicionarProdutoAoCarrinho(produto2);

        // Finalizando a compra e criando um pedido
        Pedido pedido = usuario.finalizarCompra();

        // Simulando uma entrega
        Entrega entrega = new Entrega(pedido, "Rua A, 123", "14:00");

        // Exibindo informações
        System.out.println("Pedido realizado por: " + usuario.getNome());
        System.out.println("Produtos do pedido:");
        for (Produto produto : pedido.getProdutos()) {
            System.out.println("- " + produto.getNome());
        }
        System.out.println("Endereço de entrega: " + entrega.getEndereco());
        System.out.println("Horário de entrega: " + entrega.getHorario());
    }
}
