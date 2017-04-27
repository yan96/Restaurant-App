/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.dao;

import java.util.List;
import org.restaurant.model.Inventori;

/**
 *
 * @author Administrator
 */
public interface PenambahanInventoryDao 
{
    public void saveDataInventory(Inventori m);
    public Inventori getInventory(int id);
    public List<Inventori> getAllInventory();
    public void updateDataInventory(Inventori m);
    public void deleteDataInventory(Inventori m);
    
}
