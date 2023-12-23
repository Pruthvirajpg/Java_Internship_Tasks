package task;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	

	public static void main(String[] args) {
		System.out.println("\n******Welcome to Numbaer Guessing Game******");
		int randomNum,guessNum;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		randomNum = rand.nextInt(100)+1;
		//System.out.println(randomNum);
		
		int tryCount=0;
		while(true) {
			System.out.print("Guess the Number --> ");
			guessNum = sc.nextInt();
			tryCount++;
			if(guessNum == randomNum) {
				System.out.println("Correct!! You Win");
				System.out.println("It Takes You "+ tryCount + " tries.");
				break;
				}
				else if (guessNum < randomNum){
					System.out.println("Nope! The Number is Heiger, Guess Again...");	
				}
				else {
					System.out.println("Nope! The Number is Lower, Guess Again...");
				}
			
		}
		
	}

}
