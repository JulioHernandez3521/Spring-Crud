package com.app.web;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
@ComponentScan("com")
public class CrudSpringBoot1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBoot1Application.class, args);
	}

	//@Autowired
	//private EstudianteRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Estudiante estudiante1 = new Estudiante("Julio","Hernandez","ju010970@gmail.com");
		repositorio.save(estudiante1);
		
		Estudiante estudiante2 = new Estudiante("Pedro","Sabas","piterS12@gmail.com");
		repositorio.save(estudiante2);
		
		Estudiante estudiante3 = new Estudiante("Daniel","Terrenos","dt21_sd0@gmail.com");
		repositorio.save(estudiante3);
		*/
		
	}

}
