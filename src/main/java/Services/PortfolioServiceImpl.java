package Services;


import Models.Portfolio;
import Repositories.PortfolioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PortfolioServiceImpl implements PortfolioService{

    @Autowired
    PortfolioRepo portfolioRepo;

    @Override
    public Portfolio getPortfolio(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://dog.ceo/api/breeds/image/random",Portfolio.class);
    }

    @Override
    public void postPortfolio(Portfolio portfolio){
        portfolioRepo.save(portfolio);
    }

    @Override
    public Iterable<Portfolio> getAllPortfolios(){
        return portfolioRepo.findAll();
    }
}
