package task;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Binary Number :- ");
		
		num = sc.nextInt();
		
		int d = 0;
		int t = num;
		int i = 0;
		
		while(t > 0) {
			
			int r = t%10;
			t = t/10;
			d = d + r * (int)Math.pow(2, i++);
			
		}
				
		System.out.println("Decimal Equivalent of "+num + " is "+d);

	}

}
