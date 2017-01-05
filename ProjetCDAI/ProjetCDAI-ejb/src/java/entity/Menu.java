/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author izilife
 */
@Entity
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
<<<<<<< HEAD
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m")
    , @NamedQuery(name = "Menu.findByIdmenu", query = "SELECT m FROM Menu m WHERE m.idmenu = :idmenu")
    , @NamedQuery(name = "Menu.findByPrix", query = "SELECT m FROM Menu m WHERE m.prix = :prix")
    , @NamedQuery(name = "Menu.findByLibelle", query = "SELECT m FROM Menu m WHERE m.libelle = :libelle")})
=======
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByIdmenu", query = "SELECT m FROM Menu m WHERE m.idmenu = :idmenu"),
    @NamedQuery(name = "Menu.findByPrix", query = "SELECT m FROM Menu m WHERE m.prix = :prix"),
    @NamedQuery(name = "Menu.findByLibelle", query = "SELECT m FROM Menu m WHERE m.libelle = :libelle")})
>>>>>>> 1021a2915c99e3dedea954c0c3ee0a92147bf3d0
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmenu")
    private Short idmenu;
    @Column(name = "prix")
    private Short prix;
    @Size(max = 45)
    @Column(name = "libelle")
    private String libelle;

    public Menu() {
    }

    public Menu(Short idmenu) {
        this.idmenu = idmenu;
    }

    public Short getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Short idmenu) {
        this.idmenu = idmenu;
    }

    public Short getPrix() {
        return prix;
    }

    public void setPrix(Short prix) {
        this.prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmenu != null ? idmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idmenu == null && other.idmenu != null) || (this.idmenu != null && !this.idmenu.equals(other.idmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Menu[ idmenu=" + idmenu + " ]";
    }
    
}
