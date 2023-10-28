package com.mgmetehan.githubactionsdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "items")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String name;
    private Double price;
    private String brand;
    private String category;
}
