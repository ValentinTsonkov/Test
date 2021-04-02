
public class Car  extends Vehicle
{
	private int vrati;
	public Car(String marka, String model, int kolela, int vrati)
	{
		super(marka, model, kolela);
		this.vrati = vrati;
	}
	
	public void printInfo() 
	{
		System.out.println("Marka: " + marka + " Model: " + model + " Broi kolela: " + kolela + " Broi Vrati: " + vrati);
	}

}
