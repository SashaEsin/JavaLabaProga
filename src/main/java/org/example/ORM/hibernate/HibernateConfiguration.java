package org.example.ORM.hibernate;

import org.example.ORM.entity.Group;
import org.example.ORM.entity.Student;
import org.example.ORM.properties.ApplicationHibernateProperties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Objects;
import java.util.Properties;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;
    private HibernateConfiguration() {}

    public static SessionFactory getSessionFactory() {
        if (Objects.nonNull(sessionFactory)) {
            return sessionFactory;
        }

        Properties properties = ApplicationHibernateProperties.getInstance().getProperties();

        Configuration configuration = new Configuration().addProperties(properties);
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Group.class);

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(properties);

        sessionFactory = configuration.buildSessionFactory(builder.build());

        return sessionFactory;
    }
}
