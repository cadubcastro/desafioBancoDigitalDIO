package br.com.cadubcastro.bancoDigital.banco;
import br.com.cadubcastro.bancoDigital.cliente.Cliente;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1515;
	private static int SEQUENCIAL = 1;
	
	private Cliente cliente;
	private int agencia;
	private int numero;	
	private double saldo;
	
	public Conta(Cliente cliente) {
		
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = Conta.SEQUENCIAL++;
		
		this.cliente = cliente;
	}
	

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;		
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirItensComuns() {
		System.out.println(String.format("Cliente: %s ", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d ", this.agencia));
		System.out.println(String.format("Numero: %d ", this.numero));
		System.out.println(String.format("Saldo: %.2f ", this.saldo));
	}
}