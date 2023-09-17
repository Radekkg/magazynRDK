package com.coderslab.magazynRDK.ApiController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class ApiMainController {

    @GetMapping("/test")
    public  int test(){
        return 1234;
    }
}
