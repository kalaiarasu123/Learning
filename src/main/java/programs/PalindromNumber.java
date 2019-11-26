package programs;

public class PalindromNumber {

	public static void main(String[] args) {
		int n=454;
		int sum=0;
		int r;
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
    if(temp==sum) {
    	System.out.println("Numer is Palindrome");
    }
    else {
    	System.out.println("Numer is not Palindrome");
    }
	}

}
