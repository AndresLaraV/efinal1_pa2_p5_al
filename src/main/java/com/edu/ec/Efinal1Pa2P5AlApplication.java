package com.edu.ec;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.edu.ec.SistemaBanco.Repository.Modelo.CuentaBancaria;
import com.edu.ec.SistemaBanco.Repository.Modelo.Propietario;
import com.edu.ec.SistemaBanco.Service.ICuentaBancariaService;
import com.edu.ec.SistemaBanco.Service.IPropietarioService;

@SpringBootApplication
public class Efinal1Pa2P5AlApplication implements CommandLineRunner {

	@Autowired
	ICuentaBancariaService iCuentaBancariaService;

	@Autowired
	IPropietarioService iPropietarioService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Cuenta Bancaria 1
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumeroCuenta("1234");
		cuenta1.setTipo("Ahorros");
		cuenta1.setSaldo(new BigDecimal(300));
		Propietario propie1 = new Propietario();
		propie1.setCedula("1722121835");
		propie1.setNombre("Andres");
		propie1.setApellido("Lara");
		this.iPropietarioService.guardar(propie1);
		System.out.println("Propietario registrado con éxito");
		this.iCuentaBancariaService.guardar(cuenta1);
		System.out.println("Cuenta1 creada con éxito");

		// Cuenta Bancaria 2
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumeroCuenta("4321");
		cuenta2.setTipo("Corriente");
		cuenta2.setSaldo(new BigDecimal(100));
		Propietario propie2 = new Propietario();
		propie2.setCedula("170498391");
		propie2.setNombre("Cecilia");
		propie2.setApellido("Viana");
		this.iPropietarioService.guardar(propie1);
		System.out.println("Propietario registrado con éxito");
		this.iCuentaBancariaService.guardar(cuenta2);
		System.out.println("Cuenta2 creada con éxito");

	}

}
