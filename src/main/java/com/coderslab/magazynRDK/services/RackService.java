package com.coderslab.magazynRDK.services;


import com.coderslab.magazynRDK.model.Rack;
import com.coderslab.magazynRDK.repository.RackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RackService {

    @Autowired
    private RackRepository rackRepository;

    public Iterable<Rack> getRackList(){
        return rackRepository.findAll();
    }
    public Optional<Rack> edit(Integer id) {
        return rackRepository.findById(id);
    }
    public void save(Rack rack){
        rackRepository.save(rack);
    }

    public void delete(Integer id){
        rackRepository.deleteById(id);
    }
}
