package com.jcaa.usersmanagement.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cursos")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "horas")
    private Integer horas;

    @Column(name = "nivel")
    private String nivel;

    @Column(name = "profesor")
    private String profesor;

    @Column(name = "institucion")
    private String institucion;

    @Column(name = "fecha_inscripcion_inicio")
    private LocalDate fechaInscripcionInicio;

    @Column(name = "fecha_inscripcion_fin")
    private LocalDate fechaInscripcionFin;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_cierre")
    private LocalDate fechaCierre;

    @Column(name = "num_alumnos")
    private Integer numAlumnos;

    @Column(name = "modalidad")
    private String modalidad;

    @Column(name = "descripcion", length = 1000)
    private String descripcion;

    public CursoEntity() {}

    public CursoEntity(Long id, String nombre, Double precio, Integer horas, String nivel, String profesor,
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

    // Getters y Setters Standard
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
