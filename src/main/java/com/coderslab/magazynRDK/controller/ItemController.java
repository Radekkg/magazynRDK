package com.coderslab.magazynRDK.controller;

import com.coderslab.magazynRDK.model.*;
import com.coderslab.magazynRDK.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/app/items")
public class ItemController {

    @Autowired
    private ItemService itemService;
    @Autowired
    private QuantityTypeService quantityTypeService;
    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private RackService rackService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public String getItemsList(Model model){
        List<Item> all = (List<Item>) itemService.getItemList();
        model.addAttribute("items",all);
        return "item/itemsList";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("item", new Item());
        return "item/itemAdd";
    }
    @PostMapping("/add")
    public String save(@Valid Item item, BindingResult result) {

        if (result.hasErrors()) {
            return "item/itemAdd";
        }
        itemService.save(item);
        return "redirect:/app/items/list";
    }

    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<Item> byId = itemService.edit(id);
        model.addAttribute("item",byId);
        return "item/itemAdd";
    }
    @PostMapping("/edit/{id}")
    public String edit(Item item) {
        itemService.save(item);
        return "redirect:/app/items/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        itemService.delete(id);
        return "redirect:/app/items/list";
    }
    @GetMapping("/name/{itemName}")
    public String showItemsByName(@PathVariable String itemName, Model model) {
        model.addAttribute("itemsByName", itemService.findItemsByName(itemName));
        return "item/itemsByName";
    }
    @GetMapping("/{warehouseName}")
    public String showItemsByWarehouse(@PathVariable String warehouseName, Model model) {
        model.addAttribute("itemsByWarehouseName", itemService.findAllByWarehouseName(warehouseName));
        return "item/itemsByWarehouseName";
    }

    @ModelAttribute("quantityTypes")
    public Iterable<QuantityType> quantityTypes(){
        return quantityTypeService.getQuantityTypeList();
    }
    @ModelAttribute("warehouses")
    public Iterable<Warehouse> warehouses(){
        return warehouseService.getQuantityTypeList();
    }

    @ModelAttribute("racks")
    public Iterable<Rack> racks(){
        return rackService.getRackList();
    }

    @ModelAttribute("categories")
    public Iterable<Category> items(){
        return categoryService.getCategoryList();
    }
}

