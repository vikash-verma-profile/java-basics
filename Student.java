class Student
{
	int RollNumber;
	String Name;
	
	void InputStudentInformation(int roll,String name)
	{
		this.Name=name;
		this.RollNumber=roll;
	}
	void PrintStudentInformation()
	{
		System.out.println("Student Name is:"+Name);
		System.out.println("Student Roll Number is:"+RollNumber);
	}
	public static void main(String args[])
	{
		Student std=new Student();
		std.InputStudentInformation(12,"Vikash Verma");
		std.PrintStudentInformation();
	}
}