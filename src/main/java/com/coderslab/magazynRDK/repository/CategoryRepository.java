package com.coderslab.magazynRDK.repository;

import com.coderslab.magazynRDK.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
