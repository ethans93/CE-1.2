import java.util.Scanner;
public class HelloUsername {
	public static void main(String [] args){
		String x1,x2;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter your username:");
		x1 = keyboard.next();
		System.out.println();
		
		System.out.println("Please enter your password:");
		x2 = keyboard.next();
		System.out.println();
	
		System.out.print("Hello " + x1 + ", ");
		System.out.println("Welcome to CSC200 class! and Your password is " + x2);
		
	}

}
