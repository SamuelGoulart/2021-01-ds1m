package br.academia.model;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
      
	private String nome;
	private double peso;
	private double altura;
	private String genero;
	private LocalDate dataNascimento;
	
   
	// set vou mandar um valor
	// get vou pegar um valor
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
	
	public void setSexo(String genero) {
		this.genero = genero;
	}
	public String getGenero() {
		return this.genero;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	
	// Obter a idade da pessoa
	
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
	    Period periodo = Period.between(this.dataNascimento, hoje);
	    return periodo.getYears();
	}
	
	
	//métodos
	
    public double getImc() {
    	
    	 return  this.peso /  Math.pow(this.altura, 2);
    }
    
    public String resultadoImc() {
    	
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
    
   public double calcularNdc() {
    	
    	if(genero == "M") {
    		
    		if(dataNascimento => 18 && dataNascimento <= 30) {
    			
    		  return 15.3 * peso + 679;
    		}
    	}
     	else {
    		
    	}
    	
  
    }
    
     
    

}
