package com.mgmetehan.githubactionsdemo.repository;

import com.mgmetehan.githubactionsdemo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
