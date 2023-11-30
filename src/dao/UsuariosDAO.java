/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MslfUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *mysql-connector-java-5.1.23-bin.jar
 *
 */
public class UsuariosDAO extends DAO_Abstract{


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
        Criteria criteria = session.createCriteria(MslfUsuarios.class);
        criteria.add(Restrictions.eq("MSLF_idUsuarios", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfUsuarios.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    
    public List validar(String tabela, String busca) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfUsuarios.class);
        criteria.add(Restrictions.eq(tabela, busca));
        
        List lista = criteria.list();
        
        session.getTransaction().commit();
        return lista;
    }
    
    
    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfUsuarios.class);
        criteria.add(Restrictions.like("mslfNome", "%" + nome + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfUsuarios.class);
        criteria.add(Restrictions.like("mslfCpf", "%" + cpf + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public List listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfUsuarios.class);
        criteria.add(Restrictions.like("mslfNome", "%" + nome + "%"));
        criteria.add(Restrictions.like("mslfCpf", "%" + cpf + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        return Lista;
    }
    
    public static void main(String[] args) {
       
    }
    
}
