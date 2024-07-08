import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Carrinho carrinho;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.carrinho = new Carrinho();
    }

    public void adicionarProdutoAoCarrinho(Produto produto) {
        carrinho.adicionarProduto(produto);
    }

    public Pedido finalizarCompra() {
        List<Produto> produtos = carrinho.getProdutos();
        Pedido pedido = new Pedido(this, produtos);
        carrinho.esvaziarCarrinho();
        return pedido;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
}

   