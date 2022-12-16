package com.heekwon.shopMallTest;

import com.heekwon.shopMallTest.entity.Item;
import com.heekwon.shopMallTest.repository.ItemRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

//    @Test
//    @DisplayName("상품정보 저장 테스트")
//    public void createItemTest(){
//
//        Item item = new Item();
//        item.setItemName("커피");
//        item.setPrice(3000);
//        item.setStockCount(200);
//
//        Item savedItem = itemRepository.save(item);
//
//    }

    @Test
    @DisplayName("상품정보 조회테스트")
    public void findByNameTest(){

        List<Item> items = itemRepository.findByItemName("커피");

        for(Item item : items){
            System.out.println(item.toString());
        }
    }

}
