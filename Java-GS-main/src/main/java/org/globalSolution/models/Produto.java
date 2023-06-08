import javax.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    private Integer id;

    private String nome;

    private String categoria;

    @Column(name = "data_validade")
    private LocalDate dataValidade;

    private Integer quantidade;

    private BigDecimal preco;

    private String fornecedor;

    private String descricao;

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public Integer getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public BigDecimal getPreco() {
        return preco;
    }
    
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
    public String getFornecedor() {
        return fornecedor;
    }
    
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
    
    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade solicitada excede o estoque disponível.");
        }
    }
    
    public boolean verificarDisponibilidade(int quantidade) {
        return this.quantidade >= quantidade;
    }


}
