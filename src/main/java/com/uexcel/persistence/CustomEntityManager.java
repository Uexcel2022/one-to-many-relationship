package com.uexcel.persistence;

import java.util.HashMap;

import org.hibernate.jpa.HibernatePersistenceProvider;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class CustomEntityManager {

    public static EntityManager getEntityManager() {
        EntityManagerFactory entityManagerFactory = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(), new HashMap<>());

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
}
