package Polmorfismo_23_10.ex1;

public class Navio extends Brinquedo{
	public Navio(String cor,String tipo,int velocidade,String nome) {
		super(cor,tipo,velocidade,nome);
	}
	@Override
	public void Mover() {
		System.out.println("O navio está se movendo");
	}
}

