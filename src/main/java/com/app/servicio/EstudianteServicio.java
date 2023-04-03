package com.app.servicio;


import java.util.*;
import com.app.web.entidad.Estudiante;


public interface EstudianteServicio {

	
	public List<Estudiante> listAll();
	public Estudiante guardarEstudiante(Estudiante estudiante);
	public Estudiante estudiantePorId(Long id);
	public Estudiante actualizaEstudiante(Estudiante estudiante);
	public void eliminaEstudiant(Long id);
}
