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
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lmdem
 */
@Entity
@Table(name = "pregunta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregunta.findAll", query = "SELECT p FROM Pregunta p")
    , @NamedQuery(name = "Pregunta.findByIdpregunta", query = "SELECT p FROM Pregunta p WHERE p.idpregunta = :idpregunta")
    , @NamedQuery(name = "Pregunta.findByCategoria", query = "SELECT p FROM Pregunta p WHERE p.categoria = :categoria")
    , @NamedQuery(name = "Pregunta.findByRespuesta", query = "SELECT p FROM Pregunta p WHERE p.respuesta = :respuesta")})
public class Pregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpregunta")
    private Integer idpregunta;
    @Basic(optional = false)
    @Lob
    @Column(name = "preguntaText")
    private String preguntaText;
    @Basic(optional = false)
    @Column(name = "categoria")
    private int categoria;
    @Basic(optional = false)
    @Lob
    @Column(name = "opcion1")
    private String opcion1;
    @Basic(optional = false)
    @Lob
    @Column(name = "opcion2")
    private String opcion2;
    @Basic(optional = false)
    @Lob
    @Column(name = "opcion3")
    private String opcion3;
    @Basic(optional = false)
    @Lob
    @Column(name = "opcion4")
    private String opcion4;
    @Basic(optional = false)
    @Column(name = "respuesta")
    private int respuesta;

    public Pregunta() {
    }

    public Pregunta(Integer idpregunta) {
        this.idpregunta = idpregunta;
    }

    public Pregunta(Integer idpregunta, String preguntaText, int categoria, String opcion1, String opcion2, String opcion3, String opcion4, int respuesta) {
        this.idpregunta = idpregunta;
        this.preguntaText = preguntaText;
        this.categoria = categoria;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.respuesta = respuesta;
    }

    public Integer getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(Integer idpregunta) {
        this.idpregunta = idpregunta;
    }

    public String getPreguntaText() {
        return preguntaText;
    }

    public void setPreguntaText(String preguntaText) {
        this.preguntaText = preguntaText;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpregunta != null ? idpregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.idpregunta == null && other.idpregunta != null) || (this.idpregunta != null && !this.idpregunta.equals(other.idpregunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pregunta[ idpregunta=" + idpregunta + " ]";
    }
    
}
