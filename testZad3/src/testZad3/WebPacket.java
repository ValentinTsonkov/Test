package testZad3;

public class WebPacket extends Packet
{
	private String ipIzp;
	private String ipPlch;
	
	public WebPacket(int nomer, String danni, String ipIzp, String ipPlch)
	{
		super(nomer,danni);
		this.ipIzp = ipIzp;
		this.ipPlch = ipPlch;
	}
	
	public void printData()
	{
		System.out.println("Number: " + nomer + " Data: " + danni + " Comes from IP: " + ipIzp + " Goes to IP: " + ipPlch);
	}

	public String getIpIzp() {
		return ipIzp;
	}

	public void setIpIzp(String ipIzp) {
		this.ipIzp = ipIzp;
	}

	public String getIpPlch() {
		return ipPlch;
	}

	public void setIpPlch(String ipPlch) {
		this.ipPlch = ipPlch;
	}

}
