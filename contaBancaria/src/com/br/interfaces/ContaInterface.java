package com.br.interfaces;

import com.br.modelo.Conta;

public interface ContaInterface {
	
	void depositar(Conta conta, double valor);
	void saque(Conta conta,double valor);
	void transferencia(double valorTransferencia, Conta conta);
	void saldo();

}
