package br.senai.sp.jandira.model;

public class Conta {
	
	// Atributo da classe ou Propriedade da classe
	public String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	public double chequeEspecial;
	
	// M�todos diz o que um objeto faz
	public void depositar(double valorDeposito) {
		
		if (valorDeposito < 0) {
			System.out.println("Valor inv�lido!!!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Saldo + Limite: " + (saldo + chequeEspecial));
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void sacar(double valorDoSaque) {
		//par�metro

		
		if ((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}
	
	public void transferir() {
		
	}

}


