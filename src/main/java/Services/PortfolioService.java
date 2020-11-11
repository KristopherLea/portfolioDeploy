package Services;

import Models.Portfolio;

public interface PortfolioService {
public Portfolio getPortfolio();
public void postPortfolio(Portfolio portfolio);
public Iterable<Portfolio> getAllPortfolios();
}
