package classes;

public class Celular {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	
	void carregando() {
		System.out.println("O celular est� carregando...");
	}
	void liga() {
		System.out.println("O celular est� ligando...");
	}
	void desliga() {
		System.out.println("O celular est� desligando...");
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
