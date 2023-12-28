package org.example.ORM.dao;

import java.util.List;

public interface CrudDao<E, I> {
    E findById(Long id);
    void save(E entity);
    void update(E entity);
    void delete(E entity);
    List<E> findAll();
}
