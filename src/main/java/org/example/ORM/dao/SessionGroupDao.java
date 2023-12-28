package org.example.ORM.dao;

import org.example.ORM.entity.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class SessionGroupDao implements GroupDao {
    private final SessionFactory sessionFactory;

    public SessionGroupDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Group findById(Long id) {
        Session session = sessionFactory.openSession();
        Group entity = session.get(Group.class, id);
        return entity;
    }

    @Override
    public void save(Group entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Group entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Group entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Group> findAll() {
        Session session = sessionFactory.openSession();
        List<Group> entities = (List<Group>) session.createQuery("from Group").list();
        return entities;
    }
}
