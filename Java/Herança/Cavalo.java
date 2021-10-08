package herança;

public class Cavalo extends Animal{
	private String nome;
	private int idade;
	
	void correr() {
		System.out.println("O cavalo está correndo...");
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
