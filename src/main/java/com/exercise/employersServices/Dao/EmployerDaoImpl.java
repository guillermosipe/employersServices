package com.exercise.employersServices.Dao;

import com.exercise.employersServices.Entity.Employer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class EmployerDaoImpl implements EmployerDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public void save(Employer employer) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(employer);
    }

}
