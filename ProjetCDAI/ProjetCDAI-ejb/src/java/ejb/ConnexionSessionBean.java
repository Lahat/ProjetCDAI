/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Connexion;
import entity.Inscription;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lahat
 */
@Stateless
public class ConnexionSessionBean extends AbstractFacade<Connexion> implements IConnexionSessionBeanLocal {

    @PersistenceContext(unitName = "ProjetCDAI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConnexionSessionBean() {
        super(Connexion.class);
    }

    @Override
    public boolean insertConnexion(String login, String mdp) {
       try {
          Connexion c = new Connexion();
          c.setLogin(login);
          c.setMdp(mdp);
          em.persist(c);
          return true;
         
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
    
    
}
