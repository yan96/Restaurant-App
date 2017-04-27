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
public interface PenambahanPegawaiDao 
{
    public void addDataPegawai(Pegawai m);
    public Pegawai getPegawai(int id);
    public List<Pegawai> getAllPegawai();
    public void updateDataPegawai(Pegawai m);
    public void deleteDataPegawai(Pegawai m);
    
    
}
