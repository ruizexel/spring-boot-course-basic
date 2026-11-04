package com.srg.practica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/v1/books") 
public class BookController {
    
    @GetMapping
    public String getBook(){
        return "Hola Mundo";
    }

}
