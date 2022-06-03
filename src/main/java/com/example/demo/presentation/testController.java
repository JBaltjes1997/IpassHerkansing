package com.example.demo.presentation;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("IPASS")
public class testController {

//    @RequestMapping("/test")
//    String test(){ return "test succeeded";}
//
//    @GetMapping("/gallo")
//    String dit(){
//        return "getMapping gelukt";
//    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
