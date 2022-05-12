package IntroducaoPOO;

public class Paciente {

	public static void main(String[] args) {
		
		ModeloPaciente paciente1 = new ModeloPaciente();
		ModeloPaciente paciente2 = new ModeloPaciente();
		
		
		System.out.println("Paciente 1");
		paciente1.nome="Davi";
		paciente1.idade=5;
		paciente1.dataInternacao=26.04;
		paciente1.ala="UTI Pediátrica";
		paciente1.internado();
		paciente1.estadoAtual();
		
		System.out.println("\nPaciente 2");
		paciente2.nome="Simone";
		paciente2.idade=46;
		paciente2.dataInternacao=12.03;
		paciente2.ala="UTI Cardiológica";
		paciente2.alta();
		paciente2.estadoAtual();

	}

}
