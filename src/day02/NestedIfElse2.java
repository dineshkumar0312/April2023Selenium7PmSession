package day02;

public class NestedIfElse2 {

	public static void main(String[] args) {

		int marks = 1000;

		if (marks >= 1000) {

			System.out.println("MBBS..Private College");

			if (marks >= 1150) {

				System.out.println("MBBS...Government...");
			} else {

				System.out.println("Only Private MBBS...");
			}

		} else {

			System.out.println("Engineering");
			
			if(marks < 700) {
				
				System.out.println("Better go for Arts..");
			}
		}

	}

}
