package br.academia.gui;

import javax.swing.JFrame;

public class FrameAcademia {
      
	public void criarTela() {
		
		JFrame telaAluno = new JFrame();
		
		telaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaAluno.setSize(500, 300);
		telaAluno.setTitle("IMC e NDC");
		
        //A faz tela sempre vai aparecer no meio		
		telaAluno.setLocationRelativeTo(null);
		
		telaAluno.setVisible(true);
	}
}
