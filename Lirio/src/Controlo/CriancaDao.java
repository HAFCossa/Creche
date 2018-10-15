
package Controlo;

import Modelo.Crianca;
import Modelo.Evento;
import Modelo.Pagamento;
import Util.criancaHibernateUtil;
import java.awt.List;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;


public class CriancaDao {
  
    /**
     *Metodo que salva os objectos na base de dados
     * @param crianca
     * @return
     */
    public static boolean salvar(Crianca crianca){
          boolean funcionou = false;
        Session sessao = factory.openSession();
        sessao.beginTransaction();
        try {
            if(Integer.toString(crianca.getId()).length()==0) {
                sessao.save(crianca);
                
            } else {
                sessao.merge(crianca);
            }
            sessao.getTransaction().commit();
            funcionou = true;
        } catch (Exception h) {
            funcionou = false;
        } finally {
            sessao.close();
           
        }
        return funcionou;
    }
    
    /**
     *metodo que remove um dado a nivel logico
     * @param crianca
     * @return
     */
    public static boolean remover(Crianca crianca){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.delete(crianca);
       
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
            public static ArrayList<Crianca> buscar() {
        boolean funcionou = false;
        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<Crianca> lista=new ArrayList();
        try {
           
            lista = (ArrayList<Crianca>)sessao.createQuery("from Crianca").list();
            sessao.getTransaction().commit();
            return lista;
         
        } catch (Exception h) {
            
        } finally {
            sessao.close();
           
        }
        return lista;
    }
            
    /**
     *
     * @param id
     * @return
     */
    public static Crianca pesquisar(int id) {

        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<Crianca> lista=new ArrayList();
        try {
           
            lista = (ArrayList<Crianca>)sessao.createQuery("from Crianca").list();
            sessao.getTransaction().commit();
            
            for (Crianca cr : lista) {
                if (cr.getId()==id) {
                  return cr;  
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
