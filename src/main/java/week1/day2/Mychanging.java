package week1.day2;

public class Mychanging {
	public  Mychanging() //default constructor 
	{
		System.out.println("default constructor");
	}
	

	public Mychanging(int i) //parameterized constructor 
	{
		this();
		System.out.println("single constructor");
	}

	public  Mychanging(int i, int j) ///parameterized constructor
	{
		this(j);
		System.out.println("Doule constructor");
	}
	

	public static void main(String[] args) {
		Mychanging Lp = new Mychanging(10,20);
		

	}

}
