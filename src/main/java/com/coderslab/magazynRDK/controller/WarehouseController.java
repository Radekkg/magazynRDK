package com.coderslab.magazynRDK.controller;

import com.coderslab.magazynRDK.services.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

}
