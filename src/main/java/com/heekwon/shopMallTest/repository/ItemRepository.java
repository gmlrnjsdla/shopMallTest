package com.heekwon.shopMallTest.repository;

import com.heekwon.shopMallTest.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    public List<Item> findByItemName(String itemName);
}
