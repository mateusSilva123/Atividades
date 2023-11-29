/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MslfEntregas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 */
public class EntregasDAO extends DAO_Abstract{

    @Override
    public void insert(Object object) {
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
    }

    @Override 
    public void update(Object object) {
       session.beginTransaction();
        session.flush();
       session.clear();
       session.update(object);
       session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
       session.flush();
       session.clear();
       session.delete( object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EntregasDAO.class);
        criteria.add(Restrictions.eq("MSLF_idEntregas", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfEntregas.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    
       public List listCidade(String cidade) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfEntregas.class);
        criteria.add(Restrictions.like("mslfCidade", "%" + cidade + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listNumCasa(int numCasa) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfEntregas.class);
        criteria.add(Restrictions.ge("mslfNumCasa", new Double(numCasa)));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listCidadeNumCasa(String cidade, int numCasa) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfEntregas.class);
        criteria.add(Restrictions.like("mslfCidade", "%" + cidade + "%"));
        criteria.add(Restrictions.ge("mslfNumCasa", new Double(numCasa)));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
}
