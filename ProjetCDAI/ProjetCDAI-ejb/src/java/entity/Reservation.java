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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lahat
 */
@Entity
@Table(name = "reservation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r")
    , @NamedQuery(name = "Reservation.findByIdreservation", query = "SELECT r FROM Reservation r WHERE r.idreservation = :idreservation")
    , @NamedQuery(name = "Reservation.findByDate", query = "SELECT r FROM Reservation r WHERE r.date = :date")
    , @NamedQuery(name = "Reservation.findByHeuredebut", query = "SELECT r FROM Reservation r WHERE r.heuredebut = :heuredebut")
    , @NamedQuery(name = "Reservation.findByHeurefin", query = "SELECT r FROM Reservation r WHERE r.heurefin = :heurefin")
    , @NamedQuery(name = "Reservation.findByNbrepersonnes", query = "SELECT r FROM Reservation r WHERE r.nbrepersonnes = :nbrepersonnes")
    , @NamedQuery(name = "Reservation.findByIdrestaurant", query = "SELECT r FROM Reservation r WHERE r.idrestaurant = :idrestaurant")
    , @NamedQuery(name = "Reservation.findByIdclient", query = "SELECT r FROM Reservation r WHERE r.idclient = :idclient")})
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idreservation")
    private Short idreservation;
    @Size(max = 45)
    @Column(name = "date")
    private String date;
    @Size(max = 45)
    @Column(name = "heuredebut")
    private String heuredebut;
    @Size(max = 45)
    @Column(name = "heurefin")
    private String heurefin;
    @Column(name = "nbrepersonnes")
    private Short nbrepersonnes;
    @Column(name = "idrestaurant")
    private Short idrestaurant;
    @Column(name = "idclient")
    @Temporal(TemporalType.TIME)
    private Date idclient;

    public Reservation() {
    }

    public Reservation(Short idreservation) {
        this.idreservation = idreservation;
    }

    public Short getIdreservation() {
        return idreservation;
    }

    public void setIdreservation(Short idreservation) {
        this.idreservation = idreservation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeuredebut() {
        return heuredebut;
    }

    public void setHeuredebut(String heuredebut) {
        this.heuredebut = heuredebut;
    }

    public String getHeurefin() {
        return heurefin;
    }

    public void setHeurefin(String heurefin) {
        this.heurefin = heurefin;
    }

    public Short getNbrepersonnes() {
        return nbrepersonnes;
    }

    public void setNbrepersonnes(Short nbrepersonnes) {
        this.nbrepersonnes = nbrepersonnes;
    }

    public Short getIdrestaurant() {
        return idrestaurant;
    }

    public void setIdrestaurant(Short idrestaurant) {
        this.idrestaurant = idrestaurant;
    }

    public Date getIdclient() {
        return idclient;
    }

    public void setIdclient(Date idclient) {
        this.idclient = idclient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservation != null ? idreservation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.idreservation == null && other.idreservation != null) || (this.idreservation != null && !this.idreservation.equals(other.idreservation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Reservation[ idreservation=" + idreservation + " ]";
    }
    
}
