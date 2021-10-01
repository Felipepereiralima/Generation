package br.com.generation.aula01;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos, segundostot, diferença;
		
		System.out.println("Qual o tempo de duração de um evento da fábrica em segundos? ");
		Scanner leia = new Scanner(System.in);
		
		segundostot = leia.nextInt();
		
		diferença = segundostot % (60*60);
		
		segundos = diferença % 60;
		
		horas = ((segundostot - diferença) / (60*60));
		
		minutos = ((diferença - segundos) / 60);
		
		System.out.println("A duração do evento é de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		leia.close();
	}

}
