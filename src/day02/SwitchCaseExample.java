package day02;

public class SwitchCaseExample {

	public static void main(String[] args) {

		int number = 30;
		//switch expression
		switch (number) {
		//case statement
			case 10:
				System.out.println("10");
				break;
			case 20:
				System.out.println("20");
				break;
			case 30:
				System.out.println("30");
				break;
			//default case statement
			default:
				System.out.println("Not in 10, 20, 30");
		}
		
	}

}
