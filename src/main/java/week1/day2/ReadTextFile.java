package week1.day2;

import java.util.*;
import java.io.*;

public class ReadTextFile {
	Properties prop = new Properties();
	
	
	public void filewrite() throws Exception {
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\NewTextFile.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String here :");
		String s1 = s.nextLine();
		byte b1[] = s1.getBytes();
		fos.write(b1);
		fos.close();
		//System.out.println("Successfully Writed..");
	}
	
	public void fileread() throws Exception {
		FileInputStream fos = new FileInputStream(System.getProperty("user.dir")+"\\NewTextFile.txt");
		int i = 0;
		while((i=fos.read())!=-1) {
			System.out.print((char)i);
		}
		fos.close();
		//System.out.println("Successfully Readed..");
	}

	public void filereadprop() throws IOException {
		FileInputStream fos = new FileInputStream(System.getProperty("user.dir")+"\\testprop.properties");
	    prop.load(fos);
	    System.out.println(prop.getProperty("name1"));
	}
	
	public void filewriteprop() throws Exception {
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\testprop.properties");
		prop.setProperty("db.url", "localhost");
		prop.setProperty("db.user", "mkyong");
		prop.setProperty("db.password", "password");
		prop.store(fos, "added");
	}
	public static void main(String[] args) throws Exception {
		ReadTextFile rtf = new ReadTextFile();
		//rtf.filewrite();
		//rtf.fileread();
		//rtf.filereadprop();
		rtf.filewriteprop();
	}

}
