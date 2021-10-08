package herança;

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
		
		System.out.println("O nome do cachorro é " + novoDog.getNome() + ".");
		System.out.println("A idade do cachorro é " + novoDog.getIdade() + " anos.");
		
		System.out.println();
		novoDog.correr();;
		novoDog.emitirSom();
		
		System.out.println();
		
		System.out.println("Digite o nome do Cavalo: ");
		novoHorse.setNome(leia.next());
		
		System.out.println("Digite a idade do Cavalo: ");
		novoHorse.setIdade(leia.nextInt());
		
		System.out.println();
		
		System.out.println("O nome do cavalo é " + novoHorse.getNome() + ".");
		System.out.println("A idade do cavalo é " + novoHorse.getIdade() + " anos.");
		
		System.out.println();
		
		novoHorse.correr();
		novoHorse.emitirSom();
		
		System.out.println();
		
		System.out.println("Digite o nome da Preguiça: ");
		novaPreg.setNome(leia.next());
		
		System.out.println("Digite a idade da Preguiça: ");
		novaPreg.setIdade(leia.nextInt());
		
		System.out.println();
		 
		System.out.println("O nome da preguiça é " + novaPreg.getNome() + ".");
		System.out.println("A idade da preguiça é " + novaPreg.getIdade() + " anos.");
		
		System.out.println();

		novaPreg.subirArvore();
		novaPreg.emitirSom();
				
		leia.close();
	}
}
