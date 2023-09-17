package com.coderslab.magazynRDK.services;

import com.coderslab.magazynRDK.model.Category;
import com.coderslab.magazynRDK.model.QuantityType;
import com.coderslab.magazynRDK.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

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


//======================================================
    public List<Category> getAll(){
        return jdbcTemplate.query("SELECT * FROM categories",
                BeanPropertyRowMapper.newInstance(Category.class));
    }
}
