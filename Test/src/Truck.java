
public class Truck extends Vehicle
{
	private int tovarimost;
	
	public Truck(String marka, String model, int kolela, int tovarimost) 
	{
		super(marka,model,kolela);
		this.tovarimost = tovarimost;
	}
	
	public void printInfo() 
	{
		System.out.println("Marka: " + marka + " Model: " + model + " Broi kolela: " + kolela + " Maximalna tovarimost: " + tovarimost + "Tona");
	}
	
}
