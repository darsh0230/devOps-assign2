package sdp;

//import org.apache.log4j.Logger;

public class Palindrome {
	public void mainFunc(){
		System.out.println(checkPalindrome(45654));
	}
	
	public static boolean checkPalindrome(int n) {
		int r,sum=0,temp;     
		temp=n;    
		while(n>0){
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum) {
			System.out.println("palindrome number ");
			return true;
		}else {
			System.out.println("not palindrome"); 
			return false;
		}
      
	}
}
