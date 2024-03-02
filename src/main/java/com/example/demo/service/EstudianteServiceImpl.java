package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public void agregar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public List<EstudianteTO> buscarEstudiantes() {
		// TODO Auto-generated method stub
		List<Estudiante> lista = this.estudianteRepository.seleccionarTodo();
		List<EstudianteTO> listaTO = new ArrayList<>();
		for (Estudiante est : lista) {
			listaTO.add(convertir(est));
		}
		return listaTO;
	}

	private EstudianteTO convertir(Estudiante est) {
		EstudianteTO estTo = new EstudianteTO();
		estTo.setApellido(est.getApellido());
		estTo.setId(est.getId());
		estTo.setNombre(est.getNombre());
		estTo.setCedula(est.getCedula());
		return estTo;
	}

}
