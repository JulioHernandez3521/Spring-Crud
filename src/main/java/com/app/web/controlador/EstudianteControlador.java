package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.servicio.EstudianteServicio;
import com.app.web.entidad.*;


@Controller
public class EstudianteControlador {
	
	@Autowired
	private EstudianteServicio servicio;
	
	@GetMapping({"/estudiantes","/"})
	public String ListarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes", servicio.listAll());
		return "estudiantes"; // Nos retorna el archivo estudiantes
	}
	
	@GetMapping("/estudiantes/nuevo")
	public String renderFormNuevoEstudiante (Model model) {
		Estudiante est = new Estudiante();
		model.addAttribute("estudiante", est);
		return "crea_estudiante";
	}
	
	@PostMapping("/estudiantes")
	public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
		servicio.guardarEstudiante(estudiante);
		return "redirect:estudiantes";
	}
	
	@GetMapping("/estudiantes/editar/{id}")
	public String renderFormEditar(@PathVariable Long id, Model model) {
		model.addAttribute("estudiante", servicio.estudiantePorId(id));
		return "editar_estudiante";
	}
	
	@PostMapping("/estudiantes/{id}")
	public String actualizaEstudiante(@PathVariable Long id, 
			@ModelAttribute("estudiante") Estudiante estudiante, 
			Model model) {
		Estudiante estudianteOld = servicio.estudiantePorId(id);
		estudianteOld.setId(id);
		estudianteOld.setNombre(estudiante.getNombre());
		estudianteOld.setApellido(estudiante.getApellido());
		estudianteOld.setEmail(estudiante.getEmail());
		
		servicio.actualizaEstudiante(estudianteOld);
		return "redirect:/estudiantes";
		
	}
	
	@GetMapping("estudiantes/{id}")
	public String eliminarEstudiante(@PathVariable Long id) {
		servicio.eliminaEstudiant(id);
		return"redirect:/estudiantes";
	}

}
