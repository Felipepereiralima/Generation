package collections4;

public class Loja {
	private String produto;
	private int quantidade;
	
	
	public Loja(String produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String toString() {
		return "Nome do produto: " + this.produto + " | " + "Quantidade: " + this.quantidade;
	}

}
