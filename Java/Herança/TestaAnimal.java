package heran�a;

import java.util.Scanner;

public class TestaAnimal {

	public static void main(String[] args) {
		Cachorro novoDog = new Cachorro();
		Cavalo novoHorse = new Cavalo();
		Preguica novaPreg = new Preguica();
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite o nome do Cachorro: ");
		novoDog.setNome(leia.next());
		
		System.out.println("Digite a idade do Cachorro: ");
		novoDog.setIdade(leia.nextInt());
		
		System.out.println();
		
		System.out.println("O nome do cachorro � " + novoDog.getNome() + ".");
		System.out.println("A idade do cachorro � " + novoDog.getIdade() + " anos.");
		
		System.out.println();
		novoDog.correr();;
		novoDog.emitirSom();
		
		System.out.println();
		
		System.out.println("Digite o nome do Cavalo: ");
		novoHorse.setNome(leia.next());
		
		System.out.println("Digite a idade do Cavalo: ");
		novoHorse.setIdade(leia.nextInt());
		
		System.out.println();
		
		System.out.println("O nome do cavalo � " + novoHorse.getNome() + ".");
		System.out.println("A idade do cavalo � " + novoHorse.getIdade() + " anos.");
		
		System.out.println();
		
		novoHorse.correr();
		novoHorse.emitirSom();
		
		System.out.println();
		
		System.out.println("Digite o nome da Pregui�a: ");
		novaPreg.setNome(leia.next());
		
		System.out.println("Digite a idade da Pregui�a: ");
		novaPreg.setIdade(leia.nextInt());
		
		System.out.println();
		 
		System.out.println("O nome da pregui�a � " + novaPreg.getNome() + ".");
		System.out.println("A idade da pregui�a � " + novaPreg.getIdade() + " anos.");
		
		System.out.println();

		novaPreg.subirArvore();
		novaPreg.emitirSom();
				
		leia.close();
	}
}
