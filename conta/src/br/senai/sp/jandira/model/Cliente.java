package br.senai.sp.jandira.model;

public class Cliente {
    
	//S�o vari�veis String, porque tem parenteses e hifen
	//Exemplo (11) 9999-9999
	//Tamb�m n�o iremos fazer nenhuma opera��o matem�tica
	//Quando n�o especificamos se � public ou private, por padr�o ser� private.
	private String nome;
    private	String cpf;
	private String telefone;
	private String cep;
	
	// Nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	//cpf
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	//telefone
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	//cep
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return this.cep;
	}
	
}
