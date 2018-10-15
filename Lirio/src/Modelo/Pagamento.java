


package Modelo;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.mapping.Collection;
import org.omg.PortableInterceptor.INACTIVE;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue
    private int id;
    private String nome; 
     private String nivel;
    private String datapagamento;
    private double valor;
    private double multa;
     private String modo;
   @OneToMany(mappedBy = "Pagamento",fetch = FetchType.LAZY)
   @Cascade(CascadeType.SAVE_UPDATE)
   
   
   
  
   
   private ArrayList<Crianca>crianca;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the datapagamento
     */
    public String getDatapagamento() {
        return datapagamento;
    }

    /**
     * @param datapagamento the datapagamento to set
     */
    public void setDatapagamento(String datapagamento) {
        this.datapagamento = datapagamento;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the multa
     */
    public double getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(double multa) {
        this.multa = multa;
    }

    /**
     * @return the modo
     */
    public String getModo() {
        return modo;
    }

    /**
     * @param modo the modo to set
     */
    public void setModo(String modo) {
        this.modo = modo;
    }

    /**
     * @return the crianca
     */
    public ArrayList<Crianca> getCrianca() {
        return crianca;
    }

    /**
     * @param crianca the crianca to set
     */
    public void setCrianca(ArrayList<Crianca> crianca) {
        this.crianca = crianca;
    }
   

    
}
