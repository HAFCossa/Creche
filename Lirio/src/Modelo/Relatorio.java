package Modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

 @Entity
  public class Relatorio {
  @Id
  private int id;
  private String assunto;
  private String descricao;
  private Date  data;

  
  /**
     * Contrutor sem parâmetros
     */
   public Relatorio (){
       
   }
    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
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
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }
 
 
}
