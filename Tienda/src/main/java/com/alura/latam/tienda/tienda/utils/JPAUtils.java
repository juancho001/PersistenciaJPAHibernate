/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.latam.tienda.tienda.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Juan Carlos Avila Meza
 */
public class JPAUtils {
    
   private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
   
   public static EntityManager getEntityManager(){
       return  entityManagerFactory.createEntityManager();
   }
}
