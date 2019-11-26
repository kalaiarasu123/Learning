package week1.day2;

public abstract class EmployeeAstraction {
	private String name;
	private String address;
	private int number;
	 public EmployeeAstraction(String name, String address,int number){
		 System.out.println("Constructiong employee");
		 this.name = name;
		 this.address = address;
		 this.number = number;
        	 
	 }
	 public double computerpay() {
		 System.out.println("Inside company");
		 return 0.0;
	 }
	 
	 
}
