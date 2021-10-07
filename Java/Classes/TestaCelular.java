package classes;

import java.util.Scanner;

public class TestaCelular {

	public static void main(String[] args) {
		Celular novoCelular = new Celular();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o fabricante do celular: ");
		novoCelular.setMarca(leia.next());
		
		System.out.println("Digite o modelo do celular: ");
		novoCelular.setModelo(leia.next());
		
		System.out.println("Digite a cor do celular: ");
		novoCelular.setCor(leia.next());
		
		System.out.println("Digite o ano do celular: ");
		novoCelular.setAno(leia.nextInt());
		System.out.println();
		
		System.out.println("Fabricante: " + novoCelular.getMarca());
		System.out.println("Modelo: " + novoCelular.getModelo());
		System.out.println("Cor: " + novoCelular.getCor());
		System.out.println("Ano: " + novoCelular.getAno());
		System.out.println();
		
		novoCelular.carregando();
		
		novoCelular.liga();
		
		novoCelular.desliga();
		
		leia.close();
	}
}
