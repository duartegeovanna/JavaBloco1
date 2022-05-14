package Heranca;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		System.out.println("Cachorro");
		dog.setNome("Bartolomeu");
		dog.setIdade(5);
		dog.estadoAtual();
		dog.som();
		dog.movimento();
		
		System.out.println("\nCavalo");
		horse.setNome("Pé de Pano");
		horse.setIdade(20);
		horse.estadoAtual();
		horse.som();
		horse.movimento();
		
		System.out.println("\nPreguiça");
		sloth.setNome("Flecha");
		sloth.setIdade(99);
		sloth.estadoAtual();
		sloth.som();
		sloth.movimento();
		
	}
}
