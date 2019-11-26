package week1.day2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LearnException {
private static final int size=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintWriter out = null;
		try {
			System.out.println("Entered statement");
			out = new PrintWriter(new FileWriter("Output.txt"));
		}
		catch(IOException e){
			
		}
 finally {
	 if(out!=null) {
		 System.out.println("Closing");
		 out.close();
	 } else {
		 System.out.println("print"); 
	 }
	 
 }
	}

}
