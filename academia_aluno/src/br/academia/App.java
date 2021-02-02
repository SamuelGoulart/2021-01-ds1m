package br.academia;

import java.time.LocalDate;

import br.academia.model.Aluno;

//import br.academia.gui.FrameAcademia;

public class App {
	
   public static void main(String[] args) {
	   
	//FrameAcademia tela = new FrameAcademia();
	//tela.criarTela();
	   
	   Aluno  samuel = new Aluno();
	    
	   samuel.setNome("Samuel");
	   samuel.setPeso(60.0);
	   samuel.setAltura(1.70);
	   samuel.getDataNascimentoLocalDate.of(2002, 02, 20));
	  
	   System.out.println("***" + samuel.getNome()+ "***");
	   System.out.println("****"+ samuel.getImc());
	   System.out.println("****"+ samuel.resultadoImc());
	}
}
