package IntroducaoPOO;

public class Funcionario {
	
	public static void main(String[] args) {
		
		ModeloFuncionario funcionario1 = new ModeloFuncionario();
		ModeloFuncionario funcionario2 = new ModeloFuncionario();
		
		
		System.out.println("Funcionario 1");
		funcionario1.nome="Alexandre";
		funcionario1.idade=25;
		funcionario1.setor="Logística";
		funcionario1.turno="Noturno";
		funcionario1.desativado();
		funcionario1.estadoAtual();
		
		System.out.println("\nFuncionario 2");
		funcionario2.nome="Fernanda";
		funcionario2.idade=29;
		funcionario2.setor="Financeiro";
		funcionario2.turno="Diurno";
		funcionario2.ativado();
		funcionario2.estadoAtual();
	}

}
