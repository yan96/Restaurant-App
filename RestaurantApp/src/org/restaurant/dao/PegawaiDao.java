/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.dao;

import java.util.List;
import org.restaurant.model.Pegawai;

/**
 *
 * @author Administrator
 */
public interface PegawaiDao 
{
    public void saveDataPegawai(Pegawai x);
    public List<Pegawai> getAllAkun();
    public void deletePegawai(String a, String b); 
}
