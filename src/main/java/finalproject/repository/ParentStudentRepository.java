package finalproject.repository;

import finalproject.entity.ParentStudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentStudentRepository extends CrudRepository<ParentStudentEntity, Integer> {
}
