package br.com.generation.aula01;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual a sua idade? ");
		anos = leia.nextInt();
		
		System.out.println("Quantos meses voc� tem? ");
		meses = leia.nextInt();
		
		System.out.println("Quantos dias voc� tem? ");
		dias = leia.nextInt();
		
		soma = ((anos * 365) + (meses * 30) + dias);
		
		System.out.println("Voc� tem " + soma + " dias de idade.");
	}
}
