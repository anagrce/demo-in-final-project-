package finalproject.repository;

import finalproject.entity.TeacherSubjectEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherSubjectRepository extends CrudRepository<TeacherSubjectEntity, Integer> {
}
