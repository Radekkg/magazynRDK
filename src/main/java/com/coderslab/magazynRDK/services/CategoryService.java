package com.coderslab.magazynRDK.services;

import com.coderslab.magazynRDK.model.Category;
import com.coderslab.magazynRDK.model.QuantityType;
import com.coderslab.magazynRDK.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Category> getCategoryList(){
        return categoryRepository.findAll();
    }
    public Optional<Category> edit(Integer id) {
        return categoryRepository.findById(id);
    }
    public void save(Category category){
        categoryRepository.save(category);
    }

    public void delete(Integer id){
        categoryRepository.deleteById(id);
    }
}
