package com.jcaa.usersmanagement.infrastructure.adapter.persistence.repository;

import com.jcaa.usersmanagement.domain.CursoRepository;
import com.jcaa.usersmanagement.domain.model.Curso;
import com.jcaa.usersmanagement.infrastructure.adapter.persistence.entity.CursoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CursoRepositoryAdapter implements CursoRepository {

    private final CursoJpaRepository jpaRepository;

    public CursoRepositoryAdapter(CursoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Curso save(Curso curso) {
        CursoEntity entity = toEntity(curso);
        CursoEntity savedEntity = jpaRepository.save(entity);
        return toDomain(savedEntity);
    }

    @Override
    public Optional<Curso> findById(Long id) {
        return jpaRepository.findById(id).map(this::toDomain);
    }

    @Override
    public List<Curso> findAll() {
        return jpaRepository.findAll()
                .stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }

    private CursoEntity toEntity(Curso curso) {
        return new CursoEntity(
                curso.getId(),
                curso.getNombre(),
                curso.getPrecio(),
                curso.getHoras(),
                curso.getNivel(),
                curso.getProfesor(),
                curso.getInstitucion(),
                curso.getFechaInscripcionInicio(),
                curso.getFechaInscripcionFin(),
                curso.getFechaInicio(),
                curso.getFechaCierre(),
                curso.getNumAlumnos(),
                curso.getModalidad(),
                curso.getDescripcion()
        );
    }

    private Curso toDomain(CursoEntity entity) {
        return new Curso(
                entity.getId(),
                entity.getNombre(),
                entity.getPrecio(),
                entity.getHoras(),
                entity.getNivel(),
                entity.getProfesor(),
                entity.getInstitucion(),
                entity.getFechaInscripcionInicio(),
                entity.getFechaInscripcionFin(),
                entity.getFechaInicio(),
                entity.getFechaCierre(),
                entity.getNumAlumnos(),
                entity.getModalidad(),
                entity.getDescripcion()
        );
    }
}
