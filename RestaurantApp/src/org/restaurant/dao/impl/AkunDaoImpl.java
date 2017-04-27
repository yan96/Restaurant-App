/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.restaurant.dao.AkunDao;
import org.restaurant.model.Akun;
import org.restaurant.util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class AkunDaoImpl implements AkunDao
{

    @Override
    public void saveDataAkun(Akun x) 
    {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.save(x);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }

    @Override
    public List<Akun> getAllAkun() 
    {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        List<Akun> akuns = session.createCriteria(Akun.class).list();

        session.getTransaction().commit();
        session.flush();
        session.close();
        return akuns;
    }

    @Override
    public void deleteAkun(String a, String b) 
    {
    
    }
    
}
