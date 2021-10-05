package br.com.generation.repetição;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		int numero, contador = 1, contaPar = 0, contaImpar = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for (contador = 1; contador <= 10; contador++) {
		
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				contaPar++;
			}
			else if (numero %2 == 1) {
				contaImpar++;
			}
		}
		System.out.println("A quantidade de números pares é "+ contaPar + ".");
		System.out.println("A quantidade de números ímpares é "+ contaImpar + ".");
		leia.close();
	}
}
