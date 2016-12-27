/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lahat
 */
@Entity
@Table(name = "Annonce")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Annonce.findAll", query = "SELECT a FROM Annonce a")
    , @NamedQuery(name = "Annonce.findByRestaurant", query = "SELECT a FROM Annonce a WHERE a.restaurant = :restaurant")
    , @NamedQuery(name = "Annonce.findByPlageDispo", query = "SELECT a FROM Annonce a WHERE a.plageDispo = :plageDispo")
    , @NamedQuery(name = "Annonce.findByIdRestaurateur", query = "SELECT a FROM Annonce a WHERE a.idRestaurateur = :idRestaurateur")
    , @NamedQuery(name = "Annonce.findByNbrePlaceDispo", query = "SELECT a FROM Annonce a WHERE a.nbrePlaceDispo = :nbrePlaceDispo")
    , @NamedQuery(name = "Annonce.findByTelephone", query = "SELECT a FROM Annonce a WHERE a.telephone = :telephone")
    , @NamedQuery(name = "Annonce.findByEmail", query = "SELECT a FROM Annonce a WHERE a.email = :email")
    , @NamedQuery(name = "Annonce.findByDateDeDispo", query = "SELECT a FROM Annonce a WHERE a.dateDeDispo = :dateDeDispo")
    , @NamedQuery(name = "Annonce.findByReduction", query = "SELECT a FROM Annonce a WHERE a.reduction = :reduction")
    , @NamedQuery(name = "Annonce.findByPourcReduction", query = "SELECT a FROM Annonce a WHERE a.pourcReduction = :pourcReduction")})
public class Annonce implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "restaurant")
    private Character restaurant;
    @Column(name = "plageDispo")
    private Serializable plageDispo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRestaurateur")
    private Integer idRestaurateur;
    @Column(name = "nbrePlaceDispo")
    private Integer nbrePlaceDispo;
    @Column(name = "telephone")
    private Integer telephone;
    @Column(name = "email")
    private Character email;
    @Column(name = "dateDeDispo")
    @Temporal(TemporalType.DATE)
    private Date dateDeDispo;
    @Size(max = 2147483647)
    @Column(name = "reduction")
    private String reduction;
    @Size(max = 2147483647)
    @Column(name = "pourcReduction")
    private String pourcReduction;
    @JoinColumn(name = "idMenu", referencedColumnName = "idMenu")
    @ManyToOne(optional = false)
    private Menu idMenu;

    public Annonce() {
    }

    public Annonce(Integer idRestaurateur) {
        this.idRestaurateur = idRestaurateur;
    }

    public Character getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Character restaurant) {
        this.restaurant = restaurant;
    }

    public Serializable getPlageDispo() {
        return plageDispo;
    }

    public void setPlageDispo(Serializable plageDispo) {
        this.plageDispo = plageDispo;
    }

    public Integer getIdRestaurateur() {
        return idRestaurateur;
    }

    public void setIdRestaurateur(Integer idRestaurateur) {
        this.idRestaurateur = idRestaurateur;
    }

    public Integer getNbrePlaceDispo() {
        return nbrePlaceDispo;
    }

    public void setNbrePlaceDispo(Integer nbrePlaceDispo) {
        this.nbrePlaceDispo = nbrePlaceDispo;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Character getEmail() {
        return email;
    }

    public void setEmail(Character email) {
        this.email = email;
    }

    public Date getDateDeDispo() {
        return dateDeDispo;
    }

    public void setDateDeDispo(Date dateDeDispo) {
        this.dateDeDispo = dateDeDispo;
    }

    public String getReduction() {
        return reduction;
    }

    public void setReduction(String reduction) {
        this.reduction = reduction;
    }

    public String getPourcReduction() {
        return pourcReduction;
    }

    public void setPourcReduction(String pourcReduction) {
        this.pourcReduction = pourcReduction;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRestaurateur != null ? idRestaurateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Annonce)) {
            return false;
        }
        Annonce other = (Annonce) object;
        if ((this.idRestaurateur == null && other.idRestaurateur != null) || (this.idRestaurateur != null && !this.idRestaurateur.equals(other.idRestaurateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Annonce[ idRestaurateur=" + idRestaurateur + " ]";
    }
    
}
