package bean;
// Generated 29/11/2023 10:04:28 by Hibernate Tools 4.3.1


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
 * MslfVendedor generated by hbm2java
 */
@Entity
@Table(name="MslfVendedor"
    ,catalog="db_mateus_fonseca"
)
public class MslfVendedor  implements java.io.Serializable {


     private int mslfIdVendedor;
     private String mslfNome;
     private String mslfEmail;
     private String mslfCpf;
     private String mslfRg;
     private String mslfSexo;
     private String mslfTelefone;
     private Date mslfDataNasc;
     private double mslfSalario;

    public MslfVendedor() {
    }

	
    public MslfVendedor(int mslfIdVendedor, String mslfNome, String mslfEmail, String mslfCpf, String mslfRg, String mslfSexo, String mslfTelefone, Date mslfDataNasc, double mslfSalario) {
        this.mslfIdVendedor = mslfIdVendedor;
        this.mslfNome = mslfNome;
        this.mslfEmail = mslfEmail;
        this.mslfCpf = mslfCpf;
        this.mslfRg = mslfRg;
        this.mslfSexo = mslfSexo;
        this.mslfTelefone = mslfTelefone;
        this.mslfDataNasc = mslfDataNasc;
        this.mslfSalario = mslfSalario;
    }
    public MslfVendedor(int mslfIdVendedor, String mslfNome, String mslfEmail, String mslfCpf, String mslfRg, String mslfSexo, String mslfTelefone, Date mslfDataNasc, double mslfSalario, Set mslfEntregases, Set mslfVendases) {
       this.mslfIdVendedor = mslfIdVendedor;
       this.mslfNome = mslfNome;
       this.mslfEmail = mslfEmail;
       this.mslfCpf = mslfCpf;
       this.mslfRg = mslfRg;
       this.mslfSexo = mslfSexo;
       this.mslfTelefone = mslfTelefone;
       this.mslfDataNasc = mslfDataNasc;
       this.mslfSalario = mslfSalario;
       
    }
   
     @Id 

    
    @Column(name="MSLF_idVendedor", unique=true, nullable=false)
    public int getMslfIdVendedor() {
        return this.mslfIdVendedor;
    }
    
    public void setMslfIdVendedor(int mslfIdVendedor) {
        this.mslfIdVendedor = mslfIdVendedor;
    }

    
    @Column(name="MSLF_nome", nullable=false, length=100)
    public String getMslfNome() {
        return this.mslfNome;
    }
    
    public void setMslfNome(String mslfNome) {
        this.mslfNome = mslfNome;
    }

    
    @Column(name="MSLF_email", nullable=false, length=100)
    public String getMslfEmail() {
        return this.mslfEmail;
    }
    
    public void setMslfEmail(String mslfEmail) {
        this.mslfEmail = mslfEmail;
    }

    
    @Column(name="MSLF_cpf", nullable=false, length=30)
    public String getMslfCpf() {
        return this.mslfCpf;
    }
    
    public void setMslfCpf(String mslfCpf) {
        this.mslfCpf = mslfCpf;
    }

    
    @Column(name="MSLF_rg", nullable=false, length=30)
    public String getMslfRg() {
        return this.mslfRg;
    }
    
    public void setMslfRg(String mslfRg) {
        this.mslfRg = mslfRg;
    }

    
    @Column(name="MSLF_sexo", nullable=false, length=10)
    public String getMslfSexo() {
        return this.mslfSexo;
    }
    
    public void setMslfSexo(String mslfSexo) {
        this.mslfSexo = mslfSexo;
    }

    
    @Column(name="MSLF_telefone", nullable=false, length=45)
    public String getMslfTelefone() {
        return this.mslfTelefone;
    }
    
    public void setMslfTelefone(String mslfTelefone) {
        this.mslfTelefone = mslfTelefone;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MSLF_data_nasc", nullable=false, length=10)
    public Date getMslfDataNasc() {
        return this.mslfDataNasc;
    }
    
    public void setMslfDataNasc(Date mslfDataNasc) {
        this.mslfDataNasc = mslfDataNasc;
    }

    
    @Column(name="MSLF_salario", nullable=false, precision=22, scale=0)
    public double getMslfSalario() {
        return this.mslfSalario;
    }
    
    public void setMslfSalario(double mslfSalario) {
        this.mslfSalario = mslfSalario;
    }


    
    @Override
    public String toString() {
        return getMslfNome();
    }

    public boolean equals(Object object) {
        if (object instanceof MslfVendedor) {
            MslfVendedor vendedor = (MslfVendedor) object;
            if (this.getMslfIdVendedor()== vendedor.getMslfIdVendedor()) {
                return true;
            }
        }
        return false;
    }

}


