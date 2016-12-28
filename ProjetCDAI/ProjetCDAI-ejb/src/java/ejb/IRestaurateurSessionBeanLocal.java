/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Restaurateur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lahat
 */
@Local
public interface IRestaurateurSessionBeanLocal {

    void create(Restaurateur restaurateur);

    void edit(Restaurateur restaurateur);

    void remove(Restaurateur restaurateur);

    Restaurateur find(Object id);

    List<Restaurateur> findAll();

    List<Restaurateur> findRange(int[] range);

    int count();
    
}
