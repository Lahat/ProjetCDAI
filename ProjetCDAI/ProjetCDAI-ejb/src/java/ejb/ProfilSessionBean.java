/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Profil;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lahat
 */
@Stateless
public class ProfilSessionBean extends AbstractFacade<Profil> implements IProfilSessionBean {

    @PersistenceContext(unitName = "ProjetCDAI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProfilSessionBean() {
        super(Profil.class);
    }
    
}
