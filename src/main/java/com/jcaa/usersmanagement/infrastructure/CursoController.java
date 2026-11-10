package com.jcaa.usersmanagement.infrastructure;

import com.jcaa.usersmanagement.domain.CursoRepository;
import com.jcaa.usersmanagement.domain.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> obtenerTodos() {
        return cursoRepository.findAll();
    }

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }
}