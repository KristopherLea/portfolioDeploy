package com.example.portfolioDeploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PortfolioController {

    @GetMapping("/portfolio")
    public String getPortfolio(){
        String welcome = "Welcome to my website.";
        return welcome;
    }
}
