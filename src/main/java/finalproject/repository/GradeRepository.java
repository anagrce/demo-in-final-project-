package finalproject.repository;

import finalproject.entity.GradeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends CrudRepository<GradeEntity, Integer> {

}
