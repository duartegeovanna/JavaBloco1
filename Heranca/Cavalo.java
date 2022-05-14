package Heranca;

public class Cavalo extends Animal{
	
	@Override
	public void som() 
	{
		System.out.println("Relinchando!!");
	}
	
	@Override
	public void movimento()
	{
		System.out.println("Galopando...");
	}

}
