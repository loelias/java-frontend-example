package br.com.projuris.Interfaces;

import java.util.List;
import br.com.projuris.Entities.*;

public interface Calculo {
	
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios);
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios);
}