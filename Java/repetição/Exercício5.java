package br.com.generation.repeti��o;

import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {
		int numero, soma = 0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			soma+= numero;
		}
		while (numero != 0);
		System.out.println("A soma dos n�meros digitados � " + soma + ".");
		leia.close();
	}

}
