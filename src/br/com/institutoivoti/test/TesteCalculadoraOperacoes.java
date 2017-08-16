package br.com.institutoivoti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.institutoivoti.lib.Calculadora;

public class TesteCalculadoraOperacoes {
	
	@Test
	public void criaCalculadoraSemOperacoes() {
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.getOperacoes(), 0, 0);
	}
	
	@Test
	public void contaOperacoes() {
		Calculadora calculadora = new Calculadora();
		calculadora.Somar(10);
		calculadora.Somar(20);
		calculadora.Subtrair(15);
		assertEquals(calculadora.getOperacoes(), 3, 0);
	}

}
