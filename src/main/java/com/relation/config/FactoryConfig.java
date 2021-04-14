package com.relation.config;

import com.relation.entity.Course;
import com.relation.entity.GrouB;
import com.relation.entity.Student;
import com.relation.entity.StudentCard;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfig {

    private static SessionFactory factory;

    private static final FactoryConfig config = new FactoryConfig();

    private FactoryConfig(){
        factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student.class).
                addAnnotatedClass(Course.class).
                addAnnotatedClass(GrouB.class).
                addAnnotatedClass(StudentCard.class).
                buildSessionFactory();
    }

    private SessionFactory getSessionFactory(){
        return factory;
    }




    public static SessionFactory getFactory(){
        return config.getSessionFactory();
    }

}
