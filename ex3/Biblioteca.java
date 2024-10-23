package Polmorfismo_23_10.ex3;

public class Biblioteca {
	private String nome;
	private Livro livro;
	
	public Biblioteca(String nome, Livro livro) {
		super();
		this.nome = nome;
		this.livro = livro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public void ExibirInfo() {
		System.out.println("Nsei");
	}
}
