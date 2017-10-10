package slit.db;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author snorr
 */

@Stateless
public class UserManagerBean implements UserManager {

    @PersistenceContext
    EntityManager em;

    public UserManagerBean() {
    }

    @Override
    public void insert(User entity) {
        em.persist(entity);
    }

    @Override
    public void update(User entity) {
        em.merge(entity);
    }

    @Override
    public void delete(User entity) {
        em.remove(em.merge(entity));
    }

    @Override
    public User find(Object id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(User.class));
        return em.createQuery(cq).getResultList();
    }
}
