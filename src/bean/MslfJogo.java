package bean;
// Generated 01/12/2023 17:46:58 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MslfJogo generated by hbm2java
 */
@Entity
@Table(name="MslfJogo"
    ,catalog="db_mateus_fonseca"
)
public class MslfJogo  implements java.io.Serializable {


     private int mslfIdJogo;
     private String mslfNome;
     private String mslfEmpresa;
     private Date mslfAno;
     private double mslfPreco;
     private String mslfGenero;
     private String mslfIdioma;
     private String mslfAvaliacaoGeral;
     private String mslfObservacao;
     private String mslfEdicao;
     private int mslfEstoque;
     private String mslfBrinde;
     private Double mslfDesconto;
     private String mslfClassificacao;

    public MslfJogo() {
    }

	
    public MslfJogo(int mslfIdJogo, String mslfNome, String mslfEmpresa, Date mslfAno, double mslfPreco, String mslfGenero, String mslfIdioma, String mslfAvaliacaoGeral, int mslfEstoque, String mslfClassificacao) {
        this.mslfIdJogo = mslfIdJogo;
        this.mslfNome = mslfNome;
        this.mslfEmpresa = mslfEmpresa;
        this.mslfAno = mslfAno;
        this.mslfPreco = mslfPreco;
        this.mslfGenero = mslfGenero;
        this.mslfIdioma = mslfIdioma;
        this.mslfAvaliacaoGeral = mslfAvaliacaoGeral;
        this.mslfEstoque = mslfEstoque;
        this.mslfClassificacao = mslfClassificacao;
    }
    public MslfJogo(int mslfIdJogo, String mslfNome, String mslfEmpresa, Date mslfAno, double mslfPreco, String mslfGenero, String mslfIdioma, String mslfAvaliacaoGeral, String mslfObservacao, String mslfEdicao, int mslfEstoque, String mslfBrinde, Double mslfDesconto, String mslfClassificacao, Set mslfVendasJogos) {
       this.mslfIdJogo = mslfIdJogo;
       this.mslfNome = mslfNome;
       this.mslfEmpresa = mslfEmpresa;
       this.mslfAno = mslfAno;
       this.mslfPreco = mslfPreco;
       this.mslfGenero = mslfGenero;
       this.mslfIdioma = mslfIdioma;
       this.mslfAvaliacaoGeral = mslfAvaliacaoGeral;
       this.mslfObservacao = mslfObservacao;
       this.mslfEdicao = mslfEdicao;
       this.mslfEstoque = mslfEstoque;
       this.mslfBrinde = mslfBrinde;
       this.mslfDesconto = mslfDesconto;
       this.mslfClassificacao = mslfClassificacao;
    }
   
     @Id 

    
    @Column(name="MSLF_idJogo", unique=true, nullable=false)
    public int getMslfIdJogo() {
        return this.mslfIdJogo;
    }
    
    public void setMslfIdJogo(int mslfIdJogo) {
        this.mslfIdJogo = mslfIdJogo;
    }

    
    @Column(name="MSLF_nome", nullable=false, length=100)
    public String getMslfNome() {
        return this.mslfNome;
    }
    
    public void setMslfNome(String mslfNome) {
        this.mslfNome = mslfNome;
    }

    
    @Column(name="MSLF_empresa", nullable=false, length=100)
    public String getMslfEmpresa() {
        return this.mslfEmpresa;
    }
    
    public void setMslfEmpresa(String mslfEmpresa) {
        this.mslfEmpresa = mslfEmpresa;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MSLF_ano", nullable=false, length=10)
    public Date getMslfAno() {
        return this.mslfAno;
    }
    
    public void setMslfAno(Date mslfAno) {
        this.mslfAno = mslfAno;
    }

    
    @Column(name="MSLF_preco", nullable=false, precision=22, scale=0)
    public double getMslfPreco() {
        return this.mslfPreco;
    }
    
    public void setMslfPreco(double mslfPreco) {
        this.mslfPreco = mslfPreco;
    }

    
    @Column(name="MSLF_genero", nullable=false, length=45)
    public String getMslfGenero() {
        return this.mslfGenero;
    }
    
    public void setMslfGenero(String mslfGenero) {
        this.mslfGenero = mslfGenero;
    }

    
    @Column(name="MSLF_idioma", nullable=false, length=45)
    public String getMslfIdioma() {
        return this.mslfIdioma;
    }
    
    public void setMslfIdioma(String mslfIdioma) {
        this.mslfIdioma = mslfIdioma;
    }

    
    @Column(name="MSLF_avaliacao_geral", nullable=false, length=300)
    public String getMslfAvaliacaoGeral() {
        return this.mslfAvaliacaoGeral;
    }
    
    public void setMslfAvaliacaoGeral(String mslfAvaliacaoGeral) {
        this.mslfAvaliacaoGeral = mslfAvaliacaoGeral;
    }

    
    @Column(name="MSLF_Observacao", length=300)
    public String getMslfObservacao() {
        return this.mslfObservacao;
    }
    
    public void setMslfObservacao(String mslfObservacao) {
        this.mslfObservacao = mslfObservacao;
    }

    
    @Column(name="MSLF_edicao", nullable=false, length=45)
    public String getMslfEdicao() {
        return this.mslfEdicao;
    }
    
    public void setMslfEdicao(String mslfEdicao) {
        this.mslfEdicao = mslfEdicao;
    }

    
    @Column(name="MSLF_estoque", nullable=false)
    public int getMslfEstoque() {
        return this.mslfEstoque;
    }
    
    public void setMslfEstoque(int mslfEstoque) {
        this.mslfEstoque = mslfEstoque;
    }

    
    @Column(name="MSLF_brinde", length=45)
    public String getMslfBrinde() {
        return this.mslfBrinde;
    }
    
    public void setMslfBrinde(String mslfBrinde) {
        this.mslfBrinde = mslfBrinde;
    }

    
    @Column(name="MSLF_desconto", precision=22, scale=0)
    public Double getMslfDesconto() {
        return this.mslfDesconto;
    }
    
    public void setMslfDesconto(Double mslfDesconto) {
        this.mslfDesconto = mslfDesconto;
    }

    
    @Column(name="MSLF_classificacao", nullable=false, length=45)
    public String getMslfClassificacao() {
        return this.mslfClassificacao;
    }
    
    public void setMslfClassificacao(String mslfClassificacao) {
        this.mslfClassificacao = mslfClassificacao;
    }
    
    @Override
    public String toString() {
        return getMslfNome();
    }

    public boolean equals(Object object) {
        if (object instanceof MslfJogo) {
            MslfJogo jogo = (MslfJogo) object;
            if (this.getMslfIdJogo() == jogo.getMslfIdJogo()) {
                return true;
            }
        }
        return false;
    }

}


