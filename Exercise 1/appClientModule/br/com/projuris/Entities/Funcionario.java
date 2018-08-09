package br.com.projuris.Entities;

import java.math.BigDecimal;

public class Funcionario {
	
	private String cargo;
	private String departamento;
	private BigDecimal salario;
	
	public Funcionario(String cargo, String departamento, BigDecimal salario) {
		this.cargo = cargo;
		this.departamento = departamento;
		this.setSalario(salario);
	}

	// getters e setters;
	
	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public BigDecimal getSalario() {
		return this.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}