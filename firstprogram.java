import java.util.Scanner;

class firstprogram
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Please enter some value");
		int a=obj.nextInt();
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}