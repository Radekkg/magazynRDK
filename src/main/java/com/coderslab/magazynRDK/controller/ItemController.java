package com.coderslab.magazynRDK.controller;

import com.coderslab.magazynRDK.model.Item;
import com.coderslab.magazynRDK.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/app/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/list")
    public String getItemsList(Model model){
        List<Item> all = (List<Item>) itemService.getItemList();
        model.addAttribute("items",all);
        return "itemsList";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("item", new Item());
        return "itemAdd";
    }
    @PostMapping("/add")
    public String save(@Valid Item item, BindingResult result) {

        if (result.hasErrors()) {
            return "itemAdd";
        }
        itemService.save(item);
        return "redirect:/app/items/list";
    }
}
