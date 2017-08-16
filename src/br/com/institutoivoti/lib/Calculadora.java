package br.com.institutoivoti.lib;

public class Calculadora {
	private double resultado;
	private int operacoes;
	
	public Calculadora() {
		this.operacoes = 0;
	}
	
	public Calculadora(double valor) {
		this.operacoes = 0;
		this.resultado = valor;
	}
	
	private void incrementaOperacao() {
		this.operacoes += 1;
	}
	
	public int getOperacoes() {
		return this.operacoes;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	public double Somar(double valor) {
		this.incrementaOperacao();
		return this.resultado += valor;
	}
	
	public double Subtrair(double valor) {
		this.incrementaOperacao();
		return this.resultado -= valor;
	}
	
	public double Dividir(double valor) {
		this.incrementaOperacao();
		return this.resultado /= valor;
	}
	
	public double Multiplicar(double valor) {
		//this.incrementaOperacao();
		return this.resultado *= valor;
	}
	
}

