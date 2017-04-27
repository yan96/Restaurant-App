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
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByNamaMenu", query = "SELECT m FROM Menu m WHERE m.namaMenu = :namaMenu"),
    @NamedQuery(name = "Menu.findByHarga", query = "SELECT m FROM Menu m WHERE m.harga = :harga"),
    @NamedQuery(name = "Menu.findByBahan", query = "SELECT m FROM Menu m WHERE m.bahan = :bahan")})
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "namaMenu")
    private String namaMenu;
    @Basic(optional = false)
    @Column(name = "harga")
    private double harga;
    @Basic(optional = false)
    @Column(name = "bahan")
    private String bahan;

    public Menu() {
    }

    public Menu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public Menu(String namaMenu, double harga, String bahan) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.bahan = bahan;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (namaMenu != null ? namaMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.namaMenu == null && other.namaMenu != null) || (this.namaMenu != null && !this.namaMenu.equals(other.namaMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.restaurant.model.Menu[ namaMenu=" + namaMenu + " ]";
    }
    
}
