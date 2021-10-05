package br.com.generation.condicional;

import java.util.Scanner;
import java.math.*;

public class Exercício4 {

	public static void main(String[] args) {
		double numero, raiz, quadrado;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		raiz = Math.sqrt(numero);
		quadrado = Math.pow(numero,2);
		if (numero % 2 == 0) {
			System.out.println("O " + numero + " é par, a raiz quadrada é " + raiz);
		}
		else if (numero % 2 != 0) {
			System.out.println("O " + numero + " é impar, elevado ao quadrado é " + quadrado);
		leia.close();
		}
	}
}
