package com.heekwon.shopMallTest.controller;

import com.heekwon.shopMallTest.entity.Item;
import com.heekwon.shopMallTest.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ShopController {

    @Autowired
    ItemRepository itemRepository;

    @RequestMapping(value = "/item")
    public String item(Model model){
        List<Item> itemList = itemRepository.findByItemName("커피");

        Item item = itemList.get(0);
        model.addAttribute("item", item);

        return "itemlist";
    }

}
