import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numerator = 0;
		int divisor = 0;
		int result = 0;

		while (true) {
			try {

				System.out.print("Enter the numerator: ");
				numerator = sc.nextInt();

				System.out.print("Enter the divisor: ");
				divisor = sc.nextInt();

				result = numerator / divisor;
				System.out.println(numerator + " / " + divisor + " is " + result + "\n");

			} catch (ArithmeticException e) {
				System.out.println("You can't divide " + numerator + " by 0\n");
			} catch (NumberFormatException e) {
				System.out.println("You entered bad data.\nPlease try again.\n");
			}
		}
	}
}