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
	   samuel.setSexo("M");
	   LocalDate data = LocalDate.of(2020, 2, 20);
	   samuel.setDataNascimento(data);
	   samuel.setAtividadeFisica("Atividade intensa");
	  
	   System.out.println("Nome: " + samuel.getNome());   
	 
	   System.out.println("Altura: " +samuel.getAltura());
	   System.out.println("IMC: "+ samuel.getImc());
	   System.out.println("Resultado do IMC: "+ samuel.resultadoImc());
	   System.out.println("-----------------------------");
	   // Calular NDC
	   System.out.println("Idade: "+samuel.getIdade());
	   System.out.println("Peso: " + samuel.getPeso());
	   System.out.println("Calculo do GCD (Cálculo do gasto calórico diário) " +samuel.calcularGCD());
	   System.out.println("Calculo do NDC:"+ samuel.calcularNDC());
	}
}
