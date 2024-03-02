package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
	// C
	public void insertar(Estudiante estudiante);
	// R
	public Estudiante seleccionar(Integer id);
	public List<Estudiante> seleccionarTodo();
	// U
	// D
}
