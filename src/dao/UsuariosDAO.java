/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u10549640177
 */
public class UsuariosDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(Usuarios.class);
        criteria.add( Restrictions.eq("idusuarios", id) );
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuarios.class);
        criteria.add(Restrictions.like("nome", "%" + nome + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    public List listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuarios.class);
        criteria.add(Restrictions.like("cpf", "%" + cpf + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuarios.class);
        criteria.add(Restrictions.like("nome", "%" + nome + "%"));
        criteria.add(Restrictions.like("cpf", "%" + cpf + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
}
