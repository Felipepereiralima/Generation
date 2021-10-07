package classes;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente novoCliente = new Cliente();
			
		novoCliente.setNome("Felipe");
		novoCliente.setCpf("123.321.123-12");
		novoCliente.setIdade(29);
		novoCliente.setCidade("Paulínia");
		novoCliente.setEstado("São Paulo");
		
		System.out.println("Nome: " + novoCliente.getNome());
		System.out.println("CPF: " + novoCliente.getCpf());
		System.out.println("Idade: " + novoCliente.getIdade());
		System.out.print("Cidade: " + novoCliente.getCidade() + " ");
		System.out.println("UF: " + novoCliente.getEstado());
		System.out.println();
		
		novoCliente.compra();
		
		novoCliente.paga();
		
		novoCliente.come();
	}
}
