package day02;

public class LadderIfElse {

	public static void main(String[] args) {

		String movieTicketDateAndTime = "Baba 13-04-2023 10Pm PVR";

		if (movieTicketDateAndTime.equals("Viduthalai 13-04-2023 10Pm PVR")) {

			System.out.println("Block A");
		} else if (movieTicketDateAndTime.equals("Kalagathalivan 13-04-223 10Pm PVR")) {

			System.out.println("Block B");
		} else if (movieTicketDateAndTime.equals("Baba 13-04-2023 10Pm PVR")) {

			System.out.println("Block C");
		} else {

			System.out.println("Dont allow");
		}

	}

}
