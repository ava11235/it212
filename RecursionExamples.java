import java.io.File;
import java.util.Scanner;

public class RecursionExamples {

	public static void main(String[] args) {

		printLetter(5);
		System.out.println(facLoop(5));
		System.out.println(factorial(5));

		

		Scanner console = new Scanner(System.in);
		System.out.print("Directory or File name? ");
		String name = console.nextLine();
		File f = new File(name);
		if (!f.exists()) {
			System.out.println("No such file or dir found");
		} else {
			print(f, 0);
		}

	}

	// Example 1: print a letter
	public static void printLetter(int n) {
		// base case no letters; end with a blank line
		if (n == 0) {

			System.out.println();
		}
		// recursive case; print a letter until base case is reached
		else {

			System.out.print("a");
			printLetter(n - 1);
		}
	}

	// Example 2: Factorial with a loop
	public static int facLoop(int n) {
		int i, fact = 1;

		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;

	}

	// Factorial: Recursive
	static int factorial(int n) {
		// Base case fact or 1 is 1
		if (n <= 1)
			return 1;
		// Recursive case
		else
			return (n * factorial(n - 1));
	}

	// Recursive directories search

	public static void print(File f, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("    ");
		}
		System.out.println(f.getName());
		if (f.isDirectory()) {
			for (File subF : f.listFiles()) {
				print(subF, level + 1);
			}
		}
	}

}
