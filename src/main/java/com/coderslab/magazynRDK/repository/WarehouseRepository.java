package com.coderslab.magazynRDK.repository;

import com.coderslab.magazynRDK.model.Item;
import com.coderslab.magazynRDK.model.Warehouse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WarehouseRepository extends CrudRepository <Warehouse, Integer> {
    List<Warehouse> findAll();
    //List<Warehouse> findAllByWarehouseName(String name);
}
