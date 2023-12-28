package org.example.ORM.hibernate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.ORM.dao.SessionGroupDao;
import org.example.ORM.dao.StudentDao;
import org.example.ORM.entity.Group;
import org.example.ORM.entity.Student;
import org.example.ORM.entitymanager.EntityManagerStudentDao;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateSessionService {
    private static final Logger LOGGER = LogManager.getLogger(HibernateSessionService.class);

    private final SessionGroupDao sessionGroupDao;
    private final StudentDao studentDao;

    public HibernateSessionService() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        // studentDao = new SessionStudentDao(sessionFactory);
        studentDao = new EntityManagerStudentDao(sessionFactory);
        sessionGroupDao = new SessionGroupDao(sessionFactory);
    }

    public void exec() {
        Student student = studentDao.findById(1L);
        LOGGER.info("{}", student);

        List<Student> students = studentDao.findAll();
        LOGGER.info("{}", students);

        Group group = sessionGroupDao.findById(1L);

        Student newStudent = new Student();
        newStudent.setName("Иван");
        newStudent.setSurname("Новый");
        newStudent.setGroup(group);
        studentDao.save(newStudent);
    }
}
