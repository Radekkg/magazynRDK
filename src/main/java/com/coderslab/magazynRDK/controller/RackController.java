package com.coderslab.magazynRDK.controller;

import com.coderslab.magazynRDK.model.Rack;
import com.coderslab.magazynRDK.services.RackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
@Controller
@RequestMapping("/app/racks")
public class RackController {

    @Autowired
    private RackService rackService;

    @GetMapping("/list")
    public String getRackList(Model model){
        List<Rack> all = (List<Rack>) rackService.getRackList();
        model.addAttribute("racks",all);
        return "rack/rackList";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("rack", new Rack());
        return "rack/rackAdd";
    }
    @PostMapping("/add")
    public String save(@Valid Rack rack, BindingResult result) {

        if (result.hasErrors()) {
            return "rack/rackAdd";
        }
        rackService.save(rack);
        return "redirect:/app/racks/list";
    }
}
