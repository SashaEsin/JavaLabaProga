package org.example.ORM.dao;

import org.example.ORM.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class SessionStudentDao implements StudentDao {
    private final SessionFactory sessionFactory;

    public SessionStudentDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Student findById(Long id) {
        Session session = sessionFactory.openSession();
        return session.get(Student.class, id);
    }

    @Override
    public void save(Student entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Student entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Student entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Student> findAll() {
        Session session = sessionFactory.openSession();
        List<Student> studentList = session.createQuery("from Student", Student.class).list();
        return studentList;
    }
}
