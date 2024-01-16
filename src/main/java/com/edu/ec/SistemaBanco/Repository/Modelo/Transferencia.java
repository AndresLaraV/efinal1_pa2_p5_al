package com.edu.ec.SistemaBanco.Repository.Modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "transferencia")
public class Transferencia {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transfer")
	@SequenceGenerator(name = "seq_transfer", sequenceName = "seq_transfer", allocationSize = 1)
	@Column(name = "tranfer_id")
	private Integer id;

	@Column(name = "tranfer_fecha")
	private LocalDate fechaTransfer;

	@Column(name = "tranfer_Origen")
	private String ctaOrigen;

	@Column(name = "tranfer_Destino")
	private String ctadestino;

	@Column(name = "tranfer_saldo")
	private BigDecimal saldo;

	// Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFechaTransfer() {
		return fechaTransfer;
	}

	public void setFechaTransfer(LocalDate fechaTransfer) {
		this.fechaTransfer = fechaTransfer;
	}

	public String getCtaOrigen() {
		return ctaOrigen;
	}

	public void setCtaOrigen(String ctaOrigen) {
		this.ctaOrigen = ctaOrigen;
	}

	public String getCtadestino() {
		return ctadestino;
	}

	public void setCtadestino(String ctadestino) {
		this.ctadestino = ctadestino;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

}
