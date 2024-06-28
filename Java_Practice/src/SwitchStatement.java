import java.util.Scanner;
public class SwitchStatement {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character:");  
		
		char num=scan.next().charAt(0);
		
		switch(num) {
		case 'a','e','i','o','u','A','E','I','O','U':
			System.out.println("VOWELS");
			break;
			default:
				System.out.println("CONSONANT");
			
		}
		
	}

}
