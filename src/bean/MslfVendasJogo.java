package bean;
// Generated 29/11/2023 10:04:28 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MslfVendasJogo generated by hbm2java
 */
@Entity
@Table(name="MslfVendasJogo"
    ,catalog="db_mateus_fonseca"
)
public class MslfVendasJogo  implements java.io.Serializable {


     private int mslfIdVendasJogo;
     private MslfJogo mslfJogo;
     private MslfVendas mslfVendas;
     private int mslfQuantidade;
     private double mslfValorUnitario;

    public MslfVendasJogo() {
    }

    public MslfVendasJogo(int mslfIdVendasJogo, MslfJogo mslfJogo, MslfVendas mslfVendas, int mslfQuantidade, double mslfValorUnitario) {
       this.mslfIdVendasJogo = mslfIdVendasJogo;
       this.mslfJogo = mslfJogo;
       this.mslfVendas = mslfVendas;
       this.mslfQuantidade = mslfQuantidade;
       this.mslfValorUnitario = mslfValorUnitario;
    }
   
     @Id 

    
    @Column(name="MSLF_idVendasJogo", unique=true, nullable=false)
    public int getMslfIdVendasJogo() {
        return this.mslfIdVendasJogo;
    }
    
    public void setMslfIdVendasJogo(int mslfIdVendasJogo) {
        this.mslfIdVendasJogo = mslfIdVendasJogo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MSLF_idJogo", nullable=false)
    public MslfJogo getMslfJogo() {
        return this.mslfJogo;
    }
    
    public void setMslfJogo(MslfJogo mslfJogo) {
        this.mslfJogo = mslfJogo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MSLF_idVendas", nullable=false)
    public MslfVendas getMslfVendas() {
        return this.mslfVendas;
    }
    
    public void setMslfVendas(MslfVendas mslfVendas) {
        this.mslfVendas = mslfVendas;
    }

    
    @Column(name="MSLF_Quantidade", nullable=false)
    public int getMslfQuantidade() {
        return this.mslfQuantidade;
    }
    
    public void setMslfQuantidade(int mslfQuantidade) {
        this.mslfQuantidade = mslfQuantidade;
    }

    
    @Column(name="MSLF_ValorUnitario", nullable=false, precision=22, scale=0)
    public double getMslfValorUnitario() {
        return this.mslfValorUnitario;
    }
    
    public void setMslfValorUnitario(double mslfValorUnitario) {
        this.mslfValorUnitario = mslfValorUnitario;
    }




}

