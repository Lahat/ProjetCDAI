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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lahat
 */
@Entity
@Table(name = "Restaurateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restaurateur.findAll", query = "SELECT r FROM Restaurateur r")
    , @NamedQuery(name = "Restaurateur.findByIdRestaurateur", query = "SELECT r FROM Restaurateur r WHERE r.idRestaurateur = :idRestaurateur")})
public class Restaurateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRestaurateur")
    private Integer idRestaurateur;

    public Restaurateur() {
    }

    public Restaurateur(Integer idRestaurateur) {
        this.idRestaurateur = idRestaurateur;
    }

    public Integer getIdRestaurateur() {
        return idRestaurateur;
    }

    public void setIdRestaurateur(Integer idRestaurateur) {
        this.idRestaurateur = idRestaurateur;
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
        if (!(object instanceof Restaurateur)) {
            return false;
        }
        Restaurateur other = (Restaurateur) object;
        if ((this.idRestaurateur == null && other.idRestaurateur != null) || (this.idRestaurateur != null && !this.idRestaurateur.equals(other.idRestaurateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Restaurateur[ idRestaurateur=" + idRestaurateur + " ]";
    }
    
}
