package br.academia.model;

import java.time.LocalDate;
import java.time.Period;

public class AtividadeFisica {

    private String genero;
	private String atividadeFisica;
	private double peso;
	private int dataNascimento;
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero() {
		return this.genero;
	}
	
	public void setAtividadeFisica(String atividadeFisica) {
		this.atividadeFisica = atividadeFisica;
	}
	
	public String getAtividadeFisica() {
		return this.atividadeFisica;
	}
	
	public void setPesoAtividadeFisica(Double peso) {
		this.peso = peso;
	}
	
	public double getPesoAtividadeFisica() {
		return this.peso;
	}
    
	
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getDataNascimento() {
		return this.dataNascimento;
	}

	public int getIdade() {
		//LocalDate hoje = LocalDate.now();
	   // Period periodo = Period.between(hoje, this.dataNascimento);
	   // return int periodo.getYears();
		LocalDate hoje = LocalDate.now();
		LocalDate dataNascimento = LocalDate.of(2002, 2,20);
		Period periodo = Period.between(dataNascimento, hoje);
		return periodo.getYears();
	}
	
	
	 public double calcularGCD() {
	    	
	    	if(this.genero == "Masculino") {
	    		if(this.getIdade() >= 18 && this.getIdade() <= 30) {
	    	        return  15.3 * this.peso + 679; 	 
	    		}
	    		else if(this.getIdade() >= 31 && this.getIdade() <=60) { 
	    			return 11.6 * this.peso + 879;
	    		}
	    		else {
	    			return 13.5 * this.peso + 487;
	    		}
	    	}
	     	else {
	    		if(this.getIdade() >= 18 && this.getIdade() <= 30) {
	    	        return  14.7 * this.peso + 496; 	 
	    		}
	    		else if(this.getIdade() >= 31 && this.getIdade() <=60) {
	    			return 8.7 * this.peso + 829;
	    		}
	    		else {
	    			return 10.5 * this.peso + 596;
	    		}
	    		
	    	}	
	 }
	
	public double calcularNDC() {
		if(genero == "Masculino") {
	      if(this.atividadeFisica == "Leve") {
			return this.calcularGCD()*1.5;
	       }
		else if (this.atividadeFisica == "Moderada") {
			return this.calcularGCD()*1.8;
		}
		else if (this.atividadeFisica == "intensa") {
			return this.calcularGCD()*2.1;
		}
		else {
			return this.calcularGCD();
		}
	}
	  else {
  	      if(this.atividadeFisica == "Leve") {
  			return this.calcularGCD()*1.6;
  	       }
  		else if (this.atividadeFisica == "Moderada") {
  			return this.calcularGCD()*1.6;
  		}
  		else if (this.atividadeFisica == "intensa") {
			return this.calcularGCD()*1.8;
		}
		else {
			return this.calcularGCD();
		}
  	      
	  }
   }
}