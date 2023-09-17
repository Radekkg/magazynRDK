package com.coderslab.magazynRDK.ApiController;

import com.coderslab.magazynRDK.model.Category;
import com.coderslab.magazynRDK.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class ApiCategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public List<Category> getAll() {
        return categoryService.getAll();
    }
}
