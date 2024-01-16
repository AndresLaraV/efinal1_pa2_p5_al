package com.edu.ec.SistemaBanco.Repository;

import org.springframework.stereotype.Repository;

import com.edu.ec.SistemaBanco.Repository.Modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrasnferenciaRepositoryImpl implements ITransferenciaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Transferencia seleccionar(String numCuenta) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, numCuenta);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(transferencia);
	}

}
