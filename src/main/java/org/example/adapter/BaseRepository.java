package org.example.adapter;

import java.util.List;

public interface BaseRepository<T, ID> {
    public List<T> findAll();

    public T findById(ID id);
}
