
public class Childemirates extends ParentAirCraft{

	public static void main(String[] args) {
		
		Childemirates ce = new Childemirates();
	
		ce.safetyGuideline();
		ce.engine();
		ce.color();

	}

	@Override
	public void color() {
		
		System.out.println("Red color on the body");
		
	}

}
