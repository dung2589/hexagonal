package org.example.port;

import java.util.List;

public interface RepositoryPort<T, ID> {

    public List<T> findAll();

    public T findById(ID id);

}
