/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlo;

import Modelo.EstCrianca;
import Util.criancaHibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Manjate
 */
public class EstCriancaDao {
      
    /**
     *
     * @param estcrianca
     * @return
     */
    public static boolean salvar(EstCrianca estcrianca){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.save(estcrianca);
         s.getTransaction().commit();
         s.close();
        return true;
        } catch (Exception e) {
            return false;
        }finally{
            fr.close();
        }
        
    }
     
   public static boolean remover(EstCrianca estcrianca){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.delete(estcrianca);
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
            public static ArrayList<EstCrianca> buscar() {
        boolean funcionou = false;
        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<EstCrianca> lista=new ArrayList();
        try {
           
            lista = (ArrayList<EstCrianca>)sessao.createQuery("from EstCrianca").list();
            sessao.getTransaction().commit();
            return lista;
         
        } catch (Exception h) {
            
        } finally {
            sessao.close();
           
        }
        return lista;
    } 
            
            
            
        public static EstCrianca pesquisar(int id) {

        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<EstCrianca> lista=new ArrayList();
        try {
           
            lista = (ArrayList<EstCrianca>)sessao.createQuery("from EstCrianca").list();
            sessao.getTransaction().commit();
            
            for (EstCrianca ec : lista) {
                if (ec.getId()==id) {
                  return ec;  
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
