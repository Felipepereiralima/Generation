package br.com.generation.aula01;

import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, imposto = 0.45, taxaDistribuidor = 0.28;
		
		System.out.println("Qual o custo de fábrica em R$? ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = (custoFabrica + (custoFabrica*taxaDistribuidor) + (custoFabrica*imposto));
		
		System.out.println("O custo do consumidor e R$ " + custoConsumidor);
		
		leia.close();
	}
}
