package Polmorfismo_23_10.ex2;

public class Cliente {
	private String nome;
	private ContaBancaria conta;
	public Cliente(String nome, ContaBancaria conta) {
		super();
		this.nome = nome;
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
