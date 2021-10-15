package collections4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaLoja {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		List<Loja> produtos = new ArrayList<>();
	
		char pergunta = 'S';
		char resposta;
	
		System.out.println("================Atacadão Lima================");
	
		while (pergunta == 'S'){
			
			System.out.println("Quantos produtos deseja inserir? ");
			int quantidadeDeProdutos = leia.nextInt();
		
			for(int i = 0; i < quantidadeDeProdutos; i++) {
				System.out.println("Qual o nome do produto? ");
				String Produtos = leia.next();
				
				System.out.println("Qual a quantidade do produto? ");
				int quantidade = leia.nextInt();

				produtos.add(new Loja(Produtos, quantidade));		
			}
			System.out.println("Deseja inserir novos produtos [S/N]?");
			pergunta = leia.next().charAt(0);	
		}
		System.out.println("Deseja remover um produto da lista [S/N]? ");
		resposta = leia.next().charAt(0);
		
		if (resposta == 'S') {
			//Indicar qual é o índice do produto para remover.
			System.out.println("Quer remover qual produto da lista [índice]?");
			Loja Produtos = produtos.remove(leia.nextInt()-1);
		}
		
		System.out.println("----------------------------------------------");
		
		for(Loja i : produtos) {
			System.out.println(i);
		}

	leia.close();
	}
}
