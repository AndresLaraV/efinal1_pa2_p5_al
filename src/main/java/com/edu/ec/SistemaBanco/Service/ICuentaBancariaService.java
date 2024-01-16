package com.edu.ec.SistemaBanco.Service;

import com.edu.ec.SistemaBanco.Repository.Modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	public CuentaBancaria buscar(String numeroCuenta);

	public void guardar(CuentaBancaria cuentaBancaria);

	public void actualizar(CuentaBancaria cuentaBancaria);

	public void borrar(String numeroCuenta);
	
	
}
