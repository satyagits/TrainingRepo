package Assignment_Class_Method_Obj;

public class VoidNonVoidAssignment2 {
	
	public int div(int a, int b)
	{
		int c = a/b;
		System.out.println("Division of a by b = " +c);
		return c;
	}
	
	public int sub(int i, int j)
	{
		int k = i - j;
		System.out.println("Subtraction of i - j = " +k);
		return k;
	}
	
	public int mul(int x, int y)
	{
		int z = x * y;
		System.out.println("Multiplication of x * y = " +z);
		return z;
	}
	
	public void sum(int l, int m)
	{
		int o = l + m;
		System.out.println("The Final result of (((((10/2)-2)*2)-2)+2) = " +o);
	}
	
	public static void main(String[] args)
	{
		VoidNonVoidAssignment2 obj = new VoidNonVoidAssignment2();
		
		int div_reslt = obj.div(10, 2);
		int sub_reslt = obj.sub(div_reslt, 2);
		int mult_resilt = obj.mul(sub_reslt, 2);
		int sub1_reslt = obj.sub(mult_resilt, 2);
		obj.sum(sub1_reslt, 2);
		
		
	}
	

}
