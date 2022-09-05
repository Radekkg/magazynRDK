package com.coderslab.magazynRDK.controller;

import com.coderslab.magazynRDK.model.Item;
import com.coderslab.magazynRDK.repository.ItemRepository;
import com.coderslab.magazynRDK.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//dispacher servlet
//RestController
//
@Controller
@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemService itemService;


    //dodanie listy pobranych przedmiotów
    //stworzenie tabeli z pobranymi przedmiotami
    //przełaczanie miedzy magazynami
    //wyszukiwanie przedmiotów po nazwie
    //wyszukiwanie przedmiotów z listy

//    @PostMapping(path="/add")
//    public @ResponseBody String addNewItem (@RequestParam String name
//            , @RequestParam Integer quantity) {
//        Item item = new Item();
//        item.setName(name);
//        item.setQuantity(quantity);
//        itemRepository.save(item);
//        return "Saved";
//    }

        @PostMapping("/add")
        //to jest jak nie ma jsp
        @ResponseBody
        //
        public String addNewItem (@RequestBody Item item) {
        itemService.save(item);
        return "Saved";
    }


    @GetMapping("/all")
    public @ResponseBody Iterable<Item> getAllItems() {
        // This returns a JSON or XML with the users
        return itemRepository.findAll();
    }

}
