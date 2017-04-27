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
@Table(name = "transaksi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaksi.findAll", query = "SELECT t FROM Transaksi t"),
    @NamedQuery(name = "Transaksi.findByIdTransaksi", query = "SELECT t FROM Transaksi t WHERE t.idTransaksi = :idTransaksi"),
    @NamedQuery(name = "Transaksi.findByNomorMeja", query = "SELECT t FROM Transaksi t WHERE t.nomorMeja = :nomorMeja"),
    @NamedQuery(name = "Transaksi.findByStatusTransaksi", query = "SELECT t FROM Transaksi t WHERE t.statusTransaksi = :statusTransaksi")})
public class Transaksi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTransaksi")
    private Integer idTransaksi;
    @Column(name = "nomorMeja")
    private Integer nomorMeja;
    @Column(name = "statusTransaksi")
    private String statusTransaksi;

    public Transaksi() {
    }

    public Transaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Integer getNomorMeja() {
        return nomorMeja;
    }

    public void setNomorMeja(Integer nomorMeja) {
        this.nomorMeja = nomorMeja;
    }

    public String getStatusTransaksi() {
        return statusTransaksi;
    }

    public void setStatusTransaksi(String statusTransaksi) {
        this.statusTransaksi = statusTransaksi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaksi != null ? idTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi)) {
            return false;
        }
        Transaksi other = (Transaksi) object;
        if ((this.idTransaksi == null && other.idTransaksi != null) || (this.idTransaksi != null && !this.idTransaksi.equals(other.idTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.restaurant.view.Transaksi[ idTransaksi=" + idTransaksi + " ]";
    }
    
}
