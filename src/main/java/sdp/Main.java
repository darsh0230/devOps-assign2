package sdp;

import java.util.*;
import org.apache.log4j.Logger;

public class Main {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(Main.class.getName());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the program to run:");
		System.out.println("1. Array Min Max");
		System.out.println("2. Infix to Postfix");
		System.out.println("3. Plaindrome");
		System.out.println("4. Prime Counter");
		int ch = sc.nextInt();
		
		ArrMinMax minMax = new ArrMinMax();
		InfixPostFix postFix = new InfixPostFix();
		Palindrome pal = new Palindrome();
		PrimeCounter primecount = new PrimeCounter();
		
//		minMax.mainFunc();
//		postFix.mainFunc();
//		pal.mainFunc();
//		primecount.mainFunc();
		
		switch(ch) {
		case 1: minMax.mainFunc();;break;
		case 2: postFix.mainFunc();break;
		case 3: pal.mainFunc();break;
		case 4: primecount.mainFunc();break;
		default: log.info("Invalid choice");
		}
		
	}
}
