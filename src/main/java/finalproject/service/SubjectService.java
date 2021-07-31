package finalproject.service;

import finalproject.entity.SubjectEntity;

import java.util.Collection;

public interface SubjectService {

    Collection<SubjectEntity> findAll();
    SubjectEntity findById(Integer id);
    void save(SubjectEntity subject);
    void delete(SubjectEntity subject);
}
