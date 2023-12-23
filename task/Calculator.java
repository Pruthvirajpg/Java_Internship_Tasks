package task;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int operator, n1, n2;
		System.out.println(" 1 - ADD \n 2 - SUBTRACTION \n 3 - MULTIPLICATION \n 4 - DIVISION");
		System.out.print("Choose Operator :-  ");
		Scanner sc=new Scanner (System.in);
		operator = sc.nextInt();
		System.out.print("Enter First Numbre :- ");
		n1 = sc.nextInt();
		System.out.print("Enter Second Numbre :- ");
		n2 = sc.nextInt();
		
		int result=0;
		switch(operator) {
		case 1:
			result = n1+n2;
			break;
			
		case 2:
			result = n1-n2;
			break;
			
		case 3:
			result = n1*n2;
			break;
			
		case 4:
			result = n1/n2;
			break;
			
		default:
			System.out.println("Entered Opertator is not Valid! ");
		}
		System.out.println("Result is  :- "+result);

	}

}
