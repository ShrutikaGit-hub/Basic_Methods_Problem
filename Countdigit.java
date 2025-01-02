package methodspackage;

public class Countdigit {
	public void count(int num) {
		int count = 0;
		int num1 = num;
		int y = 0;
		while(num>0) {
			y = num%10;
			count++;
			num = num/10;
		}
		System.out.println("Number is "+num1+ " & Count is "+count);
	}
}
