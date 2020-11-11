package Repositories;

import Models.Portfolio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepo extends CrudRepository<Portfolio,Long> {

}
