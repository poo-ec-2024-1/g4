public class Entrega {
    private Pedido pedido;
    private String endereco;
    private String horario;
    private String status;

    public Entrega(Pedido pedido, String endereco, String horario) {
        this.pedido = pedido;
        this.endereco = endereco;
        this.horario = horario;
        this.status = "Pendente";
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    // getters e setters
    public String getEndereco() {
        return endereco;
    }

    public String getHorario() {
        return horario;
    }
}
