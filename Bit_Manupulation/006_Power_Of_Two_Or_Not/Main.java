

public class Main
{
	public static void main(String[] args)
	{
		int num =10;
		int mask=num-1;
		
		if((num & mask)==0)
			System.out.println("True");
		
		else
			System.out.println("False");
	}
}