package com.jcaa.usersmanagement.domain;

import com.jcaa.usersmanagement.domain.model.Curso;
import java.util.List;
import java.util.Optional;

public interface CursoRepository {
    Curso save(Curso curso);
    Optional<Curso> findById(Long id);
    List<Curso> findAll();
    void deleteById(Long id);
}