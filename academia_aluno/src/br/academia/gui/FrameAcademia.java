package br.academia.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.academia.model.Aluno;
import br.academia.model.AtividadeFisica;


public class FrameAcademia {
      
	public void criarTela() {
		
		
		JFrame telaAluno = new JFrame();
		
		telaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaAluno.setSize(500, 400);
		telaAluno.setTitle("IMC e NDC");
		telaAluno.setLayout(null);
		
        //A faz tela sempre vai aparecer no meio		
		telaAluno.setLocationRelativeTo(null);
		
		
		// *** Criar JLabel IMC
		JLabel label = new JLabel();
		label.setText("Informe os dados abaixo para calcular o IMC é o NDC");
		// *** Definir a posição e tamanho do label (x, y, w, h)
		label.setBounds(15, 10, 500, 30);		
		
	    // Label e TextField do Nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setBounds(25, 40, 40, 30);
		
		JTextField textNome = new JTextField();
		textNome.setBounds(70 , 50, 210, 15);
		
	    // Label e TextField do Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso: ");
		labelPeso.setBounds(25, 75, 60, 10);
		
		JTextField textPeso = new JTextField();
		textPeso.setBounds(70 , 75, 40, 15);
		
	    // Label e TextField do altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(25, 100, 60, 10);	
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70 , 100, 40, 15);
		
		// **** JRadioButton e JLabel género
		JLabel labelGenero = new JLabel();
		labelGenero.setText("Género: ");
		labelGenero.setBounds(125, 70, 120, 20);	
		
		JRadioButton M = new JRadioButton("Masculino");
		M.setBounds(120 , 100, 90, 15);
		
		JRadioButton F = new JRadioButton("Femino");
		F.setBounds(210 , 100, 130, 15);   
		
		ButtonGroup group = new ButtonGroup();
	    group.add(M);
	    group.add(F);
		
		
		// **** JRadioButton e JLabel Data de Nacimento
		JLabel labelDataDeNascimento = new JLabel();
		labelDataDeNascimento.setText("Data de Nascimento: ");
		labelDataDeNascimento.setBounds(25, 130, 200, 20);	
		 
		JTextField textDataDeNascimento = new JTextField();
		textDataDeNascimento.setBounds(150 , 134, 122, 15);

		
		// **** JLabel e JComboBox da atividade física	
		JLabel labelGrauDeAtividadeFisica = new JLabel();
		labelGrauDeAtividadeFisica.setText("Grau de atividade física: ");
		labelGrauDeAtividadeFisica.setBounds(25, 155, 230, 20);	
		
		String graudeatividadefisica[]={"Leve","Moderada","intensa"};        
		JComboBox comboBoxAtividadeFisica= new JComboBox(graudeatividadefisica);    
		comboBoxAtividadeFisica.setBounds(180, 157, 90,20); 
		
		// **** JLabel e JComboBox do valor IMC e Resultado IMC
		JLabel labelIMC= new JLabel();
		labelIMC.setText("O valor do IMC: ");
		labelIMC.setBounds(25, 185, 120, 20);			
		
		JTextField textIMC = new JTextField();
		textIMC.setBounds(150 , 185, 122, 15);
		
		JLabel labelIMCResultado = new JLabel();
		labelIMCResultado.setText("O resultado do  IMC: ");
		labelIMCResultado.setBounds(25, 210, 150, 20);		
	    
		JTextField textIMCResultado = new JTextField();
		textIMCResultado.setBounds(150 , 205, 160, 30);

		
		// **** JLabel e JComboBox do NDC
		JLabel labelNDC = new JLabel();
		labelNDC.setText("O resultado do  NDC: ");
		labelNDC.setBounds(25, 236, 150, 20);		
	    
		JTextField textNDC = new JTextField();
		textNDC.setBounds(150 , 240, 122, 15);
		
		
		
		// *** Criar o botão para calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		Color branco = new Color(255,255,255);
		buttonCalcular.setForeground(branco);
		Color azul = new Color(0,0,255);
		buttonCalcular.setBackground(azul);
		buttonCalcular.setBounds(25, 270,120, 30);
		
		// *** Contruir o botão Limpar
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setForeground(branco);
		buttonLimpar.setBackground(azul);
		buttonLimpar.setBounds(155, 270, 120, 30);
		
		// *** Colocar o label, botão  dentro 
		//do painel de conteúdo contentPane -> content Pane
	     telaAluno.getContentPane().add(label);
	     telaAluno.getContentPane().add(labelNome);
	     telaAluno.getContentPane().add(labelPeso);
	     telaAluno.getContentPane().add(labelAltura);
	     telaAluno.getContentPane().add(labelGrauDeAtividadeFisica);
	     telaAluno.getContentPane().add(labelGenero);
	     telaAluno.getContentPane().add(labelDataDeNascimento);
	     telaAluno.getContentPane().add(labelIMC);
	     telaAluno.getContentPane().add(labelIMCResultado);
	     telaAluno.getContentPane().add(labelNDC);

	     
	     telaAluno.getContentPane().add(textNome);
	     telaAluno.getContentPane().add(textPeso);
	     telaAluno.getContentPane().add(textAltura);
	     telaAluno.getContentPane().add(textDataDeNascimento);
	     telaAluno.getContentPane().add(textIMC);
	     telaAluno.getContentPane().add(textIMCResultado);
	     telaAluno.getContentPane().add(textNDC);

	     
	     telaAluno.getContentPane().add(M);
	     telaAluno.getContentPane().add(F);
	     telaAluno.getContentPane().add(comboBoxAtividadeFisica);   

	     telaAluno.getContentPane().add(buttonCalcular);
		 telaAluno.getContentPane().add(buttonLimpar);
	    
		
		telaAluno.setVisible(true);
		
		// **** Cliques da tela
        buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Aluno calculaimc = new Aluno();
				AtividadeFisica atividadeFisica = new AtividadeFisica();
				
				
				calculaimc.setAltura(Double.parseDouble(textAltura.getText()));
				calculaimc.setPeso(Double.parseDouble(textPeso.getText()));
				
				textIMCResultado.setText( String.valueOf(calculaimc.resultadoImc()));
				textIMC.setText( String.valueOf(calculaimc.getImc()));
				
				atividadeFisica.setDataNascimento(LocalDate.parse(textDataDeNascimento.getText()));
			    textDataDeNascimento.setText(String.valueOf(atividadeFisica.getIdade()));
			    
			    atividadeFisica.setAtividadeFisica(String.valueOf(comboBoxAtividadeFisica.getItemCount()));

			    atividadeFisica.setAtividadeFisica(String.valueOf(M.getText()));
			    atividadeFisica.setAtividadeFisica(String.valueOf(F.getText()));
			    
			    textNDC.setText(String.valueOf(atividadeFisica.calcularNDC()));

			    LocalDate 	textDataDeNascimento = atividadeFisica.getDataNascimento();
          

			}
		});
		
		
	}

	protected Object String(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
