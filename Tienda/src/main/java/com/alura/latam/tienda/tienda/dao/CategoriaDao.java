package com.alura.latam.tienda.tienda.dao;

import com.alura.latam.tienda.tienda.entity.Categoria;
import javax.persistence.EntityManager;

/**
 * @author Juan Carlos Avila Meza
 */
public class CategoriaDao {

    private final EntityManager entityManager;

    public CategoriaDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void guardar(Categoria categoria) {
        this.entityManager.persist(categoria);
    }

    public void actualizar(Categoria categoria) {
        this.entityManager.merge(categoria);
    }

    public void remover(Categoria categoria) {
        categoria = this.entityManager.merge(categoria);
        this.entityManager.remove(categoria);
    }
}
