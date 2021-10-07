package classes;

import java.util.Scanner;

public class TestaPaciente {

	public static void main(String[] args) {
		Paciente novoPaciente = new Paciente();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do paciente: ");
		novoPaciente.setNome(leia.next());
		
		System.out.println("Digite o tipo sangu�neo: ");
		novoPaciente.setTipoSanguineo(leia.next());
		
		System.out.println("Digite a idade do paciente: ");
		novoPaciente.setIdade(leia.nextInt());
		
		System.out.println();
		
		System.out.println("Nome: " + novoPaciente.getNome());
		System.out.println("Tipo sangu�neo: " + novoPaciente.getTipoSanguineo());
		System.out.println("Idade: " + novoPaciente.getIdade());
		System.out.println();
		
		novoPaciente.anda();
		novoPaciente.tiraSangue();
		leia.close();
	}

}
