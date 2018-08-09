package br.com.projuris;

import java.util.List;
import java.util.stream.Collectors;
import java.math.BigDecimal;

import br.com.projuris.Entities.*;

public class MyCalculo {

	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios){
		List<CustoCargo> custosDeCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargo,
                        Collectors.mapping(Funcionario::getSalario, Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))))
                .entrySet()
                .stream()
                .map(e2 -> new CustoCargo(e2.getKey(), e2.getValue()))
                .collect(Collectors.toList());
		return custosDeCargo;
	}
			
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios){
		List<CustoDepartamento> custosDeDepartamento = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento,
                        Collectors.mapping(Funcionario::getSalario, Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))))
                .entrySet()
                .stream()
                .map(e2 -> new CustoDepartamento(e2.getKey(), e2.getValue()))
                .collect(Collectors.toList());
		return custosDeDepartamento;
	}
	
}
