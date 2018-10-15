/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlo;

import Modelo.Relatorio;
import Util.criancaHibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Manjate
 */
public class RelatorioDao {

    /**
     *Metodo estatico que sera responsavel por salvar os dados na base de dados
     * @param relatorio
     * @return
     */
    public static boolean salvar(Relatorio relatorio){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.save(relatorio);
       
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
     * @param relatorio
     * @return
     */
    public static boolean remover(Relatorio relatorio){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.delete(relatorio);
       
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
            public static ArrayList<Relatorio> buscar() {
        boolean funcionou = false;
        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<Relatorio> lista=new ArrayList();
        try {
           
            lista = (ArrayList<Relatorio>)sessao.createQuery("from Relatorio").list();
            sessao.getTransaction().commit();
            return lista;
         
        } catch (Exception h) {
            
        } finally {
            sessao.close();
           
        }
        return lista;
    }
            
    /**
     *metodo responsavel por fazer uma pesquisa atraves dum determinado atributo
     * @param assunto
     * @return
     */
    public static Relatorio pesquisar(String assunto) {

        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<Relatorio> lista=new ArrayList();
        try {
           
            lista = (ArrayList<Relatorio>)sessao.createQuery("from Pagamento").list();
            sessao.getTransaction().commit();
            
            for (Relatorio re: lista) {
                if (re.getAssunto()==assunto) {
                  return re;  
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
