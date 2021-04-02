package testZad3;

public abstract class Packet implements Comparable<Packet>
{
	protected int nomer;
	protected String danni;
	
	public Packet(int nomer, String danni)
	{
		this.nomer = nomer;
		this.danni = danni;
	}
	
	abstract void printData();
	
	public int compareTo(Packet pk)
	{  
		if(nomer==pk.nomer) 
		{	
			return 0;
		}
		else if(nomer>pk.nomer)
		{	
			return 1;  
		}
		else
		{	
			return -1;
		}
	}  

}
