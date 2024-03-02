package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.to.EstudianteTO;

@RestController
@RequestMapping(path = "/estudiantes")
@CrossOrigin
public class EstudianteControllerRestful {
	
	//Ruta api consumir
	//http://localhost:8080/API/v1.0/Matricula/estudiantes
	
	@Autowired
	private IEstudianteService iEstudianteService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EstudianteTO> buscarEstudiantes() {
		return this.iEstudianteService.buscarEstudiantes();
	}
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public void guardar(@RequestBody Estudiante estudiante) {
		this.iEstudianteService.agregar(estudiante);
	}
}
