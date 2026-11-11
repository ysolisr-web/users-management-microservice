package com.jcaa.usersmanagement.domain.model;

import java.time.LocalDate;

public class Curso {

    private Long id;
    private String nombre;
    private Double precio;
    private Integer horas;
    private String nivel;
    private String profesor;
    private String institucion;
    private LocalDate fechaInscripcionInicio;
    private LocalDate fechaInscripcionFin;
    private LocalDate fechaInicio;
    private LocalDate fechaCierre;
    private Integer numAlumnos;
    private String modalidad;
    private String descripcion;

    public Curso() {}

    public Curso(Long id, String nombre, Double precio, Integer horas, String nivel, String profesor,
                 String institucion, LocalDate fechaInscripcionInicio, LocalDate fechaInscripcionFin,
                 LocalDate fechaInicio, LocalDate fechaCierre, Integer numAlumnos, String modalidad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.horas = horas;
        this.nivel = nivel;
        this.profesor = profesor;
        this.institucion = institucion;
        this.fechaInscripcionInicio = fechaInscripcionInicio;
        this.fechaInscripcionFin = fechaInscripcionFin;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.numAlumnos = numAlumnos;
        this.modalidad = modalidad;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public Integer getHoras() { return horas; }
    public void setHoras(Integer horas) { this.horas = horas; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public String getProfesor() { return profesor; }
    public void setProfesor(String profesor) { this.profesor = profesor; }

    public String getInstitucion() { return institucion; }
    public void setInstitucion(String institucion) { this.institucion = institucion; }

    public LocalDate getFechaInscripcionInicio() { return fechaInscripcionInicio; }
    public void setFechaInscripcionInicio(LocalDate fechaInscripcionInicio) { this.fechaInscripcionInicio = fechaInscripcionInicio; }

    public LocalDate getFechaInscripcionFin() { return fechaInscripcionFin; }
    public void setFechaInscripcionFin(LocalDate fechaInscripcionFin) { this.fechaInscripcionFin = fechaInscripcionFin; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaCierre() { return fechaCierre; }
    public void setFechaCierre(LocalDate fechaCierre) { this.fechaCierre = fechaCierre; }

    public Integer getNumAlumnos() { return numAlumnos; }
    public void setNumAlumnos(Integer numAlumnos) { this.numAlumnos = numAlumnos; }

    public String getModalidad() { return modalidad; }
    public void setModalidad(String modalidad) { this.modalidad = modalidad; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}