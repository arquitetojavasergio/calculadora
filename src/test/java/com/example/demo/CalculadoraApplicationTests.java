package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.CalculadoraModel.Operacao;

@SpringBootTest
class CalculadoraApplicationTests {

	@Test
	void test_somar() {
		
		var input = new CalculadoraModel();
		input.setNumero1(10);
		input.setNumero2(20);
		input.setOperacao(Operacao.SOMAR);
		
		var service = new CalculadoraService();
		var result = service.executar(input);
		
		assertEquals(result.getResultado(), 30);
	}
	
	@Test
	void test_subtrair() {
		
		var input = new CalculadoraModel();
		input.setNumero1(30);
		input.setNumero2(20);
		input.setOperacao(Operacao.SUBTRAIR);
		
		var service = new CalculadoraService();
		var result = service.executar(input);
		
		assertEquals(result.getResultado(), 10);
	}
	
	@Test
	void test_multiplicar() {
		
		var input = new CalculadoraModel();
		input.setNumero1(10);
		input.setNumero2(2);
		input.setOperacao(Operacao.MULTIPLICAR);
		
		var service = new CalculadoraService();
		var result = service.executar(input);
		
		assertEquals(result.getResultado(), 20);
	}

	@Test
	void test_dividir() {
		
		var input = new CalculadoraModel();
		input.setNumero1(100);
		input.setNumero2(2);
		input.setOperacao(Operacao.DIVIDIR);
		
		var service = new CalculadoraService();
		var result = service.executar(input);
		
		assertEquals(result.getResultado(), 50);
	}
}
