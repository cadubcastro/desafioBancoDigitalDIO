package br.com.cadubcastro.bancoDigital.banco;
import br.com.cadubcastro.bancoDigital.cliente.Cliente;

public class ContaCorrente extends Conta {
	
	private double limite;
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.limite = 100.0;
	}

	public void sacar(double valor) {
		
		if(valor > ( super.getSaldo() + this.limite)) {
			System.out.println("Saldo indisponível");
		} else {
			super.sacar(valor);
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("------------------------------");
		System.out.println("=== Extrato Conta Corrente ===");
		imprimirItensComuns();
		System.out.println("------------------------------");
	}
}