import java.util.ArrayList;

import org.testng.annotations.Test;

public class StreamFilter {

	@Test
	
	public void arrayList()
	
	{
		ArrayList<String> List = new ArrayList<String>();
		
		List.add("Sandhya");
		List.add("Rupal");
		List.add("Rana");
		List.add("Sujit");
		List.add("Sneha");
		
		int count=0;
		
		for(int i=0; i<List.size(); i++)
			
		{
			String actualName= List.get(i);
			if(actualName.startsWith("S"))
			{
				count++;
			}
			
			System.out.println(count);
		}
	}
		@Test
		
		public void filter()
		{
			ArrayList<String> name = new ArrayList<String>();
			
			name.add("Sandhya");
			name.add("Rupal");
			name.add("Rana");
			name.add("Sujit");
			name.add("Sneha");
			
		    Long c=	name.stream().filter(s->s.startsWith("S")).count();
		    
		    System.out.println(c);
		

		String name1= "123Sandhya";
		
		name1.replaceAll("0_9", "");
		System.out.println(name1);
		}
		
	}


