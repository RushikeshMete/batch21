package B1;

public class a4nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=20;
		int b=30;
		int c=40;
		
		if (c>b) {
			System.out.println("c is greater than b");
		if (a>c) {
			System.out.append("a is greater than c");
		}
		else {
			System.out.println("c is greater than a");
		}
		}
		else {
			System.out.println("b is greater than c");
		}
	}

}
