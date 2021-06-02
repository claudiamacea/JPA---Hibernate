package com.claudiamacea.main;

import com.claudiamacea.entities.Person;

import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

//        Company c = new Company();
//        c.setName("C3");
//        c.setAddress(new Address());
//        c.getAddress().setStr("Mihail Vadim");
//        c.getAddress().setNo(45);
//        c.getAddress().setCity("Pitesti");

//        Departement d = new Departement();
//        d.setCode("ABCDD");
//        d.setNo(101);
//        d.setName("IT");

//        Building b = new Building();
//        b.setName("Tower Building");
//        b.setId(new BuildingPK());
//        b.getId().setCode("ABKKKC");
//        b.getId().setNo(10);

        Person p = new Person();
        p.setName("claudia macea");

        try{
            em.getTransaction().begin();
            em.persist(p);

            em.getTransaction().commit();
            em.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Hello World");
        System.out.println("commit1");
    }
}
