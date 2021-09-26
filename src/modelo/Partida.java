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
@Table(name = "partida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partida.findAll", query = "SELECT p FROM Partida p")
    , @NamedQuery(name = "Partida.findByIdpartida", query = "SELECT p FROM Partida p WHERE p.idpartida = :idpartida")
    , @NamedQuery(name = "Partida.findByNombreJugador", query = "SELECT p FROM Partida p WHERE p.nombreJugador = :nombreJugador")
    , @NamedQuery(name = "Partida.findByAcumulado", query = "SELECT p FROM Partida p WHERE p.acumulado = :acumulado")
    , @NamedQuery(name = "Partida.findByRondaAlcanzada", query = "SELECT p FROM Partida p WHERE p.rondaAlcanzada = :rondaAlcanzada")})
public class Partida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpartida")
    private Integer idpartida;
    @Basic(optional = false)
    @Column(name = "nombreJugador")
    private String nombreJugador;
    @Basic(optional = false)
    @Column(name = "acumulado")
    private int acumulado;
    @Basic(optional = false)
    @Column(name = "rondaAlcanzada")
    private int rondaAlcanzada;

    public Partida() {
    }

    public Partida(Integer idpartida) {
        this.idpartida = idpartida;
    }

    public Partida(Integer idpartida, String nombreJugador, int acumulado, int rondaAlcanzada) {
        this.idpartida = idpartida;
        this.nombreJugador = nombreJugador;
        this.acumulado = acumulado;
        this.rondaAlcanzada = rondaAlcanzada;
    }

    public Integer getIdpartida() {
        return idpartida;
    }

    public void setIdpartida(Integer idpartida) {
        this.idpartida = idpartida;
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
        hash += (idpartida != null ? idpartida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partida)) {
            return false;
        }
        Partida other = (Partida) object;
        if ((this.idpartida == null && other.idpartida != null) || (this.idpartida != null && !this.idpartida.equals(other.idpartida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Partida[ idpartida=" + idpartida + " ]";
    }
    
}
