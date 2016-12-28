/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Inscription;
import entity.Utilisateur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lahat
 */
@Stateless
public class UtilisateurSessionBean extends AbstractFacade<Utilisateur> implements IUtilisateurSessionBeanLocal {

    @PersistenceContext(unitName = "ProjetCDAI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilisateurSessionBean() {
        super(Utilisateur.class);
    }
    
    
    

    @Override
    public boolean insertUtilisateur(String nom, String prenom, String adresse, String mail, String mdp, String Profil) {
        try {
          Inscription i = new Inscription();
          i.setNom(nom);
          i.setPrenom(prenom);
          i.setAdresse(adresse);
          i.setLogin(Profil);
          i.setProfil(Profil);
          em.persist(i);
          return true;
         
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
}
