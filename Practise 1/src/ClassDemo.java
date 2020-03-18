import java.util.*;

class Add{
	int num1;
	int num2;
	int result;
	
	public void perform() {
		result= num1*num2;
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj = new Add();
		
		Scanner commandReader = new Scanner (System.in); 
		System.out.println("Enter the first number:");
		obj.num1 = commandReader.nextInt();
		System.out.println("enter the second number:");
		obj.num2 = commandReader.nextInt();
//		obj.num1 = 5;
//		obj.num2 = 10;
		obj.perform();
		
		System.out.println(obj.result);
		
	}

}
