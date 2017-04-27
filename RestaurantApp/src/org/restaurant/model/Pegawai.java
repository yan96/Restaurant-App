/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "pegawai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pegawai.findAll", query = "SELECT p FROM Pegawai p"),
    @NamedQuery(name = "Pegawai.findById", query = "SELECT p FROM Pegawai p WHERE p.id = :id"),
    @NamedQuery(name = "Pegawai.findByNamaPegawai", query = "SELECT p FROM Pegawai p WHERE p.namaPegawai = :namaPegawai"),
    @NamedQuery(name = "Pegawai.findByTipePekerjaan", query = "SELECT p FROM Pegawai p WHERE p.tipePekerjaan = :tipePekerjaan"),
})


public class Pegawai implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "namaPegawai")
    private String namaPegawai;
    @Column(name = "tipePekerjaan")
    private String tipePekerjaan;

    public Pegawai() {
    }
    
    public Pegawai(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getTipePekerjaan() {
        return tipePekerjaan;
    }

    public void setTipePekerjaan(String tipePekerjaan) {
        this.tipePekerjaan = tipePekerjaan;
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
        if (!(object instanceof Pegawai)) {
            return false;
        }
        Pegawai other = (Pegawai) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.restaurant.view.Pegawai[ id=" + id + " ]";
    }
    
}
