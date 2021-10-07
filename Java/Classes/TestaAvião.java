package classes;

import java.util.Scanner;

public class TestaAvi�o {

	public static void main(String[] args) {
		Aviao novoAviao = new Aviao();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o fabricante do avi�o: ");
		novoAviao.setFabricante(leia.next());
		
		System.out.println("Digite o modelo do avi�o: ");
		novoAviao.setModelo(leia.next());
		
		System.out.println("Digite a cor do avi�o: ");
		novoAviao.setCor(leia.next());
		
		System.out.println("Digite o ano do avi�o: ");
		novoAviao.setAno(leia.nextInt());
		System.out.println();
		
		System.out.println("Fabricante: " + novoAviao.getFabricante());
		System.out.println("Modelo: " + novoAviao.getModelo());
		System.out.println("Cor: " + novoAviao.getCor());
		System.out.println("Ano: " + novoAviao.getAno());
		System.out.println();
		
		novoAviao.liga();
		
		novoAviao.acelera();
		
		novoAviao.decola();
		
		leia.close();
	}
}
