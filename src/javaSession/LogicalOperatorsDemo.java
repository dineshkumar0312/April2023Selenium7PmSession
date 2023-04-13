package javaSession;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {

		boolean b1 = true;
		boolean b2 = true;

		System.out.println(b1 && b2);

		boolean b11 = true;
		boolean b12 = false;

		System.out.println(b11 && b12);

		boolean b111 = true;

		boolean b112 = false;

		System.out.println(b111 || b112);
		
		boolean b1111 = true;
		
		System.out.println(!b1111);
	}

}
