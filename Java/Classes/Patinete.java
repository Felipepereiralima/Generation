package classes;

public class Patinete {
	private String marca;
	private String modelo;
	private String cor;
	
	void patina() {
		System.out.println("O patinete está patinando...");
	}
	void acelerando() {
		System.out.println("O patinete está acelerando...");
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
