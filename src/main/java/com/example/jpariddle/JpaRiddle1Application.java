package com.example.jpariddle;


import com.example.jpariddle.entities.Collar;
import com.example.jpariddle.entities.CollarLabel;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JpaRiddle1Application {

    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("default")
                .createEntityManager();
        CollarLabel label = new CollarLabel(21L, 1L);
        Collar collar = entityManager.find(Collar.class, label);
        System.out.println(collar.getDescription());
    }
}