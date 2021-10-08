package herança;

public class Preguica extends Animal{
	private String nome;
	private int idade;
	
	void subirArvore() {
		System.out.println("A preguiça subiu na árvore.");
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
