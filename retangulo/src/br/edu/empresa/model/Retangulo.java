package br.edu.empresa.model;

public class Retangulo {
    
	private double base;
	private double altura;
	
	
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		//this serve para mostrar que a base é do atributo da classe
		//incluive fica azul a cor da base igual a base da propriedade
		return this.base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double getAltura() {
		return altura;
	}
	
	//Métodos(Verbos)
	
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	public double calcularPerimetro() {
		return 2 *(this.base + this.altura);
	}
}
