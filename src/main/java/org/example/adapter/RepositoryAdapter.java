package org.example.adapter;

import org.example.port.RepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class RepositoryAdapter <T, ID, R extends JpaRepository<T, ID> > implements RepositoryPort<T, ID> {

    @Autowired
    protected R repository;

    @Override
    public List<T> findAll() {
        System.out.println("repository port neeee ");
        return repository.findAll();
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id).get();
    }
}
