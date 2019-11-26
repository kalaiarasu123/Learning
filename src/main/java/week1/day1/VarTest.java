package week1.day1;

public class VarTest {
	static final int count = 100;

	public static void main(String[] args) {
		int count = 5;
		VarTest Daya = new VarTest();
		VarTest Kalai = new VarTest();
		Daya.increment();
		System.out.println("Daya:count is= "+Daya.count);
		Kalai.increment();
		System.out.println("Daya:count is= "+Kalai.count);
		System.out.println("Daya:count is= "+Daya.count);
		System.out.println("Kalai is= "+Kalai.count);
		Daya.increment();
		System.out.println("Daya:count is= "+Daya.count);
		Daya.increment();
		System.out.println("Daya:count is= "+Daya.count);
	}

	public void increment() {
		count++;
		//System.out.println(count++);
	}
}
