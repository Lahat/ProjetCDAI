/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lahat
 */
@Entity
@Table(name = "Reservation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r")
    , @NamedQuery(name = "Reservation.findByIdReservation", query = "SELECT r FROM Reservation r WHERE r.idReservation = :idReservation")
    , @NamedQuery(name = "Reservation.findByDate", query = "SELECT r FROM Reservation r WHERE r.date = :date")
    , @NamedQuery(name = "Reservation.findByHeureFin", query = "SELECT r FROM Reservation r WHERE r.heureFin = :heureFin")
    , @NamedQuery(name = "Reservation.findByHeureDebut", query = "SELECT r FROM Reservation r WHERE r.heureDebut = :heureDebut")
    , @NamedQuery(name = "Reservation.findByNbrePersonne", query = "SELECT r FROM Reservation r WHERE r.nbrePersonne = :nbrePersonne")
    , @NamedQuery(name = "Reservation.findByIdClient", query = "SELECT r FROM Reservation r WHERE r.idClient = :idClient")})
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReservation")
    private Integer idReservation;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 2147483647)
    @Column(name = "heureFin")
    private String heureFin;
    @Size(max = 2147483647)
    @Column(name = "heureDebut")
    private String heureDebut;
    @Column(name = "nbrePersonne")
    private Integer nbrePersonne;
    @Basic(optional = false)
    @Column(name = "idClient")
    private int idClient;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRestaurant")
    private Collection<Reservation> reservationCollection;
    @JoinColumn(name = "idRestaurant", referencedColumnName = "idReservation")
    @ManyToOne(optional = false)
    private Reservation idRestaurant;

    public Reservation() {
    }

    public Reservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Reservation(Integer idReservation, int idClient) {
        this.idReservation = idReservation;
        this.idClient = idClient;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Integer getNbrePersonne() {
        return nbrePersonne;
    }

    public void setNbrePersonne(Integer nbrePersonne) {
        this.nbrePersonne = nbrePersonne;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @XmlTransient
    public Collection<Reservation> getReservationCollection() {
        return reservationCollection;
    }

    public void setReservationCollection(Collection<Reservation> reservationCollection) {
        this.reservationCollection = reservationCollection;
    }

    public Reservation getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Reservation idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReservation != null ? idReservation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.idReservation == null && other.idReservation != null) || (this.idReservation != null && !this.idReservation.equals(other.idReservation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Reservation[ idReservation=" + idReservation + " ]";
    }
    
}
