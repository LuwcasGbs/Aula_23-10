package Polmorfismo_23_10.ex2;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("456789876543234",1200.88);
		Cliente cliente = new Cliente("Lucas",conta);
		
		System.out.println("A conta de número "+conta.getNumero()+", do cliente "+cliente.getNome()+" tem "+conta.getSaldo()+" de saldo.");
	}

}
