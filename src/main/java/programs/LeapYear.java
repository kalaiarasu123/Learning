package programs;

public class LeapYear {

	public static void main(String[] args) {
		int Leap = 2011;
		if(Leap%4==0) {
			if(Leap%100==0) {
				if(Leap%400==0) {
					System.out.println("Leap");
				}
				else {
					System.out.println("Not Leap");
				}
			}
			else {
				System.out.println(" Leap");
			}
		}
		else {
			System.out.println("Not Leap");
		}
	}

}
