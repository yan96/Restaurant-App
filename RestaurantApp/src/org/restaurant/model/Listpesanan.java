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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "listpesanan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Listpesanan.findAll", query = "SELECT l FROM Listpesanan l"),
    @NamedQuery(name = "Listpesanan.findByNomorMeja", query = "SELECT l FROM Listpesanan l WHERE l.nomorMeja = :nomorMeja"),
    @NamedQuery(name = "Listpesanan.findByNamaMenu", query = "SELECT l FROM Listpesanan l WHERE l.namaMenu = :namaMenu"),
    @NamedQuery(name = "Listpesanan.findByHargaMenu", query = "SELECT l FROM Listpesanan l WHERE l.hargaMenu = :hargaMenu")})
public class Listpesanan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nomorMeja")
    private Integer nomorMeja;
    @Column(name = "namaMenu")
    private String namaMenu;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "hargaMenu")
    private Double hargaMenu;

    public Listpesanan() {
    }

    public Listpesanan(Integer nomorMeja) {
        this.nomorMeja = nomorMeja;
    }

    public Integer getNomorMeja() {
        return nomorMeja;
    }

    public void setNomorMeja(Integer nomorMeja) {
        this.nomorMeja = nomorMeja;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public Double getHargaMenu() {
        return hargaMenu;
    }

    public void setHargaMenu(Double hargaMenu) {
        this.hargaMenu = hargaMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomorMeja != null ? nomorMeja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listpesanan)) {
            return false;
        }
        Listpesanan other = (Listpesanan) object;
        if ((this.nomorMeja == null && other.nomorMeja != null) || (this.nomorMeja != null && !this.nomorMeja.equals(other.nomorMeja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.restaurant.view.Listpesanan[ nomorMeja=" + nomorMeja + " ]";
    }
    
}
