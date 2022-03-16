package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		if (desempenho == Desempenho.A_DESEJAR) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			funcionario.reajustaSalario(reajuste);
		} else if (desempenho == Desempenho.BOM) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
			funcionario.reajustaSalario(reajuste);
		} else if (desempenho == Desempenho.OTIMO) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.3"));
			funcionario.reajustaSalario(reajuste);
		}
	}
}
