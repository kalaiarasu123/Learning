package programs;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			for (int k=7;k>=i;k--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
	
	}

}
