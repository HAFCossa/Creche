
package Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class EstSituacaoCrianca {
    @Id
    private int id;
    private String percepcao;
    private String pronucia;
    private String atencao;
    private String trauma;
    private String relacion;

    
    /**
     * Contrutor sem parâmetros
     */
    public EstSituacaoCrianca() {
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
     * @return the percepcao
     */
    public String getPercepcao() {
        return percepcao;
    }

    /**
     * @param percepcao the percepcao to set
     */
    public void setPercepcao(String percepcao) {
        this.percepcao = percepcao;
    }

    /**
     * @return the pronucia
     */
    public String getPronucia() {
        return pronucia;
    }

    /**
     * @param pronucia the pronucia to set
     */
    public void setPronucia(String pronucia) {
        this.pronucia = pronucia;
    }

    /**
     * @return the atencao
     */
    public String getAtencao() {
        return atencao;
    }

    /**
     * @param atencao the atencao to set
     */
    public void setAtencao(String atencao) {
        this.atencao = atencao;
    }

    /**
     * @return the trauma
     */
    public String getTrauma() {
        return trauma;
    }

    /**
     * @param trauma the trauma to set
     */
    public void setTrauma(String trauma) {
        this.trauma = trauma;
    }

    /**
     * @return the relacion
     */
    public String getRelacion() {
        return relacion;
    }

    /**
     * @param relacion the relacion to set
     */
    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
    
   
}
