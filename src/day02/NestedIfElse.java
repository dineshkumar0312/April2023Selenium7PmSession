package day02;

public class NestedIfElse {

	public static void main(String[] args) {

		int atmAmount = 50;

		int pinNo = 2012;

		if (pinNo == 2014) {

			System.out.println("Next Step -> Enter amount to withdraw");

			if (atmAmount > 100) {

				System.out.println("System allows u to withdraw the amount");
			} else {

				System.out.println("U dont have enough amount");
			}

		} else {

			System.out.println("Ur request is not accepted..Invalid Pin number > Reinsert your card");
		}

	}
}
