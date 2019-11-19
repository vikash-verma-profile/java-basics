class Calculator
{
	int sum(int Number1,int Number2) //mandoor
	{
		return (Number1+Number2);
	}
	public static void main(String args[]) //shopkeeper
	{
		Calculator cal=new Calculator();
		int sum=cal.sum(1,2);
		System.out.println(sum);
	}
}