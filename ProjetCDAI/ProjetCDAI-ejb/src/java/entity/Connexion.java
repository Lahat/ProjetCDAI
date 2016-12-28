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
@Table(name = "Connexion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Connexion.findAll", query = "SELECT c FROM Connexion c")
    , @NamedQuery(name = "Connexion.findByIdConnexion", query = "SELECT c FROM Connexion c WHERE c.idConnexion = :idConnexion")
    , @NamedQuery(name = "Connexion.findByLogin", query = "SELECT c FROM Connexion c WHERE c.login = :login")
    , @NamedQuery(name = "Connexion.findByMdp", query = "SELECT c FROM Connexion c WHERE c.mdp = :mdp")})
public class Connexion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idConnexion")
    private Integer idConnexion;
    @Size(max = 50)
    @Column(name = "login")
    private String login;
    @Size(max = 50)
    @Column(name = "mdp")
    private String mdp;

    public Connexion() {
    }

    public Connexion(Integer idConnexion) {
        this.idConnexion = idConnexion;
    }

    public Integer getIdConnexion() {
        return idConnexion;
    }

    public void setIdConnexion(Integer idConnexion) {
        this.idConnexion = idConnexion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConnexion != null ? idConnexion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Connexion)) {
            return false;
        }
        Connexion other = (Connexion) object;
        if ((this.idConnexion == null && other.idConnexion != null) || (this.idConnexion != null && !this.idConnexion.equals(other.idConnexion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Connexion[ idConnexion=" + idConnexion + " ]";
    }
    
}
