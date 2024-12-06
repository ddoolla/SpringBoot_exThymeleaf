package com.example.exThymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/page-a")
    public String viewPageA() {
        return "page_a";
    }

    @GetMapping("/page-b")
    public String viewPageB() {
        return "page_b";
    }

    @GetMapping("/page-c")
    public String viewPageC() {
        return "page_c";
    }
}
