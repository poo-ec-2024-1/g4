import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void esvaziarCarrinho() {
        produtos.clear();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
