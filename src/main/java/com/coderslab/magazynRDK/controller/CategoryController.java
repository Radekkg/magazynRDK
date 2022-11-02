package com.coderslab.magazynRDK.controller;

import com.coderslab.magazynRDK.model.Category;
import com.coderslab.magazynRDK.model.QuantityType;
import com.coderslab.magazynRDK.services.CategoryService;
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
@RequestMapping("/app/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public String getCategoryList(Model model){
        List<Category> all = (List<Category>) categoryService.getCategoryList();
        model.addAttribute("categories",all);
        return "category/categoryList";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("category", new Category());
        return "category/categoryAdd";
    }
    @PostMapping("/add")
    public String save(@Valid Category category, BindingResult result) {

        if (result.hasErrors()) {
            return "category/categoryAdd";
        }
        categoryService.save(category);
        return "redirect:/app/categories/list";
    }

    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<Category> byId = categoryService.edit(id);
        model.addAttribute("category",byId);
        return "category/categoryAdd";
    }
    @PostMapping("/edit/{id}")
    public String edit(Category category) {
        categoryService.save(category);
        return "redirect:/app/categories/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        categoryService.delete(id);
        return "redirect:/app/categories/list";
    }
}
