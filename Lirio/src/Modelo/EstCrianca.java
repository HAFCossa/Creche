/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Manjate
 */
@Entity
  public class EstCrianca {
    @Id
    @GeneratedValue
    private int id;
    private String doenca;
    private String deficiencia;
    private String orfaoPai;
    private String OrfaoMae;
    private String sexo;
    private String nacionalidade;
    private String ano;// indica com quantos anos a maoria das criancas entra na creche

    
    /**
     * Contrutor sem parâmetros
     */
    public EstCrianca() {
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
     * @return the doenca
     */
    public String getDoenca() {
        return doenca;
    }

    /**
     * @param doenca the doenca to set
     */
    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    /**
     * @return the deficiencia
     */
    public String getDeficiencia() {
        return deficiencia;
    }

    /**
     * @param deficiencia the deficiencia to set
     */
    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    /**
     * @return the orfaoPai
     */
    public String getOrfaoPai() {
        return orfaoPai;
    }

    /**
     * @param orfaoPai the orfaoPai to set
     */
    public void setOrfaoPai(String orfaoPai) {
        this.orfaoPai = orfaoPai;
    }

    /**
     * @return the OrfaoMae
     */
    public String getOrfaoMae() {
        return OrfaoMae;
    }

    /**
     * @param OrfaoMae the OrfaoMae to set
     */
    public void setOrfaoMae(String OrfaoMae) {
        this.OrfaoMae = OrfaoMae;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
    

   
}
