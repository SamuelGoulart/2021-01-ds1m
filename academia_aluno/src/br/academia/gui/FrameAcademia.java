package br.academia.gui;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class FrameAcademia {
      
	public void criarTela() {
		
		
		JFrame telaAluno = new JFrame();
		
		telaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaAluno.setSize(500, 300);
		telaAluno.setTitle("IMC e NDC");
		telaAluno.setLayout(null);
		
        //A faz tela sempre vai aparecer no meio		
		telaAluno.setLocationRelativeTo(null);
		
		
		// *** Criar JLabel IMC
		JLabel labelIMC = new JLabel();
		labelIMC.setText("Informe os dados abaixo para calcular o IMC é o NDC");
		// *** Definir a posição e tamanho do label (x, y, w, h)
		labelIMC.setBounds(15, 10, 500, 30);		
		
	    // Label e TextField do Nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setBounds(25, 40, 60, 30);
		
		JTextField textNome = new JTextField();
		textNome.setBounds(70 , 50, 100, 15);
		
	    // Label e TextField do Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso: ");
		labelPeso.setBounds(25, 75, 60, 10);
		
		JTextField textPeso = new JTextField();
		textPeso.setBounds(70 , 75, 100, 15);
		
	    // Label e TextField do altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(25, 100, 60, 10);	
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70 , 100, 100, 15);
		
		// **** JRadioButton e JLabel género
		JLabel labelGenero = new JLabel();
		labelGenero.setText("Informe o género: ");
		labelGenero.setBounds(25, 120, 120, 20);	
		
		JRadioButton M = new JRadioButton("Masculino");
		M.setBounds(25 , 150, 100, 15);
		
		JRadioButton F = new JRadioButton("Femino");
		F.setBounds(25 , 170, 70, 15);      
		

		 String language[]={"Java","Python","Android","PHP","Swift"};        
		 JComboBox cb= new JComboBox(language);    
		 cb.setBounds(50, 210, 90,20);    
	    
		
		// *** Colocar o label, botão  dentro 
		//do painel de conteúdo contentPane -> content Pane
	     telaAluno.getContentPane().add(labelIMC);
	     telaAluno.getContentPane().add(labelNome);
	     telaAluno.getContentPane().add(labelPeso);
	     telaAluno.getContentPane().add(labelAltura);
	     telaAluno.getContentPane().add(labelGenero);
	     telaAluno.getContentPane().add(textNome);
	     telaAluno.getContentPane().add(textPeso);
	     telaAluno.getContentPane().add(textAltura);
	     
	     
	     telaAluno.getContentPane().add(M);
	     telaAluno.getContentPane().add(F);
	     
		 telaAluno.getContentPane().add(cb);   

	  
	    

		
		telaAluno.setVisible(true);
	}
	

}
