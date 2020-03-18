class Calculator 
{
	public int add(int... n)
	{
		int sum = 0;
		for (int k : n)
		{
			sum = sum + k;
			
			
		}
		return sum;
	}
}

public class VarargsDemo {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.add(1,2,3));

	}

}
