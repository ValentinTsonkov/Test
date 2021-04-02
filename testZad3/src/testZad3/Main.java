package testZad3;
import java.util.ArrayList;
import java.util.Collections;
public class Main 
{
	public static void main(String[]args)
	{
		ArrayList<Packet> list = new ArrayList<Packet>();
		WebPacket pk1 = new WebPacket(1, "danni", "212.134.90.18", "asd");
		WebPacket pk2 = new WebPacket(2, "danni", "313.174.98.18", "513.174.98.18");
		WebPacket pk3 = new WebPacket(3, "danni", "313.174.98.18", "513.174.98.18");
		WebPacket pk4 = new WebPacket(4, "danni", "asd", "212.134.90.18");
		WebPacket pk5 = new WebPacket(5, "danni", "313.174.98.18", "513.174.98.18");
		
		list.add(pk1);
		list.add(pk2);
		list.add(pk3);
		list.add(pk4);
		list.add(pk5);
		
		Collections.sort(list);
		
		for(Packet x: list)
		{
			if((((WebPacket) x).getIpPlch().equals("212.134.90.18")) || (((WebPacket) x).getIpIzp().equals("212.134.90.18")))
			{
				x.printData();
			}
		}

	}
}
