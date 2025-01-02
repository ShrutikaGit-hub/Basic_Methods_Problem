package methodspackage;

public class Oddornot {
	public boolean odd(int num) {
		boolean result = num%2 != 0;
		if(result == true) {
			System.out.println(num+" Number is odd");
		}
		else {
			System.out.println(num+" Number is not odd");
		}
		return result;
	}
}
