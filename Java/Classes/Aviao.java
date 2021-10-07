package classes;

public class Aviao {
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	
	void liga() {
		System.out.println("Ligando os motores...");
	}
	void acelera() {
		System.out.println("O avi�o est� acelerando...");
	}
	void decola() {
		System.out.println("O avi�o est� decolando...");
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}

