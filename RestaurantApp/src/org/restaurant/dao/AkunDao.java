/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.dao;

import java.util.List;
import org.restaurant.model.Akun;

/**
 *
 * @author Administrator
 */
public interface AkunDao 
{
    public void saveDataAkun(Akun x);
    public List<Akun> getAllAkun();
    public void deleteAkun(String a, String b);   
}
