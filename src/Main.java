import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numerator;
		int divisor;

		while (true) {
			numerator = askNumerator(sc);

		}

	}

	public static int askNumerator(Scanner sc) {
		int numerator = 0;
		String numeratorString;
		boolean isNumeratorOK = false;

		do {
			try {
				System.out.print("Enter the numerator: ");
				numeratorString = sc.next();

				if (numeratorString.charAt(0) == 'q' || numeratorString.charAt(0) == 'Q') {
					System.exit(0);
				} else {
					isNumeratorOK = true;
				}

				numerator = Integer.valueOf(numeratorString);

			} catch (NumberFormatException e) {
				System.out.println("You entered bad data.\nPlease try again.\n");
			}
		} while (!isNumeratorOK);

		return numerator;
	}

	public static void askDivisor() {
		
	}

}
