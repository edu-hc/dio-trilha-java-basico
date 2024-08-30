package com.conta.banco;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número da conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Digite a agência: ");
		String agencia = scanner.next();

		System.out.println("Digite o seu nome: ");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite o seu saldo: ");
		Double saldoCliente = scanner.nextDouble();
		
		scanner.close();
		
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldoCliente + " já está disponível para saque.");
		
		
		
	}

}
