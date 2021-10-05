package br.com.generation.aula01;

import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
		int a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de c: ");
		c = leia.nextInt();
				
		System.out.println("Digite o valor de d: ");
		d = leia.nextInt();
		
		System.out.println("Digite o valor de e: ");
		e = leia.nextInt();
				
		System.out.println("Digite o valor de f: ");
		f = leia.nextInt();
		
		x = ((c*e)-(b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));
		
		System.out.println("O valor de x = " + x);
		System.out.println("O valor de y = " + y);		
		
		leia.close();
		
	}
}