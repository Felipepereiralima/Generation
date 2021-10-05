package br.com.generation.repetição;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		int numero, soma = 0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			soma+= numero;
		}
		while (numero != 0);
		System.out.println("A soma dos números digitados é " + soma + ".");
		leia.close();
	}

}
