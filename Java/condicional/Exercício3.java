package br.com.generation.condicional;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantos anos você tem? ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Está na classificação infantil.");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Está na classificação juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Está na classificação adulto.");
		}		
		else if (idade >= 0 && idade <= 9 || idade > 25) {
			System.out.println("Está fora da classificação.");
		}
		leia.close();
	}

}
