package com.example.lab4_20193315.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)    public String paginaPrincipal(){
        return "index";
    }
}
