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
@Table(name = "inventori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventori.findAll", query = "SELECT i FROM Inventori i"),
    @NamedQuery(name = "Inventori.findByKodeBahan", query = "SELECT i FROM Inventori i WHERE i.kodeBahan = :kodeBahan"),
    @NamedQuery(name = "Inventori.findByNamaBahan", query = "SELECT i FROM Inventori i WHERE i.namaBahan = :namaBahan"),
    @NamedQuery(name = "Inventori.findByStatusBahan", query = "SELECT i FROM Inventori i WHERE i.statusBahan = :statusBahan")})
public class Inventori implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodeBahan")
    private Integer kodeBahan;
    @Column(name = "namaBahan")
    private String namaBahan;
    @Column(name = "statusBahan")
    private String statusBahan;

    public Inventori() {
    }

    public Inventori(Integer kodeBahan) {
        this.kodeBahan = kodeBahan;
    }

    public Integer getKodeBahan() {
        return kodeBahan;
    }

    public void setKodeBahan(Integer kodeBahan) {
        this.kodeBahan = kodeBahan;
    }

    public String getNamaBahan() {
        return namaBahan;
    }

    public void setNamaBahan(String namaBahan) {
        this.namaBahan = namaBahan;
    }

    public String getStatusBahan() {
        return statusBahan;
    }

    public void setStatusBahan(String statusBahan) {
        this.statusBahan = statusBahan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeBahan != null ? kodeBahan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventori)) {
            return false;
        }
        Inventori other = (Inventori) object;
        if ((this.kodeBahan == null && other.kodeBahan != null) || (this.kodeBahan != null && !this.kodeBahan.equals(other.kodeBahan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.restaurant.view.Inventori[ kodeBahan=" + kodeBahan + " ]";
    }
    
}
