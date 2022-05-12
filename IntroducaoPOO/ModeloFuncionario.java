package IntroducaoPOO;

public class ModeloFuncionario {
	
	public String nome; 
	public int idade;
	public String setor;
	public String turno;
	public boolean ativo;
	
	
	public void contrato()
	{
		
		if(this.ativo==true)
			System.out.println("Funcionário ativo");
		else 
			System.out.println("Erro! Funcionário desligado da empresa");
	}
	
	public void ativado()
	{
		this.ativo=true;
	}
	
	public void desativado()
	{
		this.ativo=false;
	}
	
	public void estadoAtual()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Setor: "+this.setor);
		System.out.println("Turno: "+this.turno);
		System.out.println("Está ativo na empresa? "+this.ativo);
	}

}
