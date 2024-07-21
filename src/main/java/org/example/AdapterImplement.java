package org.example;

import org.example.adapter.BaseJPARepository;

import org.example.adapter.RepositoryAdapter;
import org.example.entity.TestEntity;
import org.springframework.stereotype.Component;

@Component
public class AdapterImplement extends RepositoryAdapter<TestEntity, String, BaseJPARepository> {
}
