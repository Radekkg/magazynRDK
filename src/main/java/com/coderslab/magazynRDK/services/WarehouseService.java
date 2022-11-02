package com.coderslab.magazynRDK.services;

import com.coderslab.magazynRDK.model.Item;
import com.coderslab.magazynRDK.model.QuantityType;
import com.coderslab.magazynRDK.model.Warehouse;
import com.coderslab.magazynRDK.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;

    public Iterable<Warehouse> getQuantityTypeList(){
        return warehouseRepository.findAll();
    }

}
