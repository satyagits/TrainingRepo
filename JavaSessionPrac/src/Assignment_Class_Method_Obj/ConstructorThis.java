package Assignment_Class_Method_Obj;

public class ConstructorThis {
	
	public ConstructorThis()
	{
		this(2,3,4);
		System.out.println("I Am Default Constructor");
	}
	
	public ConstructorThis(int a)
	{
		this(8,9);
		System.out.println("I Am One Parameterised Constructor");
	}
	
	public ConstructorThis(int a, int b)
	{
		this();
		System.out.println("I Am Two Parameterised Constructor");
	}
	
	public ConstructorThis(int a, int b, int c)
	{
		System.out.println("I Am Three Parameterised Constructor");
	}
	
	public static void main(String[] args)
	{
		ConstructorThis obj = new ConstructorThis(100);
	}

}
