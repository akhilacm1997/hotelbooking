package case3;

public class Services {
	String ac;
	String cot;
	String cableConnection;
	String wifi ;
	String Laundry;
	static int cost=0;

	public void Services1(String ac, String cot, String cableConnection, String wifi, String Laundry) {
		this.ac=ac;
		this.cot=cot;
		this.cableConnection=cableConnection;
		this.wifi=wifi;
		this.Laundry = Laundry;
		
		if(ac.equals("ac"))
				{
			cost=cost+1000;
			
				}
		else
		{
			cost=cost+750;
		}
		if(cot.equalsIgnoreCase("double"))
		{
			cost=cost+350;
			
			
		}
		if(cableConnection.equals("cable"))
		{
			cost=cost+50;
			
		}
		if(wifi.equals("wifi"))
		{
			cost=cost+200;
			
		}
		if(Laundry.equals("Laundry"))
		{
			cost=cost+100;
			
		}
		System.out.println("cost is"+ cost);
		
		
	}


}
