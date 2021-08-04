import java.util.Scanner;

public class Main {

	int x;

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		System.out.println("Enter the number to check for palindrome\n");
		x = sc.nextInt();
		int rem, sum = 0;
		int temp = x;
		while (temp > 0) {
			rem = temp % 10;
			sum = (sum * 10) + rem;
			temp = temp / 10;
		}
		if (sum == x)
			System.out.println("The given number is a Palindrome\n");
		else
			System.out.println("The given number is not a Palindrome\n");

	}

	// function to printPattern

	public void printPattern() {

		System.out.print("Enter the number to print pattern of star\n");
		x = sc.nextInt();
		for (int i = x; i != 0; i--) {
			System.out.println("\n");
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println("\n");
		}

	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		System.out.println("Enter the number to check for prime or not\n");
		x = sc.nextInt();
		int rem1, rem2;
		rem1 = (x - 1) % 6;
		rem2 = (x + 1) % 6;
		if (x == 1 || x == 2 || x == 3)
			System.out.println("The given number is a prime number\n");
		else if (rem1 == 0 || rem2 == 0)
			System.out.println("The given number is a prime number\n");
		else
			System.out.println("The given number is not a prime number\n");
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1, i = 1;

		System.out.println("Enter the number of times fibonacci to take place\n");
		x = sc.nextInt();
		System.out.print(first + " " + second);
		while (i <= x - 2) {

			int sum = first + second;
			first = second;
			second = sum;
			System.out.print(" " + second);
			i++;
		}
		System.out.println("\n");
	}

	// main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
