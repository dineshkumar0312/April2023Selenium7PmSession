package day02;

public class IfElse2 {

	public static void main(String[] args) {

		int atmPinNumber = 2012;

		int customerInput = 2012;
		
		boolean check  = atmPinNumber != customerInput;
		
		System.out.println(check);

		if (atmPinNumber != customerInput) {

			System.out.println("System should nt allow");
		} else {

			System.out.println("System should allow");
		}
	}

}
