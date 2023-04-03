package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.web.entidad.Estudiante;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long>{

}
