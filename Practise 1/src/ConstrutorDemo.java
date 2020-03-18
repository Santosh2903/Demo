class Casio{
	int i;
	int j;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
}
public class ConstrutorDemo {

	public static void main(String[] args) {

		Casio obj = new Casio();
		obj.setI(5);
		System.out.println(obj.getI());
	}


		
	}


