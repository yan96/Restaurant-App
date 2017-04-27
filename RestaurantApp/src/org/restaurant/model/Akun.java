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
@Table(name = "akun")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Akun.findAll", query = "SELECT a FROM Akun a"),
    @NamedQuery(name = "Akun.findByUsername", query = "SELECT a FROM Akun a WHERE a.username = :username"),
    @NamedQuery(name = "Akun.findByNama", query = "SELECT a FROM Akun a WHERE a.nama = :nama"),
    @NamedQuery(name = "Akun.findByPassword", query = "SELECT a FROM Akun a WHERE a.password = :password"),
    @NamedQuery(name = "Akun.findByCategory", query = "SELECT a FROM Akun a WHERE a.category = :category")})
public class Akun implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "category")
    private String category;

    public Akun() {
    }

    public Akun(String username, String nama, String password, String category) {
        this.username = username;
        this.nama = nama;
        this.password = password;
        this.category = category;
    }
    
    

    public Akun(String username) {
        this.username = username;
    }

    public Akun(String username, String nama, String category) {
        this.username = username;
        this.nama = nama;
        this.category = category;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Akun)) {
            return false;
        }
        Akun other = (Akun) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.restaurant.model.Akun[ username=" + username + " ]";
    }
    
}
