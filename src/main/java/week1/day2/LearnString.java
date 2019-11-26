package week1.day2;

import org.openqa.selenium.support.ui.Select;

public class LearnString {

	public static void main(String[] args) {
	
		String string1 = "Eello";
		String string2 = "Hello";
		String string3 = new String("Hello");
		
		System.out.println(string1==string2);
		System.out.println(string1==string3);
		System.out.println(string1.equals(string2));
		System.out.println(string1.equals(string3));
		LearnString ls =new LearnString();
		LearnString ls1 = new LearnString();
		
	}

}
