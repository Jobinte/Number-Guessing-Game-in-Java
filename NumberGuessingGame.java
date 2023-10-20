package nbrGussProject;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Random rand= new Random();
		int randomnumber=rand.nextInt(10);
		
		
		Scanner sc = new Scanner(System.in);
		int trycount=0;
		
		while( true){
		System.out.println("enter ur guess (1-10):");
		  int plyrguess=sc.nextInt();
		trycount ++;
		if(plyrguess==randomnumber){
			System.out.println("CORRECT!!!! \n ***** U WIN *****");
			break;
		}
		
		else if(randomnumber > plyrguess){
			System.out.println("NOPE! \n ur number is higher , guess again ");
		}
		else {
			System.out.println("NOPE! \n ur number is lower , guess again ");
			
		}
		
		}
		

	}

}
