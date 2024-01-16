package com.edu.ec.SistemaBanco.Repository;

import org.springframework.stereotype.Repository;

import com.edu.ec.SistemaBanco.Repository.Modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PropietarioRepositoryImpl implements IPropietarioRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Propietario seleccionar(String cedula) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietario.class, cedula);
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propie = this.seleccionar(cedula);
		this.entityManager.remove(propie);
	}

}
