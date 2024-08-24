package br.com.cadubcastro.bancoDigital.banco;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	public void imprimeRelatorioClientes() {
		System.out.println("== " + this.nome +" ==");
		System.out.println("=== lista de clientes ===");
		for(Conta conta : contas) {
			System.out.println("Nome: " + conta.getCliente().getNome());			
		}
		System.out.println("=========================");
	}
	
	public void imprimeRelatórioContasSaldoMaior1000() {
		for(Conta conta : contas) {
			if(conta.getSaldo() > 1000.0) {
				System.out.println("Nome: " + conta.getCliente().getNome() + 
						" Número: " + conta.getNumero() + 
						" Saldo R$: " + conta.getSaldo());
			}			
		}
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}