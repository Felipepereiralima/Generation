package classes;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	private String cidade;
	private String estado;
	
	void compra() {
		System.out.println("O cliente " + nome + " est� comprando.");
	}
	void paga() {
		System.out.println("O cliente " + nome + " est� pagando.");
	}
	void come () {
		System.out.println("O cliente " + nome + " est� comendo.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
