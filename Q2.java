import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number : ");
		if (sc.hasNextDouble()) {
			double a = 0;

			a = sc.nextDouble();
		
		System.out.println("Enter 2nd Number : ");
		if (sc.hasNextDouble()) {
			double b = 0;
			b = sc.nextDouble();
			double c = (a + b) / 2;
			System.out.println("Average of numbers is " + c);
		}
		}
		else {
			System.out.println("!!ERROR: Numbers entered is not of double format!!");
		}
	}

}
