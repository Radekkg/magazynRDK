package com.coderslab.magazynRDK.repository;

import com.coderslab.magazynRDK.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository <Item, Integer> {
    List<Item> findAllByWarehouseId(String name);
    List<Item> findAllByWarehouseName(String name);
    List<Item> findAllItemsByName(String name);
}
