package com.coderslab.magazynRDK.controller;

import com.coderslab.magazynRDK.model.Item;
import com.coderslab.magazynRDK.model.QuantityType;
import com.coderslab.magazynRDK.services.QuantityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/app/quantityTypes")
public class QuantityTypeController {

    @Autowired
    private QuantityTypeService quantityTypeService;

    @GetMapping("/list")
    public String getQuantityTypesList(Model model){
        List<QuantityType> all = (List<QuantityType>) quantityTypeService.getQuantityTypeList();
        model.addAttribute("quantityTypes",all);
        return "quantityTypesList";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("quantityType", new QuantityType());
        return "quantityTypeAdd";
    }
    @PostMapping("/add")
    public String save(@Valid QuantityType quantityType, BindingResult result) {

        if (result.hasErrors()) {
            return "quantityTypeAdd";
        }
        quantityTypeService.save(quantityType);
        return "redirect:/app/quantityTypes/list";
    }
    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<QuantityType> byId = quantityTypeService.edit(id);
        model.addAttribute("quantityType",byId);
        return "quantityTypeAdd";
    }
    @PostMapping("/edit/{id}")
    public String edit(QuantityType quantityType) {
        quantityTypeService.save(quantityType);
        return "redirect:/app/quantityTypes/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        quantityTypeService.delete(id);
        return "redirect:/app/quantityTypes/list";
    }


    //Dodawanie nowej jednostki miar
    //usuwanie jednostki miar
    //dodanie widoku

}
