package com.edu.ec.SistemaBanco.Repository;

import org.springframework.stereotype.Repository;

import com.edu.ec.SistemaBanco.Repository.Modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public CuentaBancaria seleccionar(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, numeroCuenta);
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaBanc = this.seleccionar(numeroCuenta);
		this.entityManager.remove(ctaBanc);
	}

	

}
