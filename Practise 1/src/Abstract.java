abstract class Writer
{
	public abstract void show();
}

class Pen extends Writer
{
	public void show()
	{
		System.out.println("pen");
	}
}

class Pencil extends Writer
{
	public void show()
	{
		System.out.println("pencil");
	}
}

class Kit
{
	public void doSomething(Writer p)
	{
		p.show();
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kit obj = new Kit();
		Writer p = new Pencil();
		Writer pc = new Pen();
		obj.doSomething(pc);
		
	}

}
