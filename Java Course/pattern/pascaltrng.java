// Print Pascal's Triangle in Java
package pattern;

import java.util.Scanner;

public class pascaltrng {

	// Pascal function
	public static void printPascal(int n)
	{
		for (int line = 1; line <= n; line++) {
			for (int j = 0; j <= n - line; j++) {

				// for left spacing
				System.out.print(" ");
			}

			// used to represent C(line, i)
			int C = 1;
			for (int i = 1; i <= line; i++) {

				// The first value in a line is always 1
				System.out.print(C + " ");
				C = C * (line - i) / i;
			}
			System.out.println();
		}
	}

	// Driver code
	public static void main(String[] args)
	{
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			printPascal(n);
		}
	}
}//pascal tarnagle value at 3rd row and 2nd col is
//R-1...C..c-1
//i.e 3-1....c...2-1===2C1=2*1/1=2
