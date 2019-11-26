7package programs;

import java.util.Scanner;

public class Factorial {

static int fac(int n) {
	int sum =1;
	for (int i =2; i < n; i++) {
		
		sum = sum *i;
		
		
	}
	return sum;
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("n is"+fac(n));

	}

}
