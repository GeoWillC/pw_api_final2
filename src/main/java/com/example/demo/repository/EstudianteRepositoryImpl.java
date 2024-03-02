package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante seleccionar(Integer id) {
		// TODO Auto-generated method stub

		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public List<Estudiante> seleccionarTodo() {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query = this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class);

		return query.getResultList();
	}

}
