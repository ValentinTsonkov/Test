
public abstract class Vehicle 
{
	protected String marka;
	protected String model;
	protected int kolela;
	public Vehicle(String marka, String model, int kolela) 
	{
		this.marka = marka;
		this.model = model;
		this.kolela = kolela;
	}
	
	abstract void printInfo();

}
