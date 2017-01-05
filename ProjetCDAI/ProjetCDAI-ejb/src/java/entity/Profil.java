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
@Table(name = "profil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profil.findAll", query = "SELECT p FROM Profil p")
    , @NamedQuery(name = "Profil.findByIdprofil", query = "SELECT p FROM Profil p WHERE p.idprofil = :idprofil")
    , @NamedQuery(name = "Profil.findByProfil", query = "SELECT p FROM Profil p WHERE p.profil = :profil")
    , @NamedQuery(name = "Profil.findByCodelibellerole", query = "SELECT p FROM Profil p WHERE p.codelibellerole = :codelibellerole")})
public class Profil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idprofil")
    private Short idprofil;
    @Size(max = 45)
    @Column(name = "profil")
    private String profil;
    @Size(max = 45)
    @Column(name = "codelibellerole")
    private String codelibellerole;

    public Profil() {
    }

    public Profil(Short idprofil) {
        this.idprofil = idprofil;
    }

    public Short getIdprofil() {
        return idprofil;
    }

    public void setIdprofil(Short idprofil) {
        this.idprofil = idprofil;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getCodelibellerole() {
        return codelibellerole;
    }

    public void setCodelibellerole(String codelibellerole) {
        this.codelibellerole = codelibellerole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprofil != null ? idprofil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profil)) {
            return false;
        }
        Profil other = (Profil) object;
        if ((this.idprofil == null && other.idprofil != null) || (this.idprofil != null && !this.idprofil.equals(other.idprofil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Profil[ idprofil=" + idprofil + " ]";
    }
    
}
