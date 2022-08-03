package conta_bancaria;

public interface IConta {
	 void sacar(float valor) ;
	 
	 void depositar(float valor);
	 
	 void transferir(float valor, Conta contaDestino);
	 
	 void imprimirExtrato();
}
