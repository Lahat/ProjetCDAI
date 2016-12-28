/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Restaurant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lahat
 */
@Local
public interface IRestaurantSessionBeanLocal {

    void create(Restaurant restaurant);

    void edit(Restaurant restaurant);

    void remove(Restaurant restaurant);

    Restaurant find(Object id);

    List<Restaurant> findAll();

    List<Restaurant> findRange(int[] range);

    int count();
    
}
