package com.edu.ec.SistemaBanco.Repository;

import com.edu.ec.SistemaBanco.Repository.Modelo.Propietario;

public interface IPropietarioRepository {
	public Propietario seleccionar(String cedula);

	public void insertar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void eliminar(String cedula);
}
