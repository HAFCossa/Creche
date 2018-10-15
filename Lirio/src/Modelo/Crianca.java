
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Crianca {
    @Id
    @GeneratedValue
    private int id;
    private String apelido;
    private String nome;
    private String nascimento;
    private String morada;
    private String nacionalidade ;
    private String genero;
    private String doenca;
    private String naturalidade; 
    private String telefone;
    private String email;
    private String nomepai;
    private String nomemae;
    private String profissaopai;
    private String profissaomae;  
    
    
   // private ArrayList<Crianca> criancas= new ArrayList<>();
    
    
    
    /**
     * Contrutor sem parâmetros
     */
    public Crianca(){
        
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
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
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
     * @return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
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
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
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
     * @return the naturalidade
     */
    public String getNaturalidade() {
        return naturalidade;
    }

    /**
     * @param naturalidade the naturalidade to set
     */
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nomepai
     */
    public String getNomepai() {
        return nomepai;
    }

    /**
     * @param nomepai the nomepai to set
     */
    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    /**
     * @return the nomemae
     */
    public String getNomemae() {
        return nomemae;
    }

    /**
     * @param nomemae the nomemae to set
     */
    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    /**
     * @return the profissaopai
     */
    public String getProfissaopai() {
        return profissaopai;
    }

    /**
     * @param profissaopai the profissaopai to set
     */
    public void setProfissaopai(String profissaopai) {
        this.profissaopai = profissaopai;
    }

    /**
     * @return the profissaomae
     */
    public String getProfissaomae() {
        return profissaomae;
    }

    /**
     * @param profissaomae the profissaomae to set
     */
    public void setProfissaomae(String profissaomae) {
        this.profissaomae = profissaomae;
    }

   
  
    
    
  
}
