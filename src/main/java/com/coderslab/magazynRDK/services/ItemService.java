package com.coderslab.magazynRDK.services;

import com.coderslab.magazynRDK.model.Item;
import com.coderslab.magazynRDK.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void save(Item item){
        itemRepository.save(item);
    }

    public Iterable<Item> getItemList(){
        return itemRepository.findAll();
    }
}
