import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numerator;
		int divisor;

		while (true) {
			numerator = askNumerator(sc);
			divisor = askDivisor(sc, numerator);
			System.out.println(numerator + " / " + divisor + " is " + ((double) numerator / divisor));
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

	public static int askDivisor(Scanner sc, int numerator) {
		int divisor;
		String divisorString;

		System.out.print("Enter the divisor: ");
		divisorString = sc.next();

		try {
			divisor = Integer.parseInt(divisorString);
			if (divisor == 0) {
				System.out.println("You can't divide " + numerator + " by 0");
			} else {
				return divisor;
			}
		} catch (NumberFormatException e) {
			System.out.println("You entered bad data.\nPlease try again.\n");
		}

		return 0;
	}
}