package br.com.generation.aula01;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos, segundostot, diferen�a;
		
		System.out.println("Qual o tempo de dura��o de um evento da f�brica em segundos? ");
		Scanner leia = new Scanner(System.in);
		
		segundostot = leia.nextInt();
		
		diferen�a = segundostot % (60*60);
		
		segundos = diferen�a % 60;
		
		horas = ((segundostot - diferen�a) / (60*60));
		
		minutos = ((diferen�a - segundos) / 60);
		
		System.out.println("A dura��o do evento � de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		leia.close();
	}

}
