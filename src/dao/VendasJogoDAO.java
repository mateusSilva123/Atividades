/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MslfVendas;
import bean.MslfVendasJogo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u04127224290
 */
public class VendasJogoDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfVendasJogo.class);
        criteria.add( Restrictions.eq("mslfIdVendasJogo", id) );
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }
      @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfVendasJogo.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listVendas(MslfVendas mslfVendas) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfVendasJogo.class);
        criteria.add( Restrictions.eq("mslfVendas", mslfVendas) );
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}