package IntroducaoPOO;

public class ModeloPaciente {
	
	public String nome; 
	public int idade;
	public double dataInternacao;
	public String ala;
	public boolean internacao;
	
	
	public void situacao()
	{
		
		if(this.internacao==true)
			System.out.println("Paciente internado");
		else 
			System.out.println("Paciente recebeu alta!!");
	}
	
	public void internado()
	{
		this.internacao=true;
	}
	
	public void alta()
	{
		this.internacao=false;
	}
	
	public void estadoAtual()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Data da internação: "+this.dataInternacao);
		System.out.println("Ala: "+this.ala);
		System.out.println("Paciente está internado? "+this.internacao);
	}

}


