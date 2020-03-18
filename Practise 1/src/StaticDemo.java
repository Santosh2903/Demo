class Static{
	
	int eid;
	int salary;
	static String ceo = "Vaishna";
	
	
	public void show() {
		System.out.println(eid + " : "+ salary + " : " + ceo);
	}
	static 
	{
//		ceo = "Vaishnavi";
//		
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		
		Static santosh = new Static();
		Static arun = new Static();
		
		santosh.eid = 8;
		santosh.salary = 3000;
		
		arun.eid = 9;
		arun.salary = 1000;
		santosh.show();
		arun.show();
		
	}

}
