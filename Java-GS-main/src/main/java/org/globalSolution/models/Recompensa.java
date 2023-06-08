import javax.persistence.*;

@Entity
@Table(name = "recompensas")
public class Recompensa {

    @Id
    private Integer id;

    private String nome;

    private String descricao;

    private Integer pontos;

    @Column(name = "data_expiracao")
    private LocalDate dataExpiracao;

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
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Integer getPontos() {
        return pontos;
    }
    
    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }
    
    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }
    
    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public void verificarValidade() {
        LocalDate dataAtual = LocalDate.now();
        if (dataExpiracao.isBefore(dataAtual)) {
            throw new IllegalArgumentException("A recompensa expirou.");
        }
    }

}
