
package Controlo;

import Modelo.Crianca;
import Modelo.Pagamento;
import Util.criancaHibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Manjate
 */
public class PagamentoDao {
    
    /**
     *Metodo estatico que sera responsavel por salvar os dados na base de dados
     * @param pagamento
     * @return
     */
    public static boolean salvar(Pagamento pagamento){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.save(pagamento);
       
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
     * @param pagamento
     * @return
     */
    public static boolean remover(Pagamento pagamento){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
        try {
            
         s.beginTransaction();
         s.delete(pagamento);
       
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
            public static ArrayList<Pagamento> buscar() {
        boolean funcionou = false;
        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<Pagamento> lista=new ArrayList();
        try {
           
            lista = (ArrayList<Pagamento>)sessao.createQuery("from Pagamento").list();
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
    public static Pagamento pesquisar(int id) {

        Session sessao = factory.openSession();
        sessao.beginTransaction();
         ArrayList<Pagamento> lista=new ArrayList();
        try {
           
            lista = (ArrayList<Pagamento>)sessao.createQuery("from Pagamento").list();
            sessao.getTransaction().commit();
            
            for (Pagamento pa: lista) {
                if (pa.getId()==id) {
                  return pa;  
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