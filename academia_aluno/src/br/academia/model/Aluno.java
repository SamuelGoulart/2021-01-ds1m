package br.academia.model;

public class Aluno {
      
	private String nome;
	private double peso;
	private double altura;
	private String sexo;
	private int idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {	
		return this.nome;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public Double getPeso() {
		return this.peso;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double getAltura() {
		return this.altura;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return this.sexo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
}
