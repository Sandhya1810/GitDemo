import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		
		sdf.format(d);
		
		System.out.println(sdf.format(d));
		
		

	}

}
