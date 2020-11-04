package com.example.portfolioDeploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PortfolioController {

    @GetMapping("/portfolio")
    public String getPortfolio(){
         return "Welcome to my website.";
    }
}
