package Polmorfismo_23_10.ex1;

public class Carro extends Brinquedo{
	
	public Carro(String cor,String tipo,int velocidade,String nome) {
		super(cor,tipo,velocidade,nome);
	}
	
	@Override
	public void Mover() {
		System.out.println("O carro está se movendo");
	}
}
