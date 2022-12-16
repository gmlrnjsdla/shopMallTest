package com.heekwon.shopMallTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "item_table")
@Data
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String itemName;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int stockCount;
}
