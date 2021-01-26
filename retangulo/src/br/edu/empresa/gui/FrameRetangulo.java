package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {
    
	public void criarTela() {
		
		// Ctrl + espaço para importar a classe
		JFrame telaRetangulo = new JFrame();
		//Quando meu programa for fechado no botão X, será destruido na menória RAM
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaRetangulo.setSize(500, 300);
		telaRetangulo.setTitle("Cáculos com retângulo");
		telaRetangulo.setLayout(null);
		
        //A faz tela sempre vai aparecer no meio		
		telaRetangulo.setLocationRelativeTo(null);;

		// *** Criar um label
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura");
		// *** Definir a posição e tamanho do label (x, y, w, h)
		labelAltura.setBounds(10, 10, 80, 30);
		
		// *** Criar um Text Field
		JTextField textAltura = new JTextField();
		textAltura.setBounds(50 ,20, 100, 15);
		
		
		JLabel labelBase = new JLabel();
		labelBase.setText("Base");
		labelBase.setBounds(10, 45, 80, 30);
		
		JTextField textBase = new JTextField();
		textBase.setBounds(50, 55, 100, 15);
		
	
		
		// *** Criar o botão para calcular
		JButton buttonCalcular = new JButton();
		//Sempre que quero passar alguma coisa é set
		buttonCalcular.setText("Calcular");
		Color branco = new Color(255,255,255);
		buttonCalcular.setForeground(branco);
		Color azul = new Color(0,0,255);
		buttonCalcular.setBackground(azul);
		buttonCalcular.setBounds(10, 90, 180, 30);
		
		// *** Colocar o labelAltura dentro 
		//do painel de conteúdo contentPane -> content Pane
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		
		
		//Sempre é a última coisa que vai colocar
		telaRetangulo.setVisible(true);
		
		// **** Cliques da tela
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
		      Retangulo r = new  Retangulo();
		      r.setAltura(Double.parseDouble(textAltura.getText()));
		      r.setBase(Double.parseDouble(textBase.getText()));
		      
		      labelAltura.setText(String.valueOf(r.calcularArea()));
		      labelBase.setText(String.valueOf(r.calcularPerimetro()));
			}
		});
		
	}
}
