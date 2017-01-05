/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import ejb.IUtilisateurSessionBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import entity.*;

/**
 *
 * @author Lahat
 */
@Named(value = "inscriptionControler")
@SessionScoped
public class InscriptionControler implements Serializable {

    @EJB
    private IUtilisateurSessionBean utilisateurSessionBean;
    private Utilisateur u = new Utilisateur();

    public Utilisateur getU() {
        return u;
    }

    public void setU(Utilisateur u) {
        this.u = u;
    }
   
    
    public InscriptionControler() {
    }
    public List<Utilisateur> findAll(){
        return this.utilisateurSessionBean.findAll();
    }
    
    public String ajouterUtilisateur(){
        this.utilisateurSessionBean.create(this.u);
        return "index";
    }
    
}
