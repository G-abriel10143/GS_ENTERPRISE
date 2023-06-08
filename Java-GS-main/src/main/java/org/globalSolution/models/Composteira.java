import javax.persistence.*;

@Entity
@Table(name = "composteira")
public class Composteira {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    private Integer quantidade;

    @Column(name = "data_descarte")
    private LocalDate dataDescarte;

    @Column(name = "tipo_descarte")
    private String tipoDescarte;

    @Column(name = "motivo_descarte")
    private String motivoDescarte;

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
    
    public Integer getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public LocalDate getDataDescarte() {
        return dataDescarte;
    }
    
    public void setDataDescarte(LocalDate dataDescarte) {
        this.dataDescarte = dataDescarte;
    }
    
    public String getTipoDescarte() {
        return tipoDescarte;
    }
    
    public void setTipoDescarte(String tipoDescarte) {
        this.tipoDescarte = tipoDescarte;
    }
    
    public String getMotivoDescarte() {
        return motivoDescarte;
    }
    
    public void setMotivoDescarte(String motivoDescarte) {
        this.motivoDescarte = motivoDescarte;
    }

    public void registrarDescarte() {
        this.dataDescarte = LocalDate.now();
    }

}
