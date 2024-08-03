package Assignment_Class_Method_Obj;

public class VoidNonVoidAssignment1 {
	
	public int sum(int a, int b)
	{
		
		int c= a + b;
		System.out.println("Addition of a + b = " +c);
		return c;
		
	}
	
	public int mul(int x, int y)
	{
		int z = x * y;
		System.out.println("Multiplication of x * y = " +z);
		 return z;
	}
	
	public int sub(int i, int j)
	{
		int k = i - j;
		System.out.println("Subtraction of i - j = " +k);
		return k;
	}
	
	public void div(int l, int m)
	{
		int o = l/m;
		System.out.println("Final result of (((((10+2)*2)-2)*2)/2) = " +o);
	}
	
	public static void main(String[] args)
	{
		VoidNonVoidAssignment1 obj = new VoidNonVoidAssignment1();
		
		int sum1_reslt = obj.sum(10, 2);
		int mul_reslt = obj.mul(sum1_reslt, 2);
		int sub_reslt = obj.sub(mul_reslt, 2);
		int mul1_reslt = obj.mul(sub_reslt, 2);
		obj.div(mul1_reslt, 2);
				
	}

}
