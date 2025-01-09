package com.example.demo;

public class CalculadoraModel {

	private Integer numero1;
	private Integer numero2;
	private Operacao operacao;
	private Integer resultado;

	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	enum Operacao {
		SOMAR, SUBTRAIR, MULTIPLICAR, DIVIDIR,
	}
}
