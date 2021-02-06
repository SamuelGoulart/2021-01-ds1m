package br.academia.model;

public class Aluno {

	private String nome;
	private double peso;
	private double altura;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	//métodos
	
	 public double getImc() {
    	 return  this.peso /  Math.pow(this.altura, 2);
    }
	 
	public String reultadoIMC() {
		
	 	if(this.getImc() < 18.5) {
    		return "abaixo do peso";
    	}
    	else if (this.getImc() >= 18.5 && this.getImc() <= 24.9) {
    		return "Peso ideal (parabéns)";
    	}
    	else if (this.getImc() >= 25 && this.getImc() <=29.9) {
    		return "Levemente acima do peso";
    	}
    	else if (this.getImc() >= 30 && this.getImc() <34.9) {
    		return "Obesidade grau 1";
    	}
    	else if (this.getImc() >= 35 && this.getImc() <=39.9) {
    		return "Obesidade grau 2 (Severa)";
    	}
    	else if (this.getImc() >40) {
    		return "Obesidade grau 3";
    	}
    	
    	return "";
	}
}
