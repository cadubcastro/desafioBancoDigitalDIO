import java.util.ArrayList;
import java.util.List;

import br.com.cadubcastro.bancoDigital.banco.Banco;
import br.com.cadubcastro.bancoDigital.banco.Conta;
import br.com.cadubcastro.bancoDigital.banco.ContaCorrente;
import br.com.cadubcastro.bancoDigital.banco.ContaPoupanca;
import br.com.cadubcastro.bancoDigital.cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco("Banco Digital");
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Cliente cliente1 = new Cliente("João");
		Cliente cliente2 = new Cliente("Maria");
		Cliente cliente3 = new Cliente("Pedro");
		Cliente cliente4 = new Cliente("José");
		Cliente cliente5 = new Cliente("Paulo");
		
		Conta cc1 = new ContaCorrente(cliente1);
		contas.add(cc1);
		
		Conta cc2 = new ContaCorrente(cliente2);
		contas.add(cc2);
		
		Conta cc3 = new ContaCorrente(cliente3);
		contas.add(cc3);
		
		
		
		Conta poupanca1 = new ContaPoupanca(cliente4);
		contas.add(poupanca1);
		
		Conta poupanca2 = new ContaPoupanca(cliente5);
		contas.add(poupanca2);
		
		banco.setContas(contas);
		
		
		
		
		cc1.sacar(50.0);
		cc2.depositar(100.0);
		cc2.transferir(60.0, cc1);
		
		
		cc1.imprimirExtrato();
		
		
		
		
		banco.imprimeRelatorioClientes();
		banco.imprimeRelatórioContasSaldoMaior1000();

	}
}