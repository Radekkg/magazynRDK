package com.coderslab.magazynRDK.services;

import com.coderslab.magazynRDK.model.Item;
import com.coderslab.magazynRDK.model.Warehouse;
import com.coderslab.magazynRDK.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

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
}
