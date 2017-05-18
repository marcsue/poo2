package classes;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente CC = new ContaCorrente();
		ContaSalario CS = new ContaSalario();
		ContaPoupanca CP = new ContaPoupanca();
		ContaInvestimento CI = new ContaInvestimento();
		
		
		System.out.println("Conta Corrente:");
		CC.mostrar();
		System.out.println();
		
		System.out.println("Conta Salario:");
		CS.mostrar();
		System.out.println();
		
		System.out.println("Conta Poupanca:");
		CP.mostrar();
		System.out.println();
		
		System.out.println("Conta Investimento:");
		CI.mostrar();
		System.out.println();
		
		
		
	}

}
