interface Abc
{
	void show();
	default void show1()
	{
		System.out.println("In interface");
	}
}

class Demo1 implements Abc
{
	public void show()
	{
		System.out.println("In implemented class");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj = new Demo1();
		obj.show1();
					
	
	obj.show();
}
											
										
}
