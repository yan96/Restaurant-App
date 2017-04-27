/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.dao;

import java.util.List;
import org.restaurant.model.Listpesanan;

/**
 *
 * @author Administrator
 */
public interface PenambahanListPesananDao 
{
    public void saveDataListPesanan(Listpesanan pemesanan);
    public List<Listpesanan> getAllListPemesanan();
    public void deleteListPemesanan(int id);
    public int getTotalListPemesanan(String tujuan);
}
