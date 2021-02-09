package br.academia.gui;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.academia.model.Aluno;
import br.academia.model.AtividadeFisica;



public class FrameAcademia {

	public void criarTela() {
	    Font fonteDoTexto = new Font("Arial", Font.ITALIC, 16);
	    
	    MaskFormatter peso = null ;
		try {
			peso = new MaskFormatter("##.#");
		} catch(ParseException e ) {
			e.printStackTrace();
		}
		
		  
	    MaskFormatter altura = null ;
		try {
			altura = new MaskFormatter("#.##");
		} catch(ParseException e ) {
			e.printStackTrace();
		}
		
		JFrame telaAluno = new JFrame();
	    telaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    telaAluno.setSize(480, 600);
	    telaAluno.setTitle("IMC e NDC");
	    telaAluno.setLayout(null);
        telaAluno.setFont(fonteDoTexto);

	    
	    
        //A faz tela sempre vai aparecer no meio		
		telaAluno.setLocationRelativeTo(null);
	    
	    JLabel label = new JLabel();
		label.setText("Informe os dados abaixo para calcular o IMC é o NDC");
		// *** Definir a posição e tamanho do label (x, y, w, h)
		label.setBounds(15, 10, 500, 30);	
        label.setFont(fonteDoTexto);

		
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
		labelPeso.setBounds(25, 75, 60, 15);
        labelPeso.setFont(fonteDoTexto);

	
		JFormattedTextField textPeso = new JFormattedTextField(peso);
		textPeso.setBounds(80 , 75, 40, 15);
  
	    // Label e TextField do altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(25, 100, 60, 15);	
		labelAltura.setFont(fonteDoTexto);
		
		JFormattedTextField textAltura = new JFormattedTextField(altura);
		textAltura.setBounds(80 , 100, 40, 15);

		// **** JRadioButton e JLabel género
		JLabel labelGenero = new JLabel();
		labelGenero.setText("Género: ");
		labelGenero.setBounds(145, 70, 120, 20);	
        labelGenero.setFont(fonteDoTexto);
		
		
		JRadioButton feminino = new JRadioButton("Feminino");
		feminino.setBounds(140 , 100, 100, 15);
        feminino.setFont(fonteDoTexto);

		JRadioButton masculino = new JRadioButton("Masculino");
		masculino.setBounds(245 , 100, 120, 15);
        masculino.setFont(fonteDoTexto);


		ButtonGroup group = new ButtonGroup();
	    group.add(masculino);
	    group.add(feminino);	
	    
	 		
		// **** JRadioButton e JLabel Data de Nacimento
		JLabel labelDataDeNascimento = new JLabel();
		labelDataDeNascimento.setText("Data de Nascimento: ");
		labelDataDeNascimento.setBounds(25, 140, 200, 20);	
        labelDataDeNascimento.setFont(fonteDoTexto);

	
		JLabel labelDia = new JLabel();
		labelDia.setText("Dia");
		labelDia.setBounds(200, 125, 200, 20);	
        labelDia.setFont(fonteDoTexto);

		
		JTextField textDia = new JTextField();
		textDia.setBounds(200, 143, 30, 15);

		JLabel labelMes = new JLabel();
		labelMes.setText("Mês");
		labelMes.setBounds(260, 125, 200, 20);	
        labelMes.setFont(fonteDoTexto);

		JTextField textMes = new JTextField();
		textMes.setBounds(260 , 143, 30, 15);
	

		JLabel labelAno = new JLabel();
		labelAno.setText("Ano");
		labelAno.setBounds(310, 125, 200, 20);	
        labelAno.setFont(fonteDoTexto);

		
		JTextField textAno = new JTextField();
		textAno.setBounds(310 , 143, 40, 15);
		

		
		
		// **** JLabel e JComboBox da atividade física	
		JLabel labelGrauDeAtividadeFisica = new JLabel();
		labelGrauDeAtividadeFisica.setText("Grau de atividade física: ");
		labelGrauDeAtividadeFisica.setBounds(25, 180, 230, 20);	
        labelGrauDeAtividadeFisica.setFont(fonteDoTexto);

		String graudeatividadefisica[]={"Nenhuma atividade","Leve","Moderada","intensa"};        
		JComboBox<String> comboBoxAtividadeFisica= new JComboBox<>(graudeatividadefisica);    
		comboBoxAtividadeFisica.setBounds(220, 180, 150,20); 
		String valorSelecionado = (String) comboBoxAtividadeFisica.getSelectedItem();
		
		// Label Resultado
		JLabel labelCampoResultado= new JLabel();
		labelCampoResultado.setText("Resultados: ");
		labelCampoResultado.setBounds(155, 215, 120, 20);			
        labelCampoResultado.setFont(fonteDoTexto);
        
        JLabel labelNomeResultado = new JLabel();
        labelNomeResultado.setText("Nome: ");
        labelNomeResultado.setBounds(25, 245, 120, 20);			
        labelNomeResultado.setFont(fonteDoTexto);

		JTextField textNomeResultado = new JTextField();
		textNomeResultado.setBounds(150 , 245, 160, 15);
		
        
        JLabel labelIdadeResultado= new JLabel();
        labelIdadeResultado.setText("Idade: ");
        labelIdadeResultado.setBounds(25, 270, 120, 20);			
        labelIdadeResultado.setFont(fonteDoTexto);
        
		JTextField textIdadeResultado = new JTextField();
		textIdadeResultado.setBounds(150 , 270, 40, 15);
	

		
		// **** JLabel e JComboBox do valor IMC e Resultado IMC
		JLabel labelIMC= new JLabel();
		labelIMC.setText("O valor do IMC: ");
		labelIMC.setBounds(25, 300, 120, 20);			
        labelIMC.setFont(fonteDoTexto);

		JTextField textIMC = new JTextField();
		textIMC.setBounds(150 , 300, 160, 15);
		
		
		JLabel labelIMCResultado = new JLabel();
		labelIMCResultado.setText("Status do IMC: ");
		labelIMCResultado.setBounds(25, 330, 150, 20);		
        labelIMCResultado.setFont(fonteDoTexto);

        
		JTextField textIMCResultado = new JTextField();
		textIMCResultado.setBounds(150 , 325, 160, 30);

		
		// **** JLabel e JComboBox do NDC
		JLabel labelNDC = new JLabel();
		labelNDC.setText(" NDC: ");
		labelNDC.setBounds(25, 360, 150, 20);		
        labelNDC.setFont(fonteDoTexto);

	    
		JTextField textNDC = new JTextField();
		textNDC.setBounds(150 , 360, 160, 15);
				
		// *** Criar o botão para calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		Color branco = new Color(255,255,255);
		buttonCalcular.setForeground(branco);
		Color verde = new Color(34,139,34);
		buttonCalcular.setBackground(verde);
		buttonCalcular.setBounds(25, 390,120, 30);		
		
		// *** Contruir o botão Limpar
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setForeground(branco);
		Color vermelho = new Color(255,0,0);
		buttonLimpar.setBackground(vermelho);
		buttonLimpar.setBounds(155, 390, 120, 30);		
		
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
	    telaAluno.getContentPane().add(labelCampoResultado);
	    telaAluno.getContentPane().add(labelIdadeResultado);
	    telaAluno.getContentPane().add(labelNomeResultado);
	    telaAluno.getContentPane().add(labelIMC);
	    telaAluno.getContentPane().add(labelIMCResultado);
	    telaAluno.getContentPane().add(labelNDC);	    
	   


	    
	    telaAluno.getContentPane().add(textNome);
	    telaAluno.getContentPane().add(textPeso);
	    telaAluno.getContentPane().add(textAltura);
	    telaAluno.getContentPane().add(textDia);
	    telaAluno.getContentPane().add(textMes);
	    telaAluno.getContentPane().add(textAno);
	    telaAluno.getContentPane().add(textNomeResultado);
	    telaAluno.getContentPane().add(textIdadeResultado);
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

				atividadeFisica.setGenero(masculino.isSelected()?"Masculino":"Feminino");	
				
				atividadeFisica.setDataNascimento(LocalDate.of(2002, 2, 20));
//				atividadeFisica.setdt_dia(Integer.parseInt(textDia.getText()));
//				atividadeFisica.setdt_mes(Integer.parseInt(textMes.getText()));
//				atividadeFisica.setdt_ano(Integer.parseInt(textAno.getText()));
				
				atividadeFisica.setAtividadeFisica(valorSelecionado);
			    atividadeFisica.setAtividadeFisica(String.valueOf(comboBoxAtividadeFisica.getSelectedItem()));			  
	
				textNomeResultado.setText(calculaimc.getNome());
                textIdadeResultado.setText(String.valueOf(atividadeFisica.getIdade ()));
			    
				textIMC.setText( String.valueOf(calculaimc.getImc()));
			    textIMCResultado.setText( String.valueOf(calculaimc.reultadoIMC()));
			    textNDC.setText(String.valueOf(atividadeFisica.calcularNDC()));


			}
		});
	    
		
		
	}
}
