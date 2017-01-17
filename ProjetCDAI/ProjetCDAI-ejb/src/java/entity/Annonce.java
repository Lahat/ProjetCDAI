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
@Table(name = "annonce")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Annonce.findAll", query = "SELECT a FROM Annonce a")
    , @NamedQuery(name = "Annonce.findByIdannonce", query = "SELECT a FROM Annonce a WHERE a.idannonce = :idannonce")
    , @NamedQuery(name = "Annonce.findByRestaurateur", query = "SELECT a FROM Annonce a WHERE a.restaurateur = :restaurateur")
    , @NamedQuery(name = "Annonce.findByRestaurant", query = "SELECT a FROM Annonce a WHERE a.restaurant = :restaurant")
    , @NamedQuery(name = "Annonce.findByPlagedispo", query = "SELECT a FROM Annonce a WHERE a.plagedispo = :plagedispo")
    , @NamedQuery(name = "Annonce.findByDatededispo", query = "SELECT a FROM Annonce a WHERE a.datededispo = :datededispo")
    , @NamedQuery(name = "Annonce.findByReduction", query = "SELECT a FROM Annonce a WHERE a.reduction = :reduction")
    , @NamedQuery(name = "Annonce.findByPourcreduction", query = "SELECT a FROM Annonce a WHERE a.pourcreduction = :pourcreduction")
    , @NamedQuery(name = "Annonce.findByNbreplacedispo", query = "SELECT a FROM Annonce a WHERE a.nbreplacedispo = :nbreplacedispo")})
public class Annonce implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idannonce")
    private Short idannonce;
    @Size(max = 45)
    @Column(name = "restaurateur")
    private String restaurateur;
    @Size(max = 45)
    @Column(name = "restaurant")
    private String restaurant;
    @Size(max = 45)
    @Column(name = "plagedispo")
    private String plagedispo;
    @Size(max = 45)
    @Column(name = "datededispo")
    private String datededispo;
    @Size(max = 45)
    @Column(name = "reduction")
    private String reduction;
    @Size(max = 45)
    @Column(name = "pourcreduction")
    private String pourcreduction;
    @Column(name = "nbreplacedispo")
    private Serializable nbreplacedispo;

    public Annonce() {
    }

    public Annonce(Short idannonce) {
        this.idannonce = idannonce;
    }

    public Short getIdannonce() {
        return idannonce;
    }

    public void setIdannonce(Short idannonce) {
        this.idannonce = idannonce;
    }

    public String getRestaurateur() {
        return restaurateur;
    }

    public void setRestaurateur(String restaurateur) {
        this.restaurateur = restaurateur;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getPlagedispo() {
        return plagedispo;
    }

    public void setPlagedispo(String plagedispo) {
        this.plagedispo = plagedispo;
    }

    public String getDatededispo() {
        return datededispo;
    }

    public void setDatededispo(String datededispo) {
        this.datededispo = datededispo;
    }

    public String getReduction() {
        return reduction;
    }

    public void setReduction(String reduction) {
        this.reduction = reduction;
    }

    public String getPourcreduction() {
        return pourcreduction;
    }

    public void setPourcreduction(String pourcreduction) {
        this.pourcreduction = pourcreduction;
    }

    public Serializable getNbreplacedispo() {
        return nbreplacedispo;
    }

    public void setNbreplacedispo(Serializable nbreplacedispo) {
        this.nbreplacedispo = nbreplacedispo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idannonce != null ? idannonce.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Annonce)) {
            return false;
        }
        Annonce other = (Annonce) object;
        if ((this.idannonce == null && other.idannonce != null) || (this.idannonce != null && !this.idannonce.equals(other.idannonce))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Annonce[ idannonce=" + idannonce + " ]";
    }
    
}
