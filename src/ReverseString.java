
public class ReverseString {

	public static void main(String[] args) {
		
		String a = "Sandhya";
		String t= " ";
		
		for(int i = a.length()-1; i>=0; i--)
			
		{
			t= t+ a.charAt(i);
			
			
		}
		System.out.println(t); 
		System.out.println(a.length());
	}

}
