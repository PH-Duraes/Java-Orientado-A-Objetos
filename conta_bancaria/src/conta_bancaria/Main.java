package conta_bancaria;

public class Main {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Durães");
		Conta cc = new ContaCorrente(paulo);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(paulo);
		cc.transferir(50, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Cliente anderson = new Cliente();
		anderson.setNome("Anderson Tavares");
		Conta cc1 = new ContaCorrente(anderson);
		cc1.depositar(80);
		cc1.imprimirExtrato();
		
	}

}
