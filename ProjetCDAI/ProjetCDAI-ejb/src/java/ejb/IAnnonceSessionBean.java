/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Annonce;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lahat
 */
@Local
public interface IAnnonceSessionBean {

    void create(Annonce annonce);

    void edit(Annonce annonce);

    void remove(Annonce annonce);

    Annonce find(Object id);

    List<Annonce> findAll();

    List<Annonce> findRange(int[] range);

    int count();
    
    public void creerAnnonce(String restaurateur, String restaurant, String plagedispo, String nbreplacedispo, String datededispo, String reduction, String pourcreduction);
    
}
