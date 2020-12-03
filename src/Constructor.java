import java.text.SimpleDateFormat;
import java.util.Date;

public class Constructor {
	
	
	public Constructor()
	
	{
		System.out.println("I will get a job soon");
	}
	
	public Constructor(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public void getDate()
	
	{
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		String a=sdf.format(d);
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		
		Constructor cs = new Constructor();
		Constructor cs1 = new Constructor(3,4);
		cs.getDate();
		

	}

}
