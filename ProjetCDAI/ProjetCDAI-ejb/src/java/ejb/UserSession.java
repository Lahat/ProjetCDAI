/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Utilisateur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author izilife
 */
@Stateless
public class UserSession implements UserInterface{
    @PersistenceContext
    private EntityManager em;
   
    public void createUser(String name, String firstName, String phone, String address, String mail, String password, String profil){
        Utilisateur user = new Utilisateur();
        
        user.setNom(name);
        user.setPrenom(firstName);
        user.setTelephone(phone);
        user.setAdresse(address);
        user.setEmail(mail);
        user.setMotdepasse(password);
        user.setProfil(profil);
        
        em.persist(user);
    }

    
    
}
