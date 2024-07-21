package org.example.adapter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public class MariaDBRepository<T, ID>  implements BaseRepository<T, ID> {



    @Override
    public List<T> findAll() {

        return null;
    }

    @Override
    public T findById(ID id) {
        return null;
    }
}
