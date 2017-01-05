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
@Table(name = "annonce")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Annonce.findAll", query = "SELECT a FROM Annonce a"),
    @NamedQuery(name = "Annonce.findByIdannonce", query = "SELECT a FROM Annonce a WHERE a.idannonce = :idannonce"),
    @NamedQuery(name = "Annonce.findByRestaurateur", query = "SELECT a FROM Annonce a WHERE a.restaurateur = :restaurateur"),
    @NamedQuery(name = "Annonce.findByRestaurant", query = "SELECT a FROM Annonce a WHERE a.restaurant = :restaurant"),
    @NamedQuery(name = "Annonce.findByIdmenu", query = "SELECT a FROM Annonce a WHERE a.idmenu = :idmenu"),
    @NamedQuery(name = "Annonce.findByPlagedispo", query = "SELECT a FROM Annonce a WHERE a.plagedispo = :plagedispo"),
    @NamedQuery(name = "Annonce.findByNbreplacedispo", query = "SELECT a FROM Annonce a WHERE a.nbreplacedispo = :nbreplacedispo"),
    @NamedQuery(name = "Annonce.findByDatededispo", query = "SELECT a FROM Annonce a WHERE a.datededispo = :datededispo"),
    @NamedQuery(name = "Annonce.findByReduction", query = "SELECT a FROM Annonce a WHERE a.reduction = :reduction"),
    @NamedQuery(name = "Annonce.findByPourcreduction", query = "SELECT a FROM Annonce a WHERE a.pourcreduction = :pourcreduction"),
    @NamedQuery(name = "Annonce.findByIdtelephone", query = "SELECT a FROM Annonce a WHERE a.idtelephone = :idtelephone"),
    @NamedQuery(name = "Annonce.findByIdemail", query = "SELECT a FROM Annonce a WHERE a.idemail = :idemail")})
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
    @Column(name = "idmenu")
    private Short idmenu;
    @Size(max = 45)
    @Column(name = "plagedispo")
    private String plagedispo;
    @Column(name = "nbreplacedispo")
    private Short nbreplacedispo;
    @Size(max = 45)
    @Column(name = "datededispo")
    private String datededispo;
    @Size(max = 45)
    @Column(name = "reduction")
    private String reduction;
    @Size(max = 45)
    @Column(name = "pourcreduction")
    private String pourcreduction;
    @Column(name = "idtelephone")
    private Short idtelephone;
    @Column(name = "idemail")
    private Short idemail;

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

    public Short getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Short idmenu) {
        this.idmenu = idmenu;
    }

    public String getPlagedispo() {
        return plagedispo;
    }

    public void setPlagedispo(String plagedispo) {
        this.plagedispo = plagedispo;
    }

    public Short getNbreplacedispo() {
        return nbreplacedispo;
    }

    public void setNbreplacedispo(Short nbreplacedispo) {
        this.nbreplacedispo = nbreplacedispo;
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

    public Short getIdtelephone() {
        return idtelephone;
    }

    public void setIdtelephone(Short idtelephone) {
        this.idtelephone = idtelephone;
    }

    public Short getIdemail() {
        return idemail;
    }

    public void setIdemail(Short idemail) {
        this.idemail = idemail;
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
