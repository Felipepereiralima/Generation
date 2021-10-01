package br.com.generation.aula01;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias, totalDias;
		
		System.out.println("Digite quantos você ja viveu: ");
		totalDias = leia.nextInt();
		
		idadeAnos = totalDias / 365;
		
		idadeMeses = (totalDias % 365) / 30;
		
		idadeDias = (totalDias % 365) % 30;
		
		System.out.println("A idade de anos é " + idadeAnos);
		System.out.println("A idade de meses é " + idadeMeses);
		System.out.println("A idade em dias é " + idadeDias);
		
		leia.close();
		
	}

}
