package com.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;


@Service
public class EstudianteServicioImpl implements EstudianteServicio{

	
	
	@Autowired
	private EstudianteRepositorio repositorio;
	
	@Override
	public List<Estudiante> listAll() {
		return repositorio.findAll();
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		
		return repositorio.save(estudiante);
	}

	@Override
	public Estudiante estudiantePorId(Long id) {
		
		return repositorio.getById(id);
	}

	@Override
	public Estudiante actualizaEstudiante(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

	@Override
	public void eliminaEstudiant(Long id) {
		repositorio.deleteById(id);
		
	}

}
