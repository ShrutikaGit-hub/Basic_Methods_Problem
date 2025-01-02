package methodspackage;

public class Reverseofnum {
	public void reverse(int num) {
		int x = 0;
		int rev = 0;
		while(num>0) {
			x = num % 10;
			rev = (rev*10)+x;
			num = num/10;
		}
		System.out.println("Reverse Number is : "+rev);
	}
}
