package laços_de_repetição;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		int numero, contador = 0, soma = 0;
		Scanner leia = new Scanner (System.in);
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if (numero % 3 == 0) {
				contador++;
				soma+= numero;
			}
			if (numero == 0) {
				contador--;
			}
		}
		while(numero != 0);
		System.out.println("A média dos múltiplos de 3 é " + (soma/contador));
		leia.close();
	}

}
