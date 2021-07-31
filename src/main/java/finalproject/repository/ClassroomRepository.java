package finalproject.repository;

import finalproject.entity.ClassroomEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends CrudRepository<ClassroomEntity, Integer> {

}
