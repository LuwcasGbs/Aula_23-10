package Polmorfismo_23_10.ex3;

public class Main {

	public static void main(String[] args) {
		Livro livro = new Livro("Coraline","Neil Gaiman");
		Biblioteca bi = new Biblioteca ("Biblioteca da Meia Noite", livro);

		System.out.println("O livro "+livro.getTitulo()+" do autor "+livro.getAutor()+", é vendido na "+bi.getNome());
	}

}
