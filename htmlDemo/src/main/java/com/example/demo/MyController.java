package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
        public String welcome() {
            return ("index");
        }

    @GetMapping("/demo")
    public String demo(){
        return "demo";
    }

    @GetMapping("/three")
    public String demo2(){
        return "threeboxes";
    }

    @GetMapping("/otherthree")
    public String demo3(){
        return "threeotherboxes";
    }

    @GetMapping("/website")
    public String test(){
        return "website";
    }
}
