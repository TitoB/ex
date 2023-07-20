package com.tbh.universidadproyect;

import com.tbh.universidadproyect.models.Alumno;
import com.tbh.universidadproyect.models.Direccion;
import com.tbh.universidadproyect.models.Persona;
import com.tbh.universidadproyect.services.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UniversidadProyectApplication {
@Autowired
private AlumnoDAO servicio;
	public static void main(String[] args) {
		String[] beanDefinitionsNames =
				SpringApplication.run(UniversidadProyectApplication.class, args)
				.getBeanDefinitionNames();

//		for(String str: beanDefinitionsNames ){
//			System.out.println(str);
//		}

	}
}
