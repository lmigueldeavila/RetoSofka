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
@Table(name = "jugador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j")
    , @NamedQuery(name = "Jugador.findByIdjugador", query = "SELECT j FROM Jugador j WHERE j.idjugador = :idjugador")
    , @NamedQuery(name = "Jugador.findByNombreJugador", query = "SELECT j FROM Jugador j WHERE j.nombreJugador = :nombreJugador")
    , @NamedQuery(name = "Jugador.findByAcumulado", query = "SELECT j FROM Jugador j WHERE j.acumulado = :acumulado")
    , @NamedQuery(name = "Jugador.findByRondaAlcanzada", query = "SELECT j FROM Jugador j WHERE j.rondaAlcanzada = :rondaAlcanzada")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjugador")
    private Integer idjugador;
    @Basic(optional = false)
    @Column(name = "nombreJugador")
    private String nombreJugador;
    @Basic(optional = false)
    @Column(name = "acumulado")
    private int acumulado;
    @Basic(optional = false)
    @Column(name = "rondaAlcanzada")
    private int rondaAlcanzada;

    public Jugador() {
    }

    public Jugador(Integer idjugador) {
        this.idjugador = idjugador;
    }

    public Jugador(Integer idjugador, String nombreJugador, int acumulado, int rondaAlcanzada) {
        this.idjugador = idjugador;
        this.nombreJugador = nombreJugador;
        this.acumulado = acumulado;
        this.rondaAlcanzada = rondaAlcanzada;
    }

    public Integer getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(Integer idjugador) {
        this.idjugador = idjugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public int getRondaAlcanzada() {
        return rondaAlcanzada;
    }

    public void setRondaAlcanzada(int rondaAlcanzada) {
        this.rondaAlcanzada = rondaAlcanzada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjugador != null ? idjugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.idjugador == null && other.idjugador != null) || (this.idjugador != null && !this.idjugador.equals(other.idjugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Jugador[ idjugador=" + idjugador + " ]";
    }
    
}
