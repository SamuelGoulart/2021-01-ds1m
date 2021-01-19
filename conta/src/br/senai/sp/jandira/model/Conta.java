package br.senai.sp.jandira.model;

public class Conta {
	
	// Atributo da classe ou Propriedade da classe
	private String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	public double chequeEspecial;
	
	//*** M�todos de acesso aos atributos da classe
	// *** getters and setters
	
	
	//Par�metros s�o valores que passamos para um m�todo, estes valores s�o recebidos pelas vari�veis criadas dentro 
	//do par�nteses do m�todo.
	public void setTipo(String tipo) {
		
		 //c�digo do m�todo entre chaves
		
	     //O m�todo equals � utilizado para compara��es.
		if(tipo.equals("Corrente") || tipo.equals("Poupan�a") ) {
			//o this serve para diferenciar quando o m�todo tem o mesmo nome de parametro que a class
			this.tipo = tipo;		
		}else {
			System.out.println("O tipo deve ser Corrente ou Poupan�a");
		}
		
		
	}
	
	// M�todos diz o que um objeto faz
	public void depositar(double valorDeposito) {
		//par�metro
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


