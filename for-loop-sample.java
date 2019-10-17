class forLoop{
	public static void main(String args[])
	{
	
		for(int counter1=0;counter1<5;counter1++)
		{
			for(int counter2=0;counter2<counter1;counter2++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		int counter=5;
		System.out.println("---starting while loop---");
		while(counter!=5)
		{
			System.out.println(counter);
			counter++;
		}
		System.out.println("---ending while loop---");
		//int counter=0;
		System.out.println("---starting Do while loop---");
		do
		{
			System.out.println(counter);
			counter++;
		}while(5!=5);
		System.out.println("---ending do while loop---");
		*/
		
	}
	
}