package vetores_e_matrizes;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] vetor = new int [5];
		int contador, maior = 0;
		for(contador = 0; contador < 5; contador++) {
			System.out.println("Digite a pontua��o " + (contador+1) + "�: ");
			vetor[contador] = leia.nextInt();
			if (vetor[contador] > 0) {
				maior = vetor[contador];
			}
		}
		System.out.println("A maior pontua��o �: " + maior);
		leia.close();
	}
}
