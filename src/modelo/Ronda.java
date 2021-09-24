/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
 * @author lmdem
 */
@Entity
@Table(name = "ronda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ronda.findAll", query = "SELECT r FROM Ronda r")
    , @NamedQuery(name = "Ronda.findByIdronda", query = "SELECT r FROM Ronda r WHERE r.idronda = :idronda")
    , @NamedQuery(name = "Ronda.findByIdpregunta", query = "SELECT r FROM Ronda r WHERE r.idpregunta = :idpregunta")
    , @NamedQuery(name = "Ronda.findByPuntuacion", query = "SELECT r FROM Ronda r WHERE r.puntuacion = :puntuacion")})
public class Ronda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idronda")
    private Integer idronda;
    @Basic(optional = false)
    @Column(name = "idpregunta")
    private int idpregunta;
    @Basic(optional = false)
    @Column(name = "puntuacion")
    private int puntuacion;

    public Ronda() {
    }

    public Ronda(Integer idronda) {
        this.idronda = idronda;
    }

    public Ronda(Integer idronda, int idpregunta, int puntuacion) {
        this.idronda = idronda;
        this.idpregunta = idpregunta;
        this.puntuacion = puntuacion;
    }

    public Integer getIdronda() {
        return idronda;
    }

    public void setIdronda(Integer idronda) {
        this.idronda = idronda;
    }

    public int getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idronda != null ? idronda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ronda)) {
            return false;
        }
        Ronda other = (Ronda) object;
        if ((this.idronda == null && other.idronda != null) || (this.idronda != null && !this.idronda.equals(other.idronda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Ronda[ idronda=" + idronda + " ]";
    }
    
}
