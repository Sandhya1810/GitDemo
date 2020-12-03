
public class ClassB extends ClassA{
	int c;
	int i = 20;
	
	public void add(int a, int b)
	
	{
		c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		
		System.out.println(a.i);
		
		b.add(2, 3);
		
		
		
		
	}

}
