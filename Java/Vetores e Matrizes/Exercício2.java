package vetores_e_matrizes;

import java.util.Random;

public class Exerc�cio2 {

	public static void main(String[] args) {
		int [] vetor = new int [10];
		Random random = new Random();
		int contador, maior = 0, conta = 0;
		double media, soma = 0.0;
		
		for (contador = 0; contador < 10; contador ++) {
			vetor[contador] = random.nextInt(6);
			System.out.println("O n�mero do dado � " + (vetor[contador]+1) + "\n");
			soma += vetor[contador];
			if (vetor[contador] >= maior) {
				maior = vetor[contador];
			}
		}
		for (contador = 0; contador < 10; contador ++) {
			if(vetor[contador] == maior) {
				conta++;
			}
		}
		media = soma/10;
		System.out.println("\nA m�dia dos n�meros somados � " + (media + 1) + ".");
		System.out.println("\nO maior n�mero foi " + (maior+1) + ", ele repetiu " + conta + " vezes.");

	}

}
