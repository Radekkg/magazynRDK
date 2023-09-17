package com.coderslab.magazynRDK.services;

import com.coderslab.magazynRDK.model.Category;
import com.coderslab.magazynRDK.model.Item;
import com.coderslab.magazynRDK.model.Warehouse;
import com.coderslab.magazynRDK.repository.ItemRepository;
import org.hibernate.engine.jdbc.spi.JdbcServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Item item){
        itemRepository.save(item);
    }
    public Optional<Item> edit(Integer id) {
        return itemRepository.findById(id);
    }

    public List<Item> findItemsByName(String name) {
        return itemRepository.findAllItemsByName(name);
    }
    public void delete(Integer id){
        itemRepository.deleteById(id);
    }

    public Iterable<Item> getItemList(){
        return itemRepository.findAll();
    }

    public List<Item> findAllByWarehouseName(String name) {
        return itemRepository.findAllByWarehouseName(name);
    }

    public List<Item> getAll(){
        return jdbcTemplate.query("SELECT it.id,ca.name,it.quantity,it.name FROM items it LEFT JOIN categories ca ON it.id_category = ca.id",
                BeanPropertyRowMapper.newInstance(Item.class));
    }

}
