package Polmorfismo_23_10.ex1;

public class Moto extends Brinquedo{
	public Moto(String cor,String tipo,int velocidade,String nome) {
		super(cor,tipo,velocidade,nome);
	}
	@Override
	public void Mover() {
		System.out.println("A moto está se movendo");
	}
}

