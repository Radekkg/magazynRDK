package com.coderslab.magazynRDK.services;

import com.coderslab.magazynRDK.model.QuantityType;
import com.coderslab.magazynRDK.repository.QuantityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class QuantityTypeService {

    @Autowired
    private QuantityTypeRepository quantityTypeRepository;

    public Iterable<QuantityType> getQuantityTypeList(){
        return quantityTypeRepository.findAll();
    }
    public Optional<QuantityType> edit(Integer id) {
        return quantityTypeRepository.findById(id);
    }
    public void save(QuantityType quantityType){
        quantityTypeRepository.save(quantityType);
    }

    public void delete(Integer id){
        quantityTypeRepository.deleteById(id);
    }
}
