package br.academia.model;



import java.util.Calendar;
import java.util.GregorianCalendar;


public class AtividadeFisica  {

    private String genero;
	private String atividadeFisica;
	private double peso;
	private Integer dt_dia;
	private Integer dt_mes;
	private Integer dt_ano;

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
    
	public void setdt_dia(Integer dia) {
		this.dt_dia = dia;
	}
	
	 
    public void setdt_mes(Integer mes) {
		this.dt_mes = mes;
	}
    
   	public void setdt_ano(Integer ano) {
   		this.dt_ano = ano;
   	}
  
			
   	
	public int getIdade() {
		 // Data de hoje.  
	    GregorianCalendar hoje = new GregorianCalendar();
	    Integer dia = hoje.get(Calendar.DAY_OF_MONTH);
	    Integer mes = hoje.get(Calendar.MONTH) + 1;
	    Integer ano = hoje.get(Calendar.YEAR);

	    
		// Data do nascimento.
	    Integer anoNasc = dt_ano, 
			mesNasc = dt_mes, diaNasc = dt_dia;
 		
 		if (mesNasc < mes || (mesNasc == mes && diaNasc <= dia)) {
 			
 		Integer	idade = ano - anoNasc;
 		return (idade);
 		
 		}
 			else {
 			Integer	idade = (ano - anoNasc)-1;
 		    return (idade);

 		}
 
 		
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