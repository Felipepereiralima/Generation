package br.com.generation.aula01;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		
		d = (r + s)/2;
		
		System.out.println("O valor de R � " + r);
		System.out.println("O valor de S � " + s);
		System.out.println("O valor de D � " + d);
		
		leia.close();
	}

}
