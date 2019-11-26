package programs;

import java.util.Scanner;

public class Fionnaci {


	public static void main(String[] args) {
		int sum1 =0;
		int sum2 =1;
		int sum3;
		int count = 10;
		System.out.print(sum1+" "+sum2);
		for (int i =2; i < count; i++) {
			
			sum3 = sum1 +sum2;
			System.out.print(sum3);
			sum1 = sum2;
			sum2 = sum3;
		}
		
		

	}

}
