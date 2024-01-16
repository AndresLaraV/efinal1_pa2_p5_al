package com.edu.ec.SistemaBanco.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.ec.SistemaBanco.Repository.ICuentaBancariaRepository;
import com.edu.ec.SistemaBanco.Repository.Modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	ICuentaBancariaRepository iCuentaBancariaRepository;

	@Override
	public CuentaBancaria buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.iCuentaBancariaRepository.seleccionar(numeroCuenta);
	}

	@Override
	public void guardar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.insertar(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public void borrar(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.eliminar(numeroCuenta);
	}

}
