package Repositories;


import Models.Resume;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepo extends CrudRepository<Resume,Long> {
}
