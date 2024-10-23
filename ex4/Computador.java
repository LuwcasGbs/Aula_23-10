package Polmorfismo_23_10.ex4;

public class Computador {
	private String modelo;
	private Processador processador;
	public Computador(String modelo, String processador) {
		this.modelo = modelo;
		this.processador = new Processador("gamer","intel");
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void getProcessador() {
		System.out.println(processador.getFrequencia()+"\n"+processador.getMarca());
	}
	public void ExibirInfo() {
		System.out.println("Informações e tals..");
	}
	
}