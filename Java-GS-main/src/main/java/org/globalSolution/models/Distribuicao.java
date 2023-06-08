import javax.persistence.*;

@Entity
@Table(name = "distribuicao")
public class Distribuicao {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column(name = "quantidade_distribuida")
    private Integer quantidadeDistribuida;

    @Column(name = "data_distribuicao")
    private LocalDate dataDistribuicao;

    private String local;

    @Column(name = "preco_unitario")
    private BigDecimal precoUnitario;

    @Column(name = "total_vendido")
    private BigDecimal totalVendido;


    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Integer getQuantidadeDistribuida() {
        return quantidadeDistribuida;
    }
    
    public void setQuantidadeDistribuida(Integer quantidadeDistribuida) {
        this.quantidadeDistribuida = quantidadeDistribuida;
    }
    
    public LocalDate getDataDistribuicao() {
        return dataDistribuicao;
    }
    
    public void setDataDistribuicao(LocalDate dataDistribuicao) {
        this.dataDistribuicao = dataDistribuicao;
    }
    
    public String getLocal() {
        return local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }
    
    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public BigDecimal getTotalVendido() {
        return totalVendido;
    }
    
    public void setTotalVendido(BigDecimal totalVendido) {
        this.totalVendido = totalVendido;
    }
    
    public void registrarVenda(int quantidade) {
        if (produto.verificarDisponibilidade(quantidade)) {
            produto.removerEstoque(quantidade);
            this.quantidadeDistribuida += quantidade;
            this.totalVendido = this.precoUnitario.multiply(BigDecimal.valueOf(this.quantidadeDistribuida));
        } else {
            throw new IllegalArgumentException("Quantidade solicitada excede o estoque disponível.");
        }
    }
    
    public BigDecimal calcularTotalVendido() {
        return this.totalVendido;
    }

}
