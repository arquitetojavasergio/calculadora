package com.example.demo;

public class CalculadoraService {

	public CalculadoraModel executar(CalculadoraModel input) {
		switch (input.getOperacao()) {
		case SOMAR:		
			input.setResultado(input.getNumero1() + input.getNumero2());
			break;
		case SUBTRAIR:		
			input.setResultado(input.getNumero1() - input.getNumero2());
			break;
		case MULTIPLICAR:		
			input.setResultado(input.getNumero1() * input.getNumero2());
			break;
		case DIVIDIR:		
			input.setResultado(input.getNumero1() / input.getNumero2());
			break;
		default:
			break;
		}
		
		return input;
	}
}
