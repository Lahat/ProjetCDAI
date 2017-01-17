/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Annonce;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lahat
 */
@Stateless
public class AnnonceSessionBean extends AbstractFacade<Annonce> implements IAnnonceSessionBean {

    @PersistenceContext(unitName = "ProjetCDAI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AnnonceSessionBean() {
        super(Annonce.class);
    }

    @Override
    public void creerAnnonce(String restaurateur, String restaurant, String plagedispo, String nbreplacedispo, String datededispo, String reduction, String pourcreduction) {
        Annonce an = new Annonce();
        an.setRestaurateur(restaurateur);
        an.setRestaurant(restaurant);
        an.setPlagedispo(plagedispo);
        an.setNbreplacedispo(nbreplacedispo);
        an.setDatededispo(datededispo);
        an.setReduction(reduction);
        an.setPourcreduction(pourcreduction);
        
        em.persist(an);
    }
    
}
