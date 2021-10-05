package br.com.generation.aula01;

import java.util.Scanner;

import java.math.*;

public class Exercício6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, y1, x2, y2, distancia, raiz;
		
		System.out.println("Qual é o x1? ");
		x1 = leia.nextDouble();
		
		System.out.println("Qual é o x2? ");
		x2 = leia.nextDouble();
		
		System.out.println("Qual é o y1? ");
		y1 = leia.nextDouble();

		System.out.println("Qual é o y2? ");
		y2 = leia.nextDouble();
		
		System.out.println("P1(" + x1 + "," + y1 + ")");
		System.out.println("P2(" + x2 + "," + y2 + ")");
		
		distancia = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		raiz = Math.sqrt(distancia);
		System.out.println("A distância entre os dois pontos é " + raiz);
		
		leia.close();
		
	}
}
