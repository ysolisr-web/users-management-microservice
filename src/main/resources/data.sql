INSERT INTO users (id, name, email, password, role, status, created_at, updated_at) 
VALUES ('1', 'Juan Pérez', 'juan@example.com', '123456', 'ADMIN', 'ACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO cursos (nombre, precio, horas, nivel, profesor, institucion, fecha_inscripcion_inicio, fecha_inscripcion_fin, fecha_inicio, fecha_cierre, num_alumnos, modalidad, descripcion)
VALUES ('Desarrollo Web con Spring Boot', 199.99, 40, 'Intermedio', 'John Arrieta', 'Universidad', '2026-11-01', '2026-11-15', '2026-11-16', '2026-12-20', 25, 'Virtual', 'Curso completo de arquitectura hexagonal');