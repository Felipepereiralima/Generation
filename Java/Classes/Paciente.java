package classes;

public class Paciente {
	private String nome;
	private String tipoSanguineo;
	private int idade;
	
	void anda () {
		System.out.println("O paciente est� andando...");
	}
	void tiraSangue() {
		System.out.println("O paciente est� tirando sangue...");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
