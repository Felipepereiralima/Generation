package br.com.generation.repetição;

public class Exercício1 {

	public static void main(String[] args) {
		int contador, divisao;
		for(contador = 1000; contador <= 1999; contador++) {
			divisao = contador % 11;
			if (divisao == 5) {
				System.out.println(contador);
			}
		}
	}
}
