package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {
    
	public void criarTela() {
		
		// Ctrl + espa�o para importar a classe
		JFrame telaRetangulo = new JFrame();
		//Quando meu programa for fechado no bot�o X, ser� destruido na men�ria RAM
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaRetangulo.setSize(500, 300);
		telaRetangulo.setTitle("C�culos com ret�ngulo");
		telaRetangulo.setLayout(null);
		
        //A faz tela sempre vai aparecer no meio		
		telaRetangulo.setLocationRelativeTo(null);;

		// *** Criar JLabel Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura");
		// *** Definir a posi��o e tamanho do label (x, y, w, h)
		labelAltura.setBounds(10, 10, 80, 30);
		
		// *** Criar um Text Field Altura
		JTextField textAltura = new JTextField();
		textAltura.setBounds(50 ,20, 100, 15);
		
		// **** Contruir um JLabel Base
		JLabel labelBase = new JLabel();
		labelBase.setText("Base");
		labelBase.setBounds(10, 45, 80, 30);
		
		JTextField textBase = new JTextField();
		textBase.setBounds(50, 55, 100, 15);
		
	
		
		// *** Criar o bot�o para calcular
		JButton buttonCalcular = new JButton();
		//Sempre que quero passar alguma coisa � set
		buttonCalcular.setText("Calcular");
		Color branco = new Color(255,255,255);
		buttonCalcular.setForeground(branco);
		Color azul = new Color(0,0,255);
		buttonCalcular.setBackground(azul);
		buttonCalcular.setBounds(10, 90,140, 30);
		
		// *** Contruir o bot�o Limpar
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setForeground(branco);
		buttonLimpar.setBackground(azul);
		buttonLimpar.setBounds(10, 140, 140, 30);
		
		
		// ***Label Resultado
		JLabel labelArea = new JLabel();
		labelArea.setText("Ar�a");
		labelArea.setBounds(180, 10 ,120, 30);
		
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Per�metro");
		labelPerimetro.setBounds(180, 50, 120, 30);
		
		// *** Colocar o labelAltura dentro 
		//do painel de conte�do contentPane -> content Pane
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		telaRetangulo.getContentPane().add(buttonLimpar);
		telaRetangulo.getContentPane().add(labelArea);
		telaRetangulo.getContentPane().add(labelPerimetro);
		
		
		
		//Sempre � a �ltima coisa que vai colocar
		telaRetangulo.setVisible(true);
		
		// ***** Ouvintes de a��es/ eventos
        labelPerimetro.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(null, "Sai daqui!!");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});		
		// **** Cliques da tela
	
        buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		             
				Retangulo r1 = new Retangulo();
				//Tranformar String(Texto) em Double (N�mero)
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText()));
				
				// Tranformar Double (N�mero) em String(Texto)
				labelArea.setText("�rea: " + String.valueOf(r1.calcularArea()));
				labelPerimetro.setText("Per�metro: " + String.valueOf(r1.calcularPerimetro()));
			}
		});
		
	}
}
