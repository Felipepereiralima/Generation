package br.com.generation.repeti��o;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		int idade = 0, menor = 0, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.println("Qual a sua idade? ");
			
			idade = leia.nextInt();
			
			if (idade < 21 && idade > 0) {
				menor++;	
			}
			else if (idade > 50) {
				maior++;
			}

		}
		System.out.println("O total de pessoas com idade abaixo de 21 � " + menor+ ".");
		System.out.println("O total de pessoas com idade acima de 50 � " + maior + ".");
		
		leia.close();
	}
}
