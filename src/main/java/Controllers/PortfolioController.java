package Controllers;


import Models.Portfolio;
import Repositories.PortfolioRepo;
import Services.PortfolioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/portfolio")
public class PortfolioController {

    @Autowired
    PortfolioRepo portfolioRepo;

    @Autowired
    PortfolioService portfolioService;

    @GetMapping("/get")
    public Portfolio getPortfolio(){
         return portfolioService.getPortfolio();
    }


}
