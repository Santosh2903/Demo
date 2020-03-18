class Calc{
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	public void add(int j, double l) {
		System.out.println(j*l);
	}
	}


public class MethodOverloading {
	public static void main(String[] args) {
	
		Calc obj = new Calc();
		obj.add(100,2.5);
		
		
	}

}
