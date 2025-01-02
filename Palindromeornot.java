package methodspackage;

public class Palindromeornot {
	public void palindrome(int num) {
		int y = 0;
		int rev = 0;
		int num1 = num;
		while(num>0) {
			y = num % 10;
			rev = (rev*10)+y;
			num = num/10;
		}
		if(rev == num1) {
			System.out.println(num1+" This Number is Palindrome");
		}
		else {
			System.out.println(num1+" This Number is not Palindrome");
		}
	}
}
