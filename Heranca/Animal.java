package Heranca;

public class Animal {
	
	private String nome;
	private int idade;
	
	public void som() 
	{
		System.out.println("Este animal emite um som");
	}
	
	public void movimento()
	{
		System.out.println("Este animal se movimenta");
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void estadoAtual()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		
	}
	
}
