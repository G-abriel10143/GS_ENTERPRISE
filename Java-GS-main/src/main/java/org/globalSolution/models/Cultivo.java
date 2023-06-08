import javax.persistence.*;

@Entity
@Table(name = "cultivo")
public class Cultivo {

    @Id
    private Integer id;

    @Column(name = "nome_planta")
    private String nomePlanta;

    @Column(name = "metodo_cultivo")
    private String metodoCultivo;

    @Column(name = "tempo_crescimento")
    private Integer tempoCrescimento;

    private Integer dificuldade;

    @Column(name = "temperatura_minima")
    private BigDecimal temperaturaMinima;

    @Column(name = "temperatura_maxima")
    private BigDecimal temperaturaMaxima;

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNomePlanta() {
        return nomePlanta;
    }
    
    public void setNomePlanta(String nomePlanta) {
        this.nomePlanta = nomePlanta;
    }
    
    public String getMetodoCultivo() {
        return metodoCultivo;
    }
    
    public void setMetodoCultivo(String metodoCultivo) {
        this.metodoCultivo = metodoCultivo;
    }
    
    public Integer getTempoCrescimento() {
        return tempoCrescimento;
    }
    
    public void setTempoCrescimento(Integer tempoCrescimento) {
        this.tempoCrescimento = tempoCrescimento;
    }
    
    public Integer getDificuldade() {
        return dificuldade;
    }
    
    public void setDificuldade(Integer dificuldade) {
        this.dificuldade = dificuldade;
    }
    
    public BigDecimal getTemperaturaMinima() {
        return temperaturaMinima;
    }
    
    public void setTemperaturaMinima(BigDecimal temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
    
    public BigDecimal getTemperaturaMaxima() {
        return temperaturaMaxima;
    }
    
    public void setTemperaturaMaxima(BigDecimal temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public void calcularTempoColheita() {
        return this.tempoCrescimento;
    }

    
}
