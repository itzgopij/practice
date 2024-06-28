import java.util.Scanner;

public class PalindromeOrNot1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter:");
		String original =scan.next();
		String reverse="";
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
		
		System.out.println(reverse);

	}

}
