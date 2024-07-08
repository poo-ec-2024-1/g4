import java.util.Date;
import java.util.List;

public class Pedido {
    private Usuario usuario;
    private List<Produto> produtos;
    private String status;
    private Date data;

    public Pedido(Usuario usuario, List<Produto> produtos) {
        this.usuario = usuario;
        this.produtos = produtos;
        this.status = "Pendente";
        this.data = new Date();
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    // getters e setters
    public List<Produto> getProdutos() {
        return produtos;
    }
}
