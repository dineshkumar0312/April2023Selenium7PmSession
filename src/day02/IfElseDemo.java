package day02;

public class IfElseDemo {

	public static void main(String[] args) {

		/*
		 * >=18 Eligible to vote <18 Not Eligible to vote
		 */

		int age = 17;

		boolean check = age >= 18;

		if (check == true) {

			System.out.println("Eligible to vote");
			
		} else {

			System.out.println("Not eligible to vote");
		}

	}

}
