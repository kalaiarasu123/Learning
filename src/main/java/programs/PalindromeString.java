package programs;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "Kalak";
		StringBuffer stb = new StringBuffer(str);
	
			for (int i = str.length()-1; i >=0; i--) {
				stb = stb.append(str.charAt(i));
				
			}
			if(str.equalsIgnoreCase(stb.toString())) {
				System.out.println("String is palindrom");
			}
			else	
				{
				System.out.println("String is not palindrom");
				}
	}

}
