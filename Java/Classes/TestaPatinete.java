package classes;

import java.util.Scanner;

public class TestaPatinete {

	public static void main(String[] args) {
		Patinete novoPatinete = new Patinete();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a marca do patinete: ");
		novoPatinete.setMarca(leia.next());
		
		System.out.println("Digite o modelo do patinete: ");
		novoPatinete.setModelo(leia.next());
		
		System.out.println("Digite a cor do patinete: ");
		novoPatinete.setCor(leia.next());
		
		System.out.println();
		
		System.out.println("Marca: " + novoPatinete.getMarca());
		System.out.println("Modelo: " + novoPatinete.getModelo());
		System.out.println("Cor: " + novoPatinete.getCor());
		System.out.println();
		
		novoPatinete.patina();
		novoPatinete.acelerando();
		leia.close();
	}
}
