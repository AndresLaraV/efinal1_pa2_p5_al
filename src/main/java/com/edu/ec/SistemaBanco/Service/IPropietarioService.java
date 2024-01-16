package com.edu.ec.SistemaBanco.Service;

import com.edu.ec.SistemaBanco.Repository.Modelo.Propietario;

public interface IPropietarioService {
	public Propietario buscar(String cedula);

	public void guardar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void borrar(String cedula);
}
