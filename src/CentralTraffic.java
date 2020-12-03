
public class CentralTraffic implements Interface, Interface2 {
	
	
			

	public static void main(String[] args) {

		Interface ct = new CentralTraffic();
		CentralTraffic ct1 = new CentralTraffic();
		Interface2 ct2 = new CentralTraffic();
		
		ct1.checkpost();
		ct2.trainSymbol();
		ct.green();
		ct.red();
		ct.yellow();
		

	}
	
	public void checkpost()
	{
		System.out.println("Checkposte is clear");
	}

	@Override
	public void green() {
		System.out.println("Go now");
		
	}

	@Override
	public void yellow() {
		System.out.println("Flash Yellow");
		
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("Stop");
		
	}

	@Override
	public void trainSymbol() {
		System.out.println("Train is coming");
		
	}

}
