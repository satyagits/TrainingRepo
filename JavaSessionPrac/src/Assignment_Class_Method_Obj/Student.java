package Assignment_Class_Method_Obj;

public class Student {
	
	int rollno, age;
	
	public void display1()
	{
		System.out.println("Welcome To Automation All Of You");
	}
	
	public void display2()
	{
		System.out.println("Automation Is Very Easy");
	}
	
	public static void main(String[] args)
	{
		Student obj = new Student();
		
		obj.rollno=128;
		System.out.println(obj.rollno);
		
		obj.age=30;
		System.out.println(obj.age);
		
		obj.display1();
		obj.display2();
		
		
		
	}

}
