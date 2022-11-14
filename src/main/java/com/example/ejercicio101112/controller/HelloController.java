package com.example.ejercicio101112.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.prueba}")
    String message;
    @GetMapping("/hola")
    public String saludo(){
        System.out.println(message);
        return "hola bienvenido al ejercicio 4 api Rest" + message;
    }

    @GetMapping("/")
    public String prueba(){
        System.out.println(message);
        return " bienvenido al ejercicio 4 api Rest" + message;
    }


}
