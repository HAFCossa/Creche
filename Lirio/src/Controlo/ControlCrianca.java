
package Controlo;

import Modelo.Crianca;
import Util.criancaHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *Classe 
 * @author Helia
 */
public class ControlCrianca {
    
    /**
    * Metodo que salva os objectos na base de dados
     * @param crianca
     * @return
     */
    public Crianca save(Crianca crianca){
        SessionFactory fr= criancaHibernateUtil.getSessionFactory();
        Session s = fr.openSession();
      
         s.beginTransaction();
         s.saveOrUpdate(crianca);
         s.getTransaction().commit();
         s.close();
        //actualizar(cargos);
        return null;
        
    }
    
}
