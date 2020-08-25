/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restful.entidades;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "UCM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ucm.findAll", query = "SELECT u FROM Ucm u")
    , @NamedQuery(name = "Ucm.findById", query = "SELECT u FROM Ucm u WHERE u.id = :id")
    , @NamedQuery(name = "Ucm.findByTitulo", query = "SELECT u FROM Ucm u WHERE u.titulo = :titulo")
    , @NamedQuery(name = "Ucm.findByGenero", query = "SELECT u FROM Ucm u WHERE u.genero = :genero")
    , @NamedQuery(name = "Ucm.findByIdioma", query = "SELECT u FROM Ucm u WHERE u.idioma = :idioma")
    , @NamedQuery(name = "Ucm.findByDuracion", query = "SELECT u FROM Ucm u WHERE u.duracion = :duracion")
    , @NamedQuery(name = "Ucm.findByCalificacion", query = "SELECT u FROM Ucm u WHERE u.calificacion = :calificacion")
    , @NamedQuery(name = "Ucm.findByResumen", query = "SELECT u FROM Ucm u WHERE u.resumen = :resumen")
    , @NamedQuery(name = "Ucm.findByAnioProduccion", query = "SELECT u FROM Ucm u WHERE u.anioProduccion = :anioProduccion")
    , @NamedQuery(name = "Ucm.findByFormato", query = "SELECT u FROM Ucm u WHERE u.formato = :formato")
    , @NamedQuery(name = "Ucm.findByDirector", query = "SELECT u FROM Ucm u WHERE u.director = :director")
    , @NamedQuery(name = "Ucm.findByClasificacion", query = "SELECT u FROM Ucm u WHERE u.clasificacion = :clasificacion")})
public class Ucm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "idioma")
    private String idioma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracion")
    private int duracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "calificacion")
    private String calificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "resumen")
    private String resumen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio_produccion")
    private int anioProduccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "formato")
    private String formato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "director")
    private String director;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "clasificacion")
    private String clasificacion;

    public Ucm() {
    }

    public Ucm(Integer id) {
        this.id = id;
    }

    public Ucm(Integer id, String titulo, String genero, String idioma, int duracion, String calificacion, String resumen, int anioProduccion, String formato, String director, String clasificacion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.idioma = idioma;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.resumen = resumen;
        this.anioProduccion = anioProduccion;
        this.formato = formato;
        this.director = director;
        this.clasificacion = clasificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getAnioProduccion() {
        return anioProduccion;
    }

    public void setAnioProduccion(int anioProduccion) {
        this.anioProduccion = anioProduccion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ucm)) {
            return false;
        }
        Ucm other = (Ucm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restful.entidades.Ucm[ id=" + id + " ]";
    }
    
}
