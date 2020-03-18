
public class AlphaPramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a = 'A' - 1;
		
		for (char j = 1; j < 4; j++) {

			for (int i=0; i < j; i++) {
				char ch = (char)(a + j);
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}
