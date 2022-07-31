package com.example.demo.controllers;

import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/string")
public class StringController {

    @GetMapping(value = "/request")
    public String string( @RequestParam() String s,
                          @RequestParam(required = false) String sb){
        if (sb== null){
            return s;
        }else
            return s + " " + sb;
    }
}
