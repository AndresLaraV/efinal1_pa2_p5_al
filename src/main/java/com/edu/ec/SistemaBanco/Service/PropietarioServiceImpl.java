package com.edu.ec.SistemaBanco.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.ec.SistemaBanco.Repository.IPropietarioRepository;
import com.edu.ec.SistemaBanco.Repository.Modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	@Autowired
	IPropietarioRepository iPropietarioRepository;

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.seleccionar(cedula);
	}

	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(propietario);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(cedula);
	}

}
