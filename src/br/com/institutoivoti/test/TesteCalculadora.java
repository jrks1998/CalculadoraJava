package br.com.institutoivoti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.institutoivoti.lib.Calculadora;

public class TesteCalculadora {

	@Test
	public void somaNumerosInteiros() {
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2,3), 5,0);
	}
	
	@Test
	
	public void somaNumerosComVirgula() {
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2.33,6.59), 8.92,0);
	}

}
