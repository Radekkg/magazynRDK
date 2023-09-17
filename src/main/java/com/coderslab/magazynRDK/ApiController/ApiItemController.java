package com.coderslab.magazynRDK.ApiController;

import com.coderslab.magazynRDK.model.Category;
import com.coderslab.magazynRDK.model.Item;
import com.coderslab.magazynRDK.repository.ItemRepository;
import com.coderslab.magazynRDK.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ApiItemController {

    @Autowired
    ItemService itemService;

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/list")
    public List<Item> getItemsList(){
        return (List<Item>) itemService.getItemList();
    }
}
