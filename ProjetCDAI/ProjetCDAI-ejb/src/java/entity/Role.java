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
@Table(name = "role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")
    , @NamedQuery(name = "Role.findByIdrole", query = "SELECT r FROM Role r WHERE r.idrole = :idrole")
    , @NamedQuery(name = "Role.findByCoderole", query = "SELECT r FROM Role r WHERE r.coderole = :coderole")
    , @NamedQuery(name = "Role.findByLibellerole", query = "SELECT r FROM Role r WHERE r.libellerole = :libellerole")})
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrole")
    private Short idrole;
    @Size(max = 45)
    @Column(name = "coderole")
    private String coderole;
    @Size(max = 45)
    @Column(name = "libellerole")
    private String libellerole;

    public Role() {
    }

    public Role(Short idrole) {
        this.idrole = idrole;
    }

    public Short getIdrole() {
        return idrole;
    }

    public void setIdrole(Short idrole) {
        this.idrole = idrole;
    }

    public String getCoderole() {
        return coderole;
    }

    public void setCoderole(String coderole) {
        this.coderole = coderole;
    }

    public String getLibellerole() {
        return libellerole;
    }

    public void setLibellerole(String libellerole) {
        this.libellerole = libellerole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrole != null ? idrole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Role)) {
            return false;
        }
        Role other = (Role) object;
        if ((this.idrole == null && other.idrole != null) || (this.idrole != null && !this.idrole.equals(other.idrole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Role[ idrole=" + idrole + " ]";
    }
    
}
