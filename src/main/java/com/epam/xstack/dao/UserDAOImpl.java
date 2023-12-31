package com.epam.xstack.dao;

import com.epam.xstack.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        Query<User> fromUser = session.createQuery("FROM User ", User.class);
        List<User> allUser = fromUser.getResultList();

        return allUser;
    }

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    @Override
    public User getUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("DELETE FROM User WHERE id =:userID");
        query.setParameter("userID", id);
        query.executeUpdate();
    }
}
