/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MslfVendas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 */
public class VendasDAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(VendasDAO.class);
        criteria.add(Restrictions.eq("MSLF_idVendas", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasDAO.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    
    public static void main(String[] args) {
        VendasDAO vendasAO = new VendasDAO();
    }
    
    
    
    public List listObservacao(String observacao) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfVendas.class);
        criteria.add(Restrictions.like("mslfObservacao", "%" + observacao + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listQuantidade(int quantidade) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfVendas.class);
        criteria.add(Restrictions.ge("mslfQuantidade", new Double(quantidade)));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listObservacaoQuantidade(String observacao, int quantidade) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfVendas.class);
        criteria.add(Restrictions.like("mslfObservacao", "%" + observacao + "%"));
        criteria.add(Restrictions.ge("mslfQuantidade", new Double(quantidade)));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    
}
