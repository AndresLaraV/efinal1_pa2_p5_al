package com.edu.ec.SistemaBanco.Repository;

import com.edu.ec.SistemaBanco.Repository.Modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	public CuentaBancaria seleccionar(String numeroCuenta);

	public void insertar(CuentaBancaria cuentaBancaria);

	public void actualizar(CuentaBancaria cuentaBancaria);

	public void eliminar(String numeroCuenta);

	
}
