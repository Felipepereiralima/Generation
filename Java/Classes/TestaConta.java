package classes;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		Conta novaConta = new Conta();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o banco: ");
		novaConta.setBanco(leia.next());
		
		System.out.println("Digite a conta: ");
		novaConta.setConta(leia.next());;
		
		System.out.println("Digite a agência: ");
		novaConta.setAgencia(leia.nextInt());
		System.out.println();
		
		System.out.println("Banco: " + novaConta.getBanco());
		System.out.println("Conta: " + novaConta.getConta());
		System.out.println("Agência: " + novaConta.getAgencia());
		System.out.println();
		
		novaConta.depositar();
		novaConta.sacar();
		
		leia.close();
	}

}
