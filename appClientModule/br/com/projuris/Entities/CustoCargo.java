package br.com.projuris.Entities;

import java.math.BigDecimal;

public class CustoCargo {
	
	private String cargo;
	private BigDecimal custo;
	
	// getters e setters;
	
	public CustoCargo(String cargo, BigDecimal custo) {
		this.cargo = cargo;
		this.custo = custo;
	}

	public String getCargo() {
		return this.cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public BigDecimal getCusto() {
		return this.custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}
	
	
}