package Exo1;

import Exo1.entity.Region;
import Exo1.util.Climat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Region region = Region.builder().name("Alsace").surface(100).climat(Climat.CONTINENTAL).build();

        em.persist(region);
        em.getTransaction().commit();
        em.close();
    }
}