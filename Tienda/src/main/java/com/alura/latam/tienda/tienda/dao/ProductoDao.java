package com.alura.latam.tienda.tienda.dao;

import com.alura.latam.tienda.tienda.entity.Producto;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * @author Juan Carlos Avila Meza
 */
public class ProductoDao {

    private final EntityManager entityManager;

    public ProductoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void guardar(Producto producto) {
        this.entityManager.persist(producto);
    }

    public Producto consultarProductoId(Long id) {
        return entityManager.find(Producto.class, id);
    }

    public List<Producto> consultarProductoTodo() {
        String jpql_producto = "SELECT p FROM Producto as p";
        return entityManager.createQuery(jpql_producto, Producto.class).getResultList();
    }

    public List<Producto> consultarNombreProducto(String nombre) {
        String jpql_producto = "SELECT p FROM Producto as p where p.nombre=:nombre";
        return entityManager.createQuery(jpql_producto).setParameter("nombre", nombre).getResultList();
    }

}
