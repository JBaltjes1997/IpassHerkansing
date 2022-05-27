package com.example.demo.presentation;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("IPASS")
public class testController {

    @RequestMapping("/test")
    String test(){ return "test succeeded";}

    @GetMapping("/greeting")
    String dit(){
        return "getMapping gelukt";
    }
}
