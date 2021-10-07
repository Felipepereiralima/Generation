package classes;

public class Conta {
	private String banco;
	private String conta;
	private int agencia;
	
	void depositar() {
		System.out.println("Você está depositando...");
	}
	void sacar() {
		System.out.println("Você está sacando...");
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
}
