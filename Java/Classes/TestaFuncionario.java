package classes;

import java.util.Scanner;

public class TestaFuncionario {
	public static void main(String[] args) {
		
	Funcionario novoFuncionario = new Funcionario();
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o nome do funcionário: ");
	novoFuncionario.setNome(leia.next());
	
	System.out.println("Digite a idade: ");
	novoFuncionario.setIdade(leia.nextInt());
	
	System.out.println("Digite o sexo do funcionário: ");
	novoFuncionario.setSexo(leia.next());
	
	System.out.println();
	
	System.out.println("Nome: " + novoFuncionario.getNome());
	System.out.println("Idade: " + novoFuncionario.getIdade());
	System.out.println("Sexo: " + novoFuncionario.getSexo());
	System.out.println();
	
	novoFuncionario.trabalha();
	novoFuncionario.comendo();
	novoFuncionario.descansando();
	leia.close();
	
	}
}
