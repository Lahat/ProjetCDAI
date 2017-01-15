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
 * @author Lahat
 */
@Entity
@Table(name = "restaurant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restaurant.findAll", query = "SELECT r FROM Restaurant r")
    , @NamedQuery(name = "Restaurant.findByIdrestaurant", query = "SELECT r FROM Restaurant r WHERE r.idrestaurant = :idrestaurant")
    , @NamedQuery(name = "Restaurant.findByNom", query = "SELECT r FROM Restaurant r WHERE r.nom = :nom")
    , @NamedQuery(name = "Restaurant.findByAdresse", query = "SELECT r FROM Restaurant r WHERE r.adresse = :adresse")
    , @NamedQuery(name = "Restaurant.findByTelephone", query = "SELECT r FROM Restaurant r WHERE r.telephone = :telephone")
    , @NamedQuery(name = "Restaurant.findByEmail", query = "SELECT r FROM Restaurant r WHERE r.email = :email")
    , @NamedQuery(name = "Restaurant.findByCategorie", query = "SELECT r FROM Restaurant r WHERE r.categorie = :categorie")
    , @NamedQuery(name = "Restaurant.findByVille", query = "SELECT r FROM Restaurant r WHERE r.ville = :ville")})
public class Restaurant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrestaurant")
    private Short idrestaurant;
    @Size(max = 45)
    @Column(name = "nom")
    private String nom;
    @Size(max = 45)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 45)
    @Column(name = "telephone")
    private String telephone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "categorie")
    private String categorie;
    @Size(max = 45)
    @Column(name = "ville")
    private String ville;

    public Restaurant() {
    }

    public Restaurant(Short idrestaurant) {
        this.idrestaurant = idrestaurant;
    }

    public Short getIdrestaurant() {
        return idrestaurant;
    }

    public void setIdrestaurant(Short idrestaurant) {
        this.idrestaurant = idrestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrestaurant != null ? idrestaurant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) object;
        if ((this.idrestaurant == null && other.idrestaurant != null) || (this.idrestaurant != null && !this.idrestaurant.equals(other.idrestaurant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Restaurant[ idrestaurant=" + idrestaurant + " ]";
    }
    
}
