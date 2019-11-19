class Vehicle  //parent class
{
	int chasseNumber;
	String Model;
	String Type;
	
	void Inputvalues(int chasseNumber,String Model,String Type)
	{
	  this.chasseNumber=chasseNumber;
	  this.Model=Model;
	  this.Type=Type;
	}
	void details()
	{
		System.out.println("chasseNumber :"+chasseNumber);
		System.out.println("Model :"+Model);
		System.out.println("Type :"+Type);
	}
}
class bike extends Vehicle //child class
{
	void purchase()
	{
		Inputvalues(1234,"Pulser","Petrol");
	}
	void showpurchase()
	{
		details();
	}
}
class Purchaser
{ 
	public static void main(String args[]) 
	{
		bike b=new bike();
		b.purchase();
		b.showpurchase();
	}
	
}


