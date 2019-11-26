package week1.day2;

public class VariableArgumets {
	public static void addcust(String...a) {
		System.out.println("Numer of length" +a.length);
		for(String i:a) {
			//System.out.print(i + "");
			System.out.println(i);
			
		}
		
	}

	public static void main(String[] args) {
		addcust("Kalai","Daya","Avi");

	}

}
