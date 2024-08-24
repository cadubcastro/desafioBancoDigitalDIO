package br.com.cadubcastro.bancoDigital.banco;
import br.com.cadubcastro.bancoDigital.cliente.Cliente;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	private double rentabilidade;
	
	@Override
	public void imprimirExtrato() {
		System.out.println("+++ Extrato Conta Popança +++");
		imprimirItensComuns();
	}
}