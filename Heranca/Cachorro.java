package Heranca;

public class Cachorro extends Animal {
	
	@Override
	public void som() 
	{
		System.out.println("Latindo... au, au, au");
	}
	
	@Override
	public void movimento()
	{
		System.out.println("Correndo...");
	}

}
