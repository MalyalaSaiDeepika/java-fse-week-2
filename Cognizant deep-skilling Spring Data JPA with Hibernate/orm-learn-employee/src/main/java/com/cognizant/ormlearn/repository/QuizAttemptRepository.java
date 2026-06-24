package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.QuizAttempt;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuizAttemptRepository {

    @Autowired
    private SessionFactory sessionFactory;

    // 🔹 Get all attempts (HQL)
    public List<QuizAttempt> getAllAttempts() {
        Session session = sessionFactory.getCurrentSession();

        String hql = "FROM QuizAttempt";
        Query<QuizAttempt> query = session.createQuery(hql, QuizAttempt.class);

        return query.getResultList();
    }

    // 🔹 Get PASS attempts (HQL with parameter)
    public List<QuizAttempt> getPassedAttempts() {
        Session session = sessionFactory.getCurrentSession();

        String hql = "FROM QuizAttempt q WHERE q.status = :status";
        Query<QuizAttempt> query = session.createQuery(hql, QuizAttempt.class);
        query.setParameter("status", "PASS");

        return query.getResultList();
    }
}