import java.util.*;

class samplearray
{
public static void main(String args[])
{
	int a[]=new int[5];
	Scanner obj=new Scanner(System.in);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Please enter the value of a["+i+"] : ");
		a[i]=obj.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println("value of a["+i+"] : "+a[i]);
	}
}
}