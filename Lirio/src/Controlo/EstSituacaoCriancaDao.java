/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlo;

import Modelo.EstSituacaoCrianca;
import Util.criancaHibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class EstSituacaoCriancaDao {
      
    /**
     * Metodo estatico que sera responsavel por salvar os dados na base de dados
     * @param estSituacao
     * @return
     */
    public static boolean salvar(EstSituacaoCrianca estSituacao){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.save(estSituacao);
         s.getTransaction().commit();
         s.close();
        return true;
        } catch (Exception e) {
            return false;
        }finally{
            fr.close();
        }
        
    }
     
    /**
     *metodo responsavel por remover um dado de forma logica
     * @param estSituacao
     * @return
     */
    public static boolean remover(EstSituacaoCrianca estSituacao){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.delete(estSituacao);
         s.getTransaction().commit();
         s.close();
        return true;
        } catch (Exception e) {
            return false;
        }finally{
            fr.close();
        }   
    
}
  public static SessionFactory factory = new Configuration().configure().buildSessionFactory();    
            public static ArrayList<EstSituacaoCrianca> buscar() {
        boolean funcionou = false;
        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<EstSituacaoCrianca> lista=new ArrayList();
        try {
           
            lista = (ArrayList<EstSituacaoCrianca>)sessao.createQuery("from Evento").list();
            sessao.getTransaction().commit();
            return lista;
         
        } catch (Exception h) {
            
        } finally {
            sessao.close();
           
        }
        return lista;
    } 
            
    /**
     *metodo responsavel por fazer uma pesquisa atraves dum atributo
     * @param id
     * @return
     */
    public static EstSituacaoCrianca pesquisar(int id) {

        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<EstSituacaoCrianca> lista=new ArrayList();
        try {
           
            lista = (ArrayList<EstSituacaoCrianca>)sessao.createQuery("from EstSituacaoCrianca").list();
            sessao.getTransaction().commit();
            
            for (EstSituacaoCrianca estSi : lista) {
                if (estSi.getId()==id) {
                  return estSi;  
                }
  
            }
         
        } catch (Exception h) {
            return null;
        } finally {
            sessao.close();
           
        }
        return null;
       
    }
    
    
   
    
}
