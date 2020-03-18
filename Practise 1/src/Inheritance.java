class A
{
	public void show()
	{
		System.out.println("In class A");
	}
}

class B extends A
{
	public void show()
	{
		super.show();
		System.out.println("In class B");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show();
		
	}

}
