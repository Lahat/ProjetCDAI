/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;
/**
 *
 * @author izilife
 */

@Local
public interface UserInterface {
    /**
     * To create a new user (client ou restaurateur) 
     */
    public void createUser(String name, String firstName, String phone, String address, String mail, String password, String profil);
}
