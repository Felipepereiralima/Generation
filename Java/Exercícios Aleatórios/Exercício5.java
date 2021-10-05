package br.com.generation.aula01;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media, soma;
		
		System.out.println("Digite o valor da nota 1: ");
		
		nota1 = leia.nextDouble();
		
		System.out.println("Digite o valor da nota 2: ");
		
		nota2 = leia.nextDouble();
		
		System.out.println("Digite o valor da nota 3: ");
		
		nota3 = leia.nextDouble();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
		
		System.out.println("A média ponderada é de " + media);
		
		leia.close();
		
	}
}
