package br.academia.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
	    Font fonteDoTexto = new Font("Roboto", Font.CENTER_BASELINE, 16);

		
		JFrame telaAluno = new JFrame();
	    telaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    telaAluno.setSize(400, 400);
	    telaAluno.setTitle("IMC e NDC");
	    telaAluno.setLayout(null);
        telaAluno.setFont(fonteDoTexto);

	    
	    
        //A faz tela sempre vai aparecer no meio		
		telaAluno.setLocationRelativeTo(null);
	    
	    JLabel label = new JLabel();
		label.setText("Informe os dados abaixo para calcular o IMC é o NDC");
		// *** Definir a posição e tamanho do label (x, y, w, h)
		label.setBounds(15, 10, 500, 30);	
		
	    // Label e TextField do Nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setBounds(25, 40, 80, 30);
        labelNome.setFont(fonteDoTexto);
		
		JTextField textNome = new JTextField();
		textNome.setBounds(80 , 50, 200, 15);
	
		
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
		
		
		JRadioButton feminino = new JRadioButton("Feminino");
		feminino.setBounds(120 , 100, 90, 15);
		
		JRadioButton masculino = new JRadioButton("Masculino");
		masculino.setBounds(220 , 100, 90, 15);
		

		ButtonGroup group = new ButtonGroup();
	    group.add(masculino);
	    group.add(feminino);	
	    
	 		
		// **** JRadioButton e JLabel Data de Nacimento
		JLabel labelDataDeNascimento = new JLabel();
		labelDataDeNascimento.setText("Data de Nascimento: ");
		labelDataDeNascimento.setBounds(25, 130, 200, 20);	
	
		JLabel labelDia = new JLabel();
		labelDia.setText("Dia");
		labelDia.setBounds(160, 115, 200, 20);	
		
		JTextField textDia = new JTextField();
		textDia.setBounds(160 , 133, 30, 15);
		

		JLabel labelMes = new JLabel();
		labelMes.setText("Mês");
		labelMes.setBounds(195, 115, 200, 20);	
		
		JTextField textMes = new JTextField();
		textMes.setBounds(195 , 133, 30, 15);
	

		JLabel labelAno = new JLabel();
		labelAno.setText("Ano");
		labelAno.setBounds(230, 115, 200, 20);	
		
		JTextField textAno = new JTextField();
		textAno.setBounds(230 , 133, 40, 15);
		

		
		
		// **** JLabel e JComboBox da atividade física	
		JLabel labelGrauDeAtividadeFisica = new JLabel();
		labelGrauDeAtividadeFisica.setText("Grau de atividade física: ");
		labelGrauDeAtividadeFisica.setBounds(25, 155, 230, 20);	
		
		String graudeatividadefisica[]={"Não prática","Leve","Moderada","intensa"};        
		JComboBox<String> comboBoxAtividadeFisica= new JComboBox<>(graudeatividadefisica);    
		comboBoxAtividadeFisica.setBounds(180, 157, 100,20); 
		String valorSelecionado = (String) comboBoxAtividadeFisica.getSelectedItem();
		
		// **** JLabel e JComboBox do valor IMC e Resultado IMC
		JLabel labelIMC= new JLabel();
		labelIMC.setText("O valor do IMC: ");
		labelIMC.setBounds(25, 185, 120, 20);			
		
		JTextField textIMC = new JTextField();
		textIMC.setBounds(150 , 185, 160, 15);
		
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
		textNDC.setBounds(150 , 240, 160, 15);
				
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
	    telaAluno.getContentPane().add(labelDia);
	    telaAluno.getContentPane().add(labelMes);
	    telaAluno.getContentPane().add(labelAno);
	    telaAluno.getContentPane().add(labelIMC);
	    telaAluno.getContentPane().add(labelIMCResultado);
	    telaAluno.getContentPane().add(labelNDC);	    
	   


	    
	    telaAluno.getContentPane().add(textNome);
	    telaAluno.getContentPane().add(textPeso);
	    telaAluno.getContentPane().add(textAltura);
	    telaAluno.getContentPane().add(textDia);
	    telaAluno.getContentPane().add(textMes);
	    telaAluno.getContentPane().add(textAno);
	    telaAluno.getContentPane().add(textIMC);
	    
	    telaAluno.getContentPane().add(textIMCResultado);
	    
	    telaAluno.getContentPane().add(textNDC);
	    
	    
	    telaAluno.getContentPane().add(masculino);
	    telaAluno.getContentPane().add(feminino);
	    telaAluno.getContentPane().add(comboBoxAtividadeFisica); 
	    telaAluno.getContentPane().add(buttonLimpar);
	    
	     
	    telaAluno.getContentPane().add(buttonCalcular);
	    
	    
	    telaAluno.setVisible(true);
	    buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textNome.setText(null);
				textPeso.setText(null);
				textAltura.setText(null);
				textDia.setText(null);
				textMes.setText(null);
				textAno.setText(null);
				textIMC.setText(null);
				textNDC.setText(null);
				textIMCResultado.setText(null);
				textIMC.setText(null);
			}
		});

	    
	    // ***** Cliques da tela
	    buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Aluno calculaimc = new Aluno();
				AtividadeFisica atividadeFisica = new AtividadeFisica();


				calculaimc.setNome(textNome.getText());
	
				calculaimc.setPeso(Double.parseDouble(textPeso.getText()));
				atividadeFisica.setPesoAtividadeFisica(Double.parseDouble(textPeso.getText()));
				
				calculaimc.setAltura(Double.parseDouble(textAltura.getText()));
				
				atividadeFisica.setGenero(masculino.getText());
				atividadeFisica.setGenero(feminino.getText());

				
				if ( feminino.isSelected() ) { 
					String generoSelecionado = "Feminino"; 
					atividadeFisica.setGenero(generoSelecionado);
					}
				else if ( masculino.isSelected() ) { 
					String generoSelecionado = "Masculino"; 
					atividadeFisica.setGenero(generoSelecionado);
					}
			
				
				atividadeFisica.setdt_dia(Integer.parseInt(textDia.getText()));
				atividadeFisica.setdt_mes(Integer.parseInt(textMes.getText()));
				atividadeFisica.setdt_ano(Integer.parseInt(textAno.getText()));
				
				atividadeFisica.setAtividadeFisica(valorSelecionado);
			    atividadeFisica.setAtividadeFisica(String.valueOf(comboBoxAtividadeFisica.getSelectedItem()));			  
	
				textIMC.setText( String.valueOf(calculaimc.getImc()));
			    textIMCResultado.setText( String.valueOf(calculaimc.reultadoIMC()));
			    textNDC.setText(String.valueOf(atividadeFisica.calcularNDC()));


			}
		});
	    
		
		
	}
}
