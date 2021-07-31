package finalproject.service;

import finalproject.entity.GradeEntity;

import java.util.Collection;

public interface GradeService {

    Collection<GradeEntity> findAll();
    GradeEntity findById(Integer id);
    void save(GradeEntity grade);
    void delete(GradeEntity grade);
}
