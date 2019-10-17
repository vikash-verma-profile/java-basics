import java.util.Scanner;
class index
{
	
	public static void main(String args[])
	{
		int a;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter some value");
		
		a=obj.nextInt();
		
		
		if((a%2!=0) && (a%3==0))
		{
			System.out.println(a+" is divisble by 2 and 3");
		}
		else if(a%3==0 || (a%2==0))
		{
			System.out.println(a+" is divisble by 3 or 2");
		}
		else{
			System.out.println(a+" is not divisble by 3 or 2");
		}
		
	}
}