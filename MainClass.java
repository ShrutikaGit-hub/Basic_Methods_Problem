package methodspackage;

public class MainClass {
	public static void main(String []args) {
		Primeornot obj1 = new Primeornot();
		obj1.prime(7);
		
		Evenornot obj2 = new Evenornot();
		obj2.even(6);
		
		Oddornot obj3 = new Oddornot();
		obj3.odd(6);
		
		Countdigit obj4 = new Countdigit();
		obj4.count(1234534);
		
		Reverseofnum obj5 = new Reverseofnum();
		obj5.reverse(35646);
		
		Palindromeornot obj6 = new Palindromeornot();
		obj6.palindrome(121);
	}
}
