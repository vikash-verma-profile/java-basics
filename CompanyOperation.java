/*
parent company
child employee
chile manager
*/
class Company //parent
{
	String Name;
	void setCompanyName(String Name)
	{
		this.Name=Name;
	}
}
class employee extends Company //child
{
	String EmpName;
	String Empid;
	int Salary;
	void addemployeeInfor(String EmpName,String Empid,int Salary,String CompanyName)
	{
		this.EmpName=EmpName;
		this.Empid=Empid;
		this.Salary=Salary;
		setCompanyName(CompanyName);
	}
}
class Manager extends employee //child
{
	/*String Subordinates;
	
	void addManger(String empid)
	{
		this.Subordinates=Subordinates;
	}*/
	void showemployeeinformation()
	{
		System.out.println("EmpName :"+EmpName);
		System.out.println("EmpId :"+Empid);
		System.out.println("Salary :"+Salary);
		System.out.println("CompanyName :"+Name);
		//System.out.println("Manager ID :"+Subordinates);
	}
}
class CompanyOperation
{
	public static void main(String args[])
	{
	    Manager obj=new Manager();
		obj.addemployeeInfor("Vikash","ABC123",2000,"HCL");
		//obj.addManger("123");
		obj.showemployeeinformation();
	}
}