/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.dao;

import java.util.List;
import org.restaurant.model.Transaksi;
/**
 *
 * @author Administrator
 */
public interface PemesananDao 
{
    public void saveDataPemesanan(Transaksi pemesanan);
    public List<Transaksi> getAllPemesanan();
    public void deletePemesanan(int id);
    public int getTotalPemesanan(String tujuan);
}
