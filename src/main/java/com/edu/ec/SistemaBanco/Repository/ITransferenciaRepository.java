package com.edu.ec.SistemaBanco.Repository;

import com.edu.ec.SistemaBanco.Repository.Modelo.Transferencia;

public interface ITransferenciaRepository {
	public Transferencia seleccionar(String numCuenta);

	public void actualizar(Transferencia transferencia);
}
