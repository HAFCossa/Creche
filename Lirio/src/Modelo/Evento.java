
package Modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Manjate
 */
@Entity
public class Evento {
    
    @Id
    @GeneratedValue
    private int id;
   private String localevento;
   private String tipoevento;
   private String descricao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private String  dataevento;
  private int horaevento;

    /**
     * Contrutor sem parâmetros
     */
    public Evento() {
      
  }
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
     * @return the localevento
     */
    public String getLocalevento() {
        return localevento;
    }

    /**
     * @param localevento the localevento to set
     */
    public void setLocalevento(String localevento) {
        this.localevento = localevento;
    }

    /**
     * @return the tipoevento
     */
    public String getTipoevento() {
        return tipoevento;
    }

    /**
     * @param tipoevento the tipoevento to set
     */
    public void setTipoevento(String tipoevento) {
        this.tipoevento = tipoevento;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataevento
     */
    public String getDataevento() {
        return dataevento;
    }

    /**
     * @param dataevento the dataevento to set
     */
    public void setDataevento(String dataevento) {
        this.dataevento = dataevento;
    }

    /**
     * @return the horaevento
     */
    public int getHoraevento() {
        return horaevento;
    }

    /**
     * @param horaevento the horaevento to set
     */
    public void setHoraevento(int horaevento) {
        this.horaevento = horaevento;
    }

   
}
