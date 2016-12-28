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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lahat
 */
@Entity
@Table(name = "Inscription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscription.findAll", query = "SELECT i FROM Inscription i")
    , @NamedQuery(name = "Inscription.findByIdInscription", query = "SELECT i FROM Inscription i WHERE i.idInscription = :idInscription")
    , @NamedQuery(name = "Inscription.findByNom", query = "SELECT i FROM Inscription i WHERE i.nom = :nom")
    , @NamedQuery(name = "Inscription.findByPrenom", query = "SELECT i FROM Inscription i WHERE i.prenom = :prenom")
    , @NamedQuery(name = "Inscription.findByAdresse", query = "SELECT i FROM Inscription i WHERE i.adresse = :adresse")
    , @NamedQuery(name = "Inscription.findByLogin", query = "SELECT i FROM Inscription i WHERE i.login = :login")
    , @NamedQuery(name = "Inscription.findByMdp", query = "SELECT i FROM Inscription i WHERE i.mdp = :mdp")
    , @NamedQuery(name = "Inscription.findByProfil", query = "SELECT i FROM Inscription i WHERE i.profil = :profil")})
public class Inscription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idInscription")
    private Integer idInscription;
    @Size(max = 2147483647)
    @Column(name = "nom")
    private String nom;
    @Size(max = 2147483647)
    @Column(name = "prenom")
    private String prenom;
    @Size(max = 2147483647)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 50)
    @Column(name = "login")
    private String login;
    @Size(max = 50)
    @Column(name = "mdp")
    private String mdp;
    @Size(max = 50)
    @Column(name = "Profil")
    private String profil;

    public Inscription() {
    }

    public Inscription(Integer idInscription) {
        this.idInscription = idInscription;
    }

    public Integer getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(Integer idInscription) {
        this.idInscription = idInscription;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInscription != null ? idInscription.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscription)) {
            return false;
        }
        Inscription other = (Inscription) object;
        if ((this.idInscription == null && other.idInscription != null) || (this.idInscription != null && !this.idInscription.equals(other.idInscription))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Inscription[ idInscription=" + idInscription + " ]";
    }
    
}
