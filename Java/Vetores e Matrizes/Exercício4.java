package vetores_e_matrizes;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		double [][] tabela = new double [3][3];
		int linha, coluna;
		double soma = 0, diagonal = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for(linha = 0; linha < tabela.length; linha++) {
			for(coluna = 0; coluna < tabela[linha].length; coluna++) {
				System.out.println("Posi��o: [ " + (linha+1) + " ][ " + (coluna+1) + " ]: ");
				tabela[linha][coluna]= leia.nextDouble();
				soma += tabela[linha][coluna];
				diagonal = tabela[0][0] + tabela[1][1] + tabela[2][2];
			}
		}
		System.out.println("A soma total da matriz � de: " + soma);
		System.out.println("A soma da diagonal �: " + diagonal);
	}
}
