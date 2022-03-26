package com.database.databasetesting;

import com.database.databasetesting.player.Player;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Player nick = new Player();
        nick.setUsername("NickVo");
        Player danny = new Player();
        danny.setUsername("Daniel33");

        var factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(nick);
        entityManager.persist(danny);
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }

}
