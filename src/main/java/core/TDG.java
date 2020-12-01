package core;
public class TDG {
	int length = 0, result = 0;
	static int max = 500;
	//static int max = 5;
	static PrimeNumberChecker p = new PrimeNumberChecker();
	public static void main(String[] args) {
		for (int i = 2; i <= max; i++) {
			System.out.println("{" + i + ", " + p.validate(i) + "}" + (i < max ? "," : ""));
		}
	}
}