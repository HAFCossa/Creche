/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlo;

import Modelo.Evento;
import Util.criancaHibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Manjate
 */
public class EventoDao {
    
    /**
     *Metodo estatico que sera responsavel por salvar os dados na base de dados
     * @param evento
     * @return
     */
    public static boolean salvar(Evento evento){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.save(evento);
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
     * @param evento
     * @return
     */
    public static boolean remover(Evento evento){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.delete(evento);
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
            public static ArrayList<Evento> buscar() {
        boolean funcionou = false;
        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<Evento> lista=new ArrayList();
        try {
           
            lista = (ArrayList<Evento>)sessao.createQuery("from Evento").list();
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
    public static Evento pesquisar(int id) {

        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<Evento> lista=new ArrayList();
        try {
           
            lista = (ArrayList<Evento>)sessao.createQuery("from Crianca").list();
            sessao.getTransaction().commit();
            
            for (Evento ev : lista) {
                if (ev.getId()==id) {
                  return ev;  
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