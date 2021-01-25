package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criação do Cliente
           Cliente pedro = new Cliente();
           pedro.setNome("Pedro Álvares Cabral");
           pedro.setCpf("454554454452");
           pedro.setTelefone("(11) 4512- 8956");
           pedro.setCep("0666651");
           
        
        // Criar da conta do Pedro
           Conta contaPedro =new Conta();
           contaPedro.setTitular(pedro);
           contaPedro.depositar(100);
           contaPedro.setNumero("2222-2");
           
           System.out.println(contaPedro.getTitular().getTelefone());
           System.out.println(contaPedro.getTitular().getNome());
           contaPedro.getTitular().setNome("Pedro da Silva");
           System.out.println(contaPedro.getTitular().getNome());
           System.out.println(pedro.getNome());
	}

}
