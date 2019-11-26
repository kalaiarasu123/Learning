package programs;

public class WithoutLoop {
	
	static void loop(int n) {
		if(n>0) {
			loop(n-1);
			System.out.print(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      loop(5);
	}

}
