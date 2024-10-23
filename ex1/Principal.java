package Polmorfismo_23_10.ex1;

public class Principal {

	public static void main(String[] args) {
		Carro c = new Carro("amarelo","de fricção",12,"Hotweels");
		Moto m = new Moto("vermelho","mini vespa",5,"Vespinha");
		Navio n = new Navio("azul","de papel",1,"Titanic");
		
		System.out.println("----------CARRO----------");
		System.out.println(c.getCor());
		System.out.println(c.getTipo());
		System.out.println(c.getVelocidade()+"km/h");
		System.out.println(c.getNome());
		c.Mover();

		System.out.println("----------MOTO----------");
		System.out.println(m.getCor());
		System.out.println(m.getTipo());
		System.out.println(m.getVelocidade()+"km/h");
		System.out.println(m.getNome());
		m.Mover();
		
		System.out.println("----------NAVIO----------");
		System.out.println(n.getCor());
		System.out.println(n.getTipo());
		System.out.println(n.getVelocidade()+"km/h");
		System.out.println(n.getNome());
		n.Mover();
	}

}
