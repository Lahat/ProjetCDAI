/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Connexion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lahat
 */
@Local
public interface IConnexionSessionBeanLocal {

    void create(Connexion connexion);

    void edit(Connexion connexion);

    void remove(Connexion connexion);

    Connexion find(Object id);

    List<Connexion> findAll();

    List<Connexion> findRange(int[] range);

    int count();

    boolean insertConnexion(String login, String mdp);
    
}
