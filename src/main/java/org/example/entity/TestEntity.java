package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@Table(name = "hexagonal")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TestEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

}
