package vetores_e_matrizes;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		double[][] N1 = new double [4][6];
		double[][] N2 = new double [4][6];
		double[][] M1 = new double [4][6];
		double[][] M2 = new double [4][6];
		int soma = 0, linha, coluna;
		Scanner leia = new Scanner(System.in);		
		
		for(linha = 0; linha < N1.length; linha++) {
			for(coluna = 0; coluna < N1[linha].length; coluna++) {
				System.out.println("Digite o valor da posição [" + (linha+1) + "][" + (coluna+1) + "] da N1: ");
				N1[linha][coluna]= leia.nextDouble();
			}
		}
		for(linha = 0; linha < N2.length; linha++) {
			for(coluna = 0; coluna < N2[linha].length; coluna ++) {
				System.out.println("Digite o valor da posição [" + (linha+1) + "][" + (coluna+1) + "] da N2: ");
				N2[linha][coluna] = leia.nextDouble();
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}
		System.out.println("\nM1 =");
		for(linha = 0; linha < M1.length; linha++) {
			for(coluna = 0; coluna < M1[linha].length; coluna++) {
				System.out.print("[ " + M1[linha][coluna] + " ]" );
			}
			System.out.println();
		}
		System.out.println("\nM2 = ");
		for(linha = 0; linha < M2.length; linha++) {
			for(coluna = 0; coluna < M2[linha].length; coluna++) {
				System.out.print("[ "+ M2[linha][coluna]+ " ]");
			}
			System.out.println();
			leia.close();
		}
	}
}
