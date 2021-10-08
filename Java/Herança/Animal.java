package herança;

public class Animal {
	private String nome;
	private int idade;
	

	void corre() {
		System.out.println("O animal está correndo...");
	}
	void emitirSom() {
		System.out.println("O animal está emitindo som.");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
