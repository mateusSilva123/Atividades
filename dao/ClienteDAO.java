/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MslfCliente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 */
public class ClienteDAO extends DAO_Abstract{
public  ClienteDAO(){



}
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
       session.delete(object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteDAO.class);
        criteria.add(Restrictions.eq("MSLF_idCliente", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

      @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfCliente.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    
    public List listRg(int rg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfCliente.class);
        criteria.add(Restrictions.ge("mslfRg", new Double(rg)));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listCep(int cep) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfCliente.class);
        criteria.add(Restrictions.ge("mslfCep", new Double(cep)));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listRgCep(int rg, int cep) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfCliente.class);
        criteria.add(Restrictions.ge("mslfRg", new Double(rg)));
        criteria.add(Restrictions.ge("mslfCep", new Double(cep)));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
}
