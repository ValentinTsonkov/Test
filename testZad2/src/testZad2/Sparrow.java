package testZad2;

public class Sparrow implements IBird
{
	private String name = "sparrow";
	
	public void sleep() 
	{
		System.out.println(name + " is sleeping");
	}
	
	public void eat() 
	{
		System.out.println(name + " is eating");
	}
	
	public void walk() 
	{
		System.out.println(name + " is walking");
	}
	
	public void fly() 
	{
		System.out.println(name + " is flying");
	}
}
