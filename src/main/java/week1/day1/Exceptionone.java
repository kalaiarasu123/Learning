package week1.day1;

public class Exceptionone {

	public static void main(String[] args) {
		try {
			int i = 0;
			int j = 5;
			int k = j / i;
			System.out.println(k);

		}
		catch(Exception e) {
			System.out.println(e);
		}
	/*	catch (ArithmeticException ae) {
			System.out.println(ae);
		}*
*/
	}
}