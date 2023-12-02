/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MslfJogo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 */
public class JogoDAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(MslfJogo.class);
        criteria.add(Restrictions.eq("MSLF_idJogo", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfJogo.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    
    public static void main(String[] args) {
        JogoDAO jogoDAO = new JogoDAO();
    }
    
    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfJogo.class);
        criteria.add(Restrictions.like("mslfNome", "%" + nome + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    public List listEstoque(int estoque) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfJogo.class);
        criteria.add(Restrictions.ge("mslfEstoque", estoque));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listNomeEstoque(String nome, int estoque) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfJogo.class);
        criteria.add(Restrictions.like("mslfNome", "%" + nome + "%"));
        criteria.add(Restrictions.ge("mslfEstoque", estoque));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
}
