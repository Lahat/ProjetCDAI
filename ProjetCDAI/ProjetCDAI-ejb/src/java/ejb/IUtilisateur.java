/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;


import entity.Utilisateur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lahat
 */
@Local
public interface IUtilisateur {
    
    public void createUser(String name, String firstName, String phone, String address, String mail, String password, String profil);

    void create(Utilisateur utilisateur);

    void edit(Utilisateur utilisateur);

    void remove(Utilisateur utilisateur);

    Utilisateur find(Object id);

    List<Utilisateur> findAll();

    List<Utilisateur> findRange(int[] range);

    int count();
    
}
