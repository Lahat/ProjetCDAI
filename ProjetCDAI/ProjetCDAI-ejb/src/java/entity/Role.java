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
@Table(name = "Role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")
    , @NamedQuery(name = "Role.findByIdCodeRole", query = "SELECT r FROM Role r WHERE r.idCodeRole = :idCodeRole")
    , @NamedQuery(name = "Role.findByLibelleRole", query = "SELECT r FROM Role r WHERE r.libelleRole = :libelleRole")})
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCodeRole")
    private Integer idCodeRole;
    @Size(max = 2147483647)
    @Column(name = "libelleRole")
    private String libelleRole;

    public Role() {
    }

    public Role(Integer idCodeRole) {
        this.idCodeRole = idCodeRole;
    }

    public Integer getIdCodeRole() {
        return idCodeRole;
    }

    public void setIdCodeRole(Integer idCodeRole) {
        this.idCodeRole = idCodeRole;
    }

    public String getLibelleRole() {
        return libelleRole;
    }

    public void setLibelleRole(String libelleRole) {
        this.libelleRole = libelleRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCodeRole != null ? idCodeRole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Role)) {
            return false;
        }
        Role other = (Role) object;
        if ((this.idCodeRole == null && other.idCodeRole != null) || (this.idCodeRole != null && !this.idCodeRole.equals(other.idCodeRole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Role[ idCodeRole=" + idCodeRole + " ]";
    }
    
}
