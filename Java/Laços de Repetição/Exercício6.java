package la�os_de_repeti��o;

import java.util.Scanner;

public class Exerc�cio6 {

	public static void main(String[] args) {
		int numero, contador = 0, soma = 0;
		Scanner leia = new Scanner (System.in);
		do {
			System.out.println("Digite um n�mero: ");
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
		System.out.println("A m�dia dos m�ltiplos de 3 � " + (soma/contador));
		leia.close();
	}

}
