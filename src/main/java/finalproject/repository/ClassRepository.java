package finalproject.repository;

import finalproject.entity.ClassEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends CrudRepository<ClassEntity, Integer> {
}
