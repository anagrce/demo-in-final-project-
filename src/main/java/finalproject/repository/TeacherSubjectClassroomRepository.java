package finalproject.repository;

import finalproject.entity.TeacherSubjectClassroomEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherSubjectClassroomRepository extends CrudRepository<TeacherSubjectClassroomEntity, Integer> {
}
