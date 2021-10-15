package collections4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaLoja {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		List<Loja> produtos = new ArrayList<>();
	
		String pergunta = "Sim";
	
		System.out.println("================Atacadão Lima================");
	
		while (pergunta == "Sim"){
			
			System.out.println("Quantos produtos deseja inserir? ");
			int quantidadeDeProdutos = leia.nextInt();
		
			for(int i = 0; i < quantidadeDeProdutos; i++) {
				System.out.println("Qual o nome do produto? ");
				String Produtos = leia.next();
				
				System.out.println("Qual a quantidade do produto? ");
				int quantidade = leia.nextInt();

				produtos.add(new Loja(Produtos, quantidade));		
			}
			System.out.println("Deseja inserir novos produtos?");
			pergunta = leia.next();
		}
		//Indicar qual é o índice do produto para remover.
		System.out.println("Deseja remover qual produto da lista [índice]?");
		Loja Produtos = produtos.remove(leia.nextInt());
		
		System.out.println("----------------------------------------------");
		
		for(Loja i : produtos) {
			System.out.println(i);
		}

	leia.close();
	}
}
