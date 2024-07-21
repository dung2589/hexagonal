package org.example.adapter;

import org.example.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseJPARepository extends JpaRepository<TestEntity, String> {

}
