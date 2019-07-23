package com.br.modelo;

import com.br.interfaces.ContaInterface;

public abstract class Conta implements ContaInterface{
	
	private static final char[] TestePessoa = null;
	
	private String numeroConta; 
	private String banco;
	private String agencia;
	private double saldo;

	
	public Conta(String numeroConta, String banco, String agencia, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public void saldoAtual() {
		System.out.println("Seu saldo atual é " + getSaldo());
	}
	
	public void transferencia() {
		
	}
	
	
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		
		String modelo ="";
		modelo += "Número da Conta -> " + this.getNumeroConta() + "\n";
		modelo += "Banco -> " + this.getBanco() + "\n";
		modelo += "Agência -> " + this.getAgencia() + "\n";
		modelo += "Saldo na conta -> " + this. getSaldo() + "\n";
		
		return modelo;
	}

	public void depositar(Conta conta, double valor) {
			this.setSaldo(this.getSaldo() + valor) ;
			System.out.println("Depósito efuteado com sucesso");
		}
	public void saque(Conta conta,double valor) {
		this.setSaldo(this.getSaldo() - valor);
		if(saldo > 0 && valor <= saldo) {
			System.out.println("Retire o dinheiro");
		}else{
			System.out.println("Impossivel realizar o saque");
		}
	}
	
	@Override
	public void saldo() {
		System.out.println("Seu saldo atual: " + this.getSaldo());
	}

	public void transferencia(double valorTransferencia, Conta conta) {
		this.setSaldo(this.getSaldo() - valorTransferencia);
		conta.setSaldo(conta.getSaldo() + valorTransferencia);
		if(valorTransferencia > this.getSaldo()) {
			System.out.println("Saldo insuficiente");
		}else {
			System.out.println("Transferência realizada com sucesso");
		}
	}


}
