package com.example.springprojectkanat.controllers;


import com.example.springprojectkanat.model.Customers;
import com.example.springprojectkanat.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@AllArgsConstructor
public class WebController {
    MainService service ;

    @GetMapping(value = "/index")
    public String index(Model model) {return "Kanat Project";}

    @GetMapping(value = "/users")
    public List<Customers> getAllUsers()
    {
       return service.getUsers();
    }

    @GetMapping (value = "/check")
    public String getLvlOfEnglish(){
        int ball = 44;
        return service.getLvl(ball);
    }

}
