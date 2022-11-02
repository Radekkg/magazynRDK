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
@RequestMapping(path = "/")
public class MainController {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String menuPage(){
        return "index";
    }
    @GetMapping("/utils")
    public String utils(){
        return "utils/utils";
    }

    @GetMapping("/warehouseUtils")
    public String warehouseUtils(){
        return "utils/warehouseUtils";
    }

}
