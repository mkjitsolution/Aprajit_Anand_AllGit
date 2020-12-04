package p1;

public class Dump {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		new Dump().consoleDisplay(a, b);
		
	}
	
	public int getSum(int a ,int b)
	{
		return a+b;
	}
	
	public void consoleDisplay(int a,int b)
	{
		System.out.println(getSum(a, b));
	}
	
}
